package com.MSMSPerformanceMonitor.smsbulkim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSBulkQueueModel;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSCampaign;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSRtCampaign;

public interface ESMSRtCampaignRepository extends CrudRepository<ESMSRtCampaign, Integer>{
	
	@Query(value = "SELECT msg FROM esms_rt_campaign WHERE camp_key = :key", nativeQuery = true)
    String fetchMessage(@Param("key") String key);
	
	
}

