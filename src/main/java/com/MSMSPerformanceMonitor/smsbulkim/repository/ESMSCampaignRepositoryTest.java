package com.MSMSPerformanceMonitor.smsbulkim.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSCampaign;

public interface ESMSCampaignRepositoryTest extends JpaRepository<ESMSCampaign, Integer> {
	
	@Query(value = "SELECT * FROM esms_campaign", nativeQuery = true)
	Page<ESMSCampaign> findAllWithPagination(Pageable pageable);
}
