package com.MSMSPerformanceMonitor.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MSMSPerformanceMonitor.service.SMSLoadSummeryCopyService;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;

@Controller
public class SMSLoadSummeryCopyController {
	
	@Autowired
    private SMSLoadSummeryCopyService sMSLoadSummeryCopyService;

	 @GetMapping("/fetch-load-summery")
	    public ResponseEntity<List<SMSLoadSummeryCopy>> getAllBulkSmsProfiles() {
	    	
	        List<SMSLoadSummeryCopy> bulkSmsProfiles = sMSLoadSummeryCopyService.getAllEfetchdata();
	        return ResponseEntity.ok().body(bulkSmsProfiles);
	    }
	 
	 @GetMapping("/fetch-campaign-load")
	    public ResponseEntity<List<SMSLoadSummeryCopy>> getCampaignLoadSummery(@RequestParam("campKey") String campKey) {
		 List<SMSLoadSummeryCopy> updatedEntity = sMSLoadSummeryCopyService.findByCampaign(campKey);
	        return ResponseEntity.ok(updatedEntity);
	    }
	 
	 
}
