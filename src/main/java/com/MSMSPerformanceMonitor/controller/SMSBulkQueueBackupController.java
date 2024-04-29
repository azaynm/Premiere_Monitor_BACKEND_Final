package com.MSMSPerformanceMonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MSMSPerformanceMonitor.bulk_backup.model.SMSBulkQueueBackupModel;
import com.MSMSPerformanceMonitor.service.SMSBulkQueueBackupService;
import com.MSMSPerformanceMonitor.service.SMSBulkQueueService;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSBulkQueueModel;

@RestController
@RequestMapping("/api")
public class SMSBulkQueueBackupController {
	
	@Autowired
    private SMSBulkQueueBackupService sMSBulkQueueBackupService;

	
	
	@GetMapping("/fetch-bulk-numberwise")
    public ResponseEntity<List<SMSBulkQueueBackupModel>> getByNumber(@RequestParam("table") Integer table, @RequestParam("number") String number) {
    	
        List<SMSBulkQueueBackupModel> queueData = sMSBulkQueueBackupService.fetchByNumber(table, number);
        return ResponseEntity.ok().body(queueData);
    }
	
}

