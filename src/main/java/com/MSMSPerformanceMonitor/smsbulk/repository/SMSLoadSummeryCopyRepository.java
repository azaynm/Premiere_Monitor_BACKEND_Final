package com.MSMSPerformanceMonitor.smsbulk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;



@Repository
public interface SMSLoadSummeryCopyRepository extends CrudRepository<SMSLoadSummeryCopy, Integer>{
	@Query(value = "SELECT * FROM SMS_Load_summery WHERE ttl_count >= 25000 AND date_time LIKE '2023-03-29%' ORDER BY date_time ASC;", nativeQuery = true)
    List<SMSLoadSummeryCopy> findAllByCustomQuery();
	
	@Query(value = "SELECT * FROM SMS_Load_summery WHERE camp_key = :key ORDER BY date_time DESC LIMIT 4", nativeQuery = true)
    List<SMSLoadSummeryCopy> findByCampaignKey(@Param("key") String key);
    
    @Query(value = "SELECT * FROM SMS_Load_summery WHERE camp_key = :value", nativeQuery = true)
    List<SMSLoadSummeryCopy> findAndUpdateByCustomQuery(@Param("value") String value);
    
    
    
    Optional<SMSLoadSummeryCopy> findByCampKey(String campKey);
    
}
