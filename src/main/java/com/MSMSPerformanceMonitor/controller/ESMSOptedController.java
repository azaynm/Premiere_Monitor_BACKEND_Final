package com.MSMSPerformanceMonitor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MSMSPerformanceMonitor.bulk_backup.model.SMSBulkQueueBackupModel;
import com.MSMSPerformanceMonitor.service.BulkSmsService;
import com.MSMSPerformanceMonitor.service.ESMSOptedService;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSOpted;

@Controller
public class ESMSOptedController {
	@Autowired
    private ESMSOptedService eSMSOptedService;
	
	 @GetMapping("/fetch-opted-list")
	    public ResponseEntity<ArrayList<ESMSOpted>> getOptedList(@RequestParam("number") String number) {
		 ArrayList<ESMSOpted> entity = eSMSOptedService.fetchOpted(number);
	        return ResponseEntity.ok(entity);
	    }
}
