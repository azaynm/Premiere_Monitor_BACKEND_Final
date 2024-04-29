package com.MSMSPerformanceMonitor.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;
import com.MSMSPerformanceMonitor.smsbulk.repository.SMSLoadSummeryCopyRepository;

import javax.persistence.EntityNotFoundException;

import java.util.Calendar;

@Service
public class SMSLoadSummeryCopyService {
	
	@Autowired
    private SMSLoadSummeryCopyRepository sMSLoadSummeryCopyRepository;
	
	public List<SMSLoadSummeryCopy> getAllEfetchdata() {
        return sMSLoadSummeryCopyRepository.findAllByCustomQuery();
    }
	
	public List<SMSLoadSummeryCopy> findByCampaign(String campKey) {
		return sMSLoadSummeryCopyRepository.findByCampaignKey(campKey);
	}

}
