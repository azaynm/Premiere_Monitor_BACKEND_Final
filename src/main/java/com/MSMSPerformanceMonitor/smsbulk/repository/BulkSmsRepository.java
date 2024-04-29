package com.MSMSPerformanceMonitor.smsbulk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;

@Repository
public interface BulkSmsRepository extends CrudRepository<BulkSmsModel, Integer>{

	@Query(value = "SELECT * FROM bulk_sms_profile", nativeQuery = true)
    List<BulkSmsModel> findAllByCustomQuery();
	
	@Query(value = "SELECT * FROM bulk_sms_profile WHERE camp_key = :value", nativeQuery = true)
    List<BulkSmsModel> findAndUpdateByCustomQuery(@Param("value") String value);
    
    Optional<BulkSmsModel> findByCampKey(String campKey);
}
