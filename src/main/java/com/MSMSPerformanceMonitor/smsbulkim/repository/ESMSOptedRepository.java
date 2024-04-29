package com.MSMSPerformanceMonitor.smsbulkim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSCampaign;
import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSOpted;

@Repository
public interface ESMSOptedRepository extends CrudRepository<ESMSOpted, Integer>{
	@Query(value = "SELECT * FROM esms_optout_list_0 WHERE Mobile_Number = :number", nativeQuery = true)
    List<ESMSOpted> fetchOpted0(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_0_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted0Bk(@Param("number") String number);
	

	@Query(value = "SELECT * FROM esms_optout_list_1 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted1(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_1_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted1Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_2 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted2(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_2_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted2Bk(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_3 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted3(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_3_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted3Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_4 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted4(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_4_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted4Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_5 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted5(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_5_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted5Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_6 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted6(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_6_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted6Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_7 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted7(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_7_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted7Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_8 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted8(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_8_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted8Bk(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM esms_optout_list_9 WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted9(@Param("number") String number);
	
	@Query(value = "SELECT * FROM esms_optout_list_9_bk WHERE Mobile_Number = :number", nativeQuery = true)
	List<ESMSOpted> fetchOpted9Bk(@Param("number") String number);
}
