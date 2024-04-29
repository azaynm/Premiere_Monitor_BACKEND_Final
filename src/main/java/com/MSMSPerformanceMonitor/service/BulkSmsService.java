package com.MSMSPerformanceMonitor.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulk.repository.BulkSmsRepository;

import javax.persistence.EntityNotFoundException;

@Service
public class BulkSmsService {
	
	@Autowired
    private BulkSmsRepository bulkSmsRepository;

    public List<BulkSmsModel> getAllEfetchdata() {
        return bulkSmsRepository.findAllByCustomQuery();
    }
    
    
    public static Date calculateEndTime(String addedDT, long valPeriod) {
    	// Convert addedDT to a Java Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = null;
        try {
            startDate = dateFormat.parse(addedDT);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Convert valPeriod to milliseconds and add it to the start date
        Date endDate = new Date(startDate.getTime() + valPeriod * 1000);

        return endDate;
    }
    
    
//    public BulkSmsModel reschedule(String campKey, String date) {
//    	
//    	BulkSmsModel entityToUpdate1 = bulkSmsRepository.findByCampKey(campKey)
//                .orElseThrow(() -> new EntityNotFoundException("Entity not found with camp_key: " + campKey));
//
//		String addedDt = entityToUpdate1.getAddedDT();
//        Integer valPeriod = entityToUpdate1.getValPeriod(); 
//        SimpleDateFormat maxDate = calculateEndTime(addedDt, valPeriod);
//        
//    	
//    	List<BulkSmsModel> entityToUpdateList = bulkSmsRepository.findAndUpdateByCustomQuery(campKey);
//
//        if (entityToUpdateList.isEmpty()) {
//            
//            return null;
//        }
//        
//        
//
//        BulkSmsModel entityToUpdate = entityToUpdateList.get(0);
//        
//        entityToUpdate.setActive(0);
//        entityToUpdate.setProfStatus(2);
//        entityToUpdate.setRestartDT(date);
//        
//        return bulkSmsRepository.save(entityToUpdate);
//    }
    
    
public BulkSmsModel reschedule(String campKey, String date) {
    	
	BulkSmsModel entityToUpdate1 = bulkSmsRepository.findByCampKey(campKey)
            .orElseThrow(() -> new EntityNotFoundException("Entity not found with camp_key: " + campKey));

    String addedDt = entityToUpdate1.getAddedDT();
    Integer valPeriod = entityToUpdate1.getValPeriod(); 
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    // Calculate maxDate
    Date maxDate = calculateEndTime(addedDt, valPeriod);
    
    // Parse the input date string to a Date object
    Date inputDate;
    try {
        inputDate = dateFormat.parse(date);
    } catch (ParseException e) {
        // Handle parsing exception
        e.printStackTrace();
        return null;
    }

    // Check if the input date is between the current time and maxDate
    Date currentDate = new Date();
    if (inputDate.after(currentDate) && inputDate.before(maxDate)) {

        List<BulkSmsModel> entityToUpdateList = bulkSmsRepository.findAndUpdateByCustomQuery(campKey);

        if (entityToUpdateList.isEmpty()) {
            return null; // or throw an exception or handle the case when no entities are found
        }

        BulkSmsModel entityToUpdate = entityToUpdateList.get(0);

        entityToUpdate.setActive(0);
        entityToUpdate.setProfStatus(2);
        entityToUpdate.setRestartDT(date);

        return bulkSmsRepository.save(entityToUpdate);
    } else {
        // Handle the case when the input date is not within the specified range
        return null;
    }
    }
    
    public BulkSmsModel stop(String campKey) {
        List<BulkSmsModel> entityToUpdateList = bulkSmsRepository.findAndUpdateByCustomQuery(campKey);
        if (entityToUpdateList.isEmpty()) {
            // handle case where no entity is found for the given campKey
            return null;
        }
        BulkSmsModel entityToUpdate = entityToUpdateList.get(0);

        entityToUpdate.setActive(0);
        entityToUpdate.setProfStatus(3);
        return bulkSmsRepository.save(entityToUpdate);
    }
    
    public BulkSmsModel active(String campKey) {
        List<BulkSmsModel> entityToUpdateList = bulkSmsRepository.findAndUpdateByCustomQuery(campKey);
        if (entityToUpdateList.isEmpty()) {
            // handle case where no entity is found for the given campKey
            return null;
        }
        BulkSmsModel entityToUpdate = entityToUpdateList.get(0);

        entityToUpdate.setActive(1);
        entityToUpdate.setProfStatus(1);

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format the current date and time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        entityToUpdate.setRestartDT(formattedDateTime);

        return bulkSmsRepository.save(entityToUpdate);
    }

    
    public BulkSmsModel speedupField(String campKey, Integer value) {
        BulkSmsModel entityToUpdate = bulkSmsRepository.findByCampKey(campKey)
                .orElseThrow(() -> new EntityNotFoundException("Entity not found with camp_key: " + campKey));

        entityToUpdate.setThrputMps(value);
        return bulkSmsRepository.save(entityToUpdate);
    }



}
