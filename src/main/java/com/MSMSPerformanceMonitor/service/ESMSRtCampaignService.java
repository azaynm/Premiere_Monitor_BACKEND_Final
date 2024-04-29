package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.esms_realtime.model.SMSRealtimeQueueModel;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSRtCampaign;
import com.MSMSPerformanceMonitor.smsbulkim.repository.ESMSRtCampaignRepository;



@Service
public class ESMSRtCampaignService {

	@Autowired
    private ESMSRtCampaignRepository eSMSRtCampaignRepository;
	
	public String fetchCampaign(String campKey) {
		return eSMSRtCampaignRepository.fetchMessage(campKey);
	}
}
