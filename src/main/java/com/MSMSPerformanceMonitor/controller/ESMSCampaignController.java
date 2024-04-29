package com.MSMSPerformanceMonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MSMSPerformanceMonitor.dto.MessageResponse;
import com.MSMSPerformanceMonitor.service.BulkSmsService;
import com.MSMSPerformanceMonitor.service.ESMSCampaignService;
import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSCampaign;

@Controller
public class ESMSCampaignController {
	
	@Autowired
    private ESMSCampaignService eSMSCampaignService;
	
	

	@GetMapping("/fetch-completed-campaigns")
    public ResponseEntity<List<ESMSCampaign>> getAllBulkSms() {
    	
        List<ESMSCampaign> bulkSmsProfiles = eSMSCampaignService.getCompletedCampaign();
        return ResponseEntity.ok().body(bulkSmsProfiles);
    }
	
	@GetMapping("/fetch-message")
	public ResponseEntity<MessageResponse> getCampaignLoadSummery(@RequestParam("campaignKey") String campaignKey) {
        String entity = eSMSCampaignService.getMessage(campaignKey);

        // Create a MessageResponse object and set the entity as the message
        MessageResponse messageResponse = new MessageResponse(entity);

        return ResponseEntity.ok(messageResponse);
    }
	
	
}
