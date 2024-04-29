package com.MSMSPerformanceMonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MSMSPerformanceMonitor.realtime_backup.model.SMSRealtimeQueueBackupModel;
import com.MSMSPerformanceMonitor.service.SMSRealtimeQueueBackupService;


@RestController
@RequestMapping("/api")
public class SMSRealtimeQueueBackupController {
	
	@Autowired
    private SMSRealtimeQueueBackupService sMSRealtimeQueueBackupService;
	
	@GetMapping("/fetch-sms-realtime-backup-queue")
    public ResponseEntity<List<SMSRealtimeQueueBackupModel>> getAllBulkSms(@RequestParam("table") Integer table, @RequestParam("number") String number) {
    	
        List<SMSRealtimeQueueBackupModel> queueData = sMSRealtimeQueueBackupService.fetchCampaignQueue(table, number);
        return ResponseEntity.ok().body(queueData);
    }
	
	
	
}

