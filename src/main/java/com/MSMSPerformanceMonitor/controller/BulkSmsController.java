package com.MSMSPerformanceMonitor.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.MSMSPerformanceMonitor.service.BulkSmsService;
import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulk.model.RescheduleRequest;

@Controller
public class BulkSmsController {
	
	@Autowired
    private BulkSmsService bulkSmsService;
	
	@GetMapping("/fetchdata")
    public ResponseEntity<List<BulkSmsModel>> getAllBulkSms() {
    	
        List<BulkSmsModel> bulkSmsProfiles = bulkSmsService.getAllEfetchdata();
        return ResponseEntity.ok().body(bulkSmsProfiles);
    }

	
	@PutMapping("/reschedule/")
    public ResponseEntity<BulkSmsModel> reschedule(@RequestBody RescheduleRequest rescheduleRequest) {
        BulkSmsModel updatedEntity = bulkSmsService.reschedule(rescheduleRequest.getCampKey(), rescheduleRequest.getDate());
        
        if(updatedEntity!=null) {
        	return ResponseEntity.ok(updatedEntity);
        }else {
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        
        
    }
    
    @PutMapping("/stop/")
    public ResponseEntity<BulkSmsModel> stop(@RequestParam("campKey") String campKey) {
    	BulkSmsModel updatedEntity = bulkSmsService.stop(campKey);
        return ResponseEntity.ok(updatedEntity);
    }
    
    @PutMapping("/active/")
    public ResponseEntity<BulkSmsModel> active(@RequestParam("campKey") String campKey) {
    	BulkSmsModel updatedEntity = bulkSmsService.active(campKey);
        return ResponseEntity.ok(updatedEntity);
    }
    
    @PutMapping("/speedup/")
    public ResponseEntity<BulkSmsModel> speedupField(@RequestParam("campKey") String campKey, @RequestParam("value") Integer value) {
    	BulkSmsModel speedupEntity = bulkSmsService.speedupField(campKey, value);
        return ResponseEntity.ok(speedupEntity);
    }

}
