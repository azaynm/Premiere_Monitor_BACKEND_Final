//package com.MSMSPerformanceMonitor.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
//import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;
//import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSCampaign;
//import com.MSMSPerformanceMonitor.smsbulkim.repository.CompanyProfileRepository;
//import com.MSMSPerformanceMonitor.smsbulkim.repository.ESMSCampaignRepository;
//
//@Service
//public class ESMSCampaignService {
//
//	@Autowired
//    private ESMSCampaignRepository eSMSCampaignRepository;
//	
//	
//	
//	public List<ESMSCampaign> getCompletedCampaign() {
//        return eSMSCampaignRepository.fetchCompletedCampaign();
//        
//    }
//	
//	
//	public String getMessage(String campaignKey) {
//		return eSMSCampaignRepository.fetchMessage(campaignKey);
//	}
//}
//
//



package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSCampaign;
import com.MSMSPerformanceMonitor.smsbulkim.repository.CompanyProfileRepository;
import com.MSMSPerformanceMonitor.smsbulkim.repository.ESMSCampaignRepository;
import com.MSMSPerformanceMonitor.smsbulkim.repository.ESMSCampaignRepositoryTest;

@Service
public class ESMSCampaignService {

	@Autowired
    private ESMSCampaignRepository eSMSCampaignRepository;
	
	@Autowired
    private ESMSCampaignRepositoryTest eSMSCampaignRepositoryTest;
	
	
	public List<ESMSCampaign> getCompletedCampaign() {
		
		Pageable pageable = PageRequest.of(1, 10);
		return eSMSCampaignRepositoryTest.findAllWithPagination(pageable).getContent();
    }
	
	public String getMessage(String campaignKey) {
		return eSMSCampaignRepository.fetchMessage(campaignKey);
	}
}


