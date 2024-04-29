package com.MSMSPerformanceMonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MSMSPerformanceMonitor.esms_realtime.model.SMSRealtimeQueueModel;
import com.MSMSPerformanceMonitor.service.SMSBulkQueueService;
import com.MSMSPerformanceMonitor.service.SMSQueueService;
import com.MSMSPerformanceMonitor.service.SMSRealtimeQueueService;
import com.MSMSPerformanceMonitor.sms.model.SMSQueueModel;
import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSBulkQueueModel;

@RestController
@RequestMapping("/api")
public class SMSRealtimeQueueController {
	
	@Autowired
    private SMSRealtimeQueueService sMSRealtimeQueueService;
	
	@GetMapping("/fetch-sms-realtime-queue")
    public ResponseEntity<List<SMSRealtimeQueueModel>> getAllBulkSms(@RequestParam("table") Integer table, @RequestParam("number") String number) {
    	
        List<SMSRealtimeQueueModel> queueData = sMSRealtimeQueueService.fetchCampaignQueue(table, number);
        return ResponseEntity.ok().body(queueData);
    }
	
	
	
}
