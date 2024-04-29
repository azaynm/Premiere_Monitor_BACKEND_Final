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

public interface ESMSCampaignRepository extends CrudRepository<ESMSCampaign, Integer>{

	@Query(value = "SELECT * FROM esms_campaign WHERE excel_prepros=0 AND camp_prepros=3 AND camp_pros_mode=2 AND camp_pros_status=2", nativeQuery = true)
	List<ESMSCampaign> fetchCompletedCampaign();
	
	@Query(value = "SELECT msg FROM esms_campaign WHERE camp_key = :key", nativeQuery = true)
    String fetchMessage(@Param("key") String key);
	
	
}
