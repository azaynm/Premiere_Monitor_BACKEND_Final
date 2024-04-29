package com.MSMSPerformanceMonitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MSMSPerformanceMonitor.service.CompanyProfileService;
import com.MSMSPerformanceMonitor.service.SMSLoadSummeryCopyService;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;

@Controller
public class CompanyProfileController {
	
	@Autowired
    private CompanyProfileService companyProfileService;

	 @GetMapping("/fetch-company-name")
	    public ResponseEntity<CompanyProfile> getCampaignLoadSummery(@RequestParam("profile") Integer profile) {
		 CompanyProfile entity = companyProfileService.getCompanyName(profile);
	        return ResponseEntity.ok(entity);
	    }
}


