package com.MSMSPerformanceMonitor.smsbulk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSBulkQueueModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;

@Repository
public interface SMSBulkQueueRepository extends CrudRepository<SMSBulkQueueModel, Integer> {
	
	
	@Query(value = "SELECT * FROM sms_queue1 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue1(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue2 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue2(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue3 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue3(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue4 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue4(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue5 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue5(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue6 WHERE receiver_mob =:number", nativeQuery = true)
   List<SMSBulkQueueModel> fetchSmsQueue6(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue7 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue7(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue8 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue8(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue9 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue9(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue10 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue10(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue11 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue11(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue12 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue12(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue13 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue13(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue14 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue14(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue15 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue15(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue16 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue16(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue17 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue17(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue18 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue18(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue19 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue19(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue20 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue20(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue21 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue21(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue22 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue22(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM sms_queue23 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue23(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue24 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue24(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue25 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue25(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue26 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue26(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue27 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue27(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue28 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue28(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue29 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue29(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue30 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue30(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue31 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue31(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue32 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue32(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue33 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue33(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue34 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue34(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue35 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue35(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue36 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue36(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue37 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue37(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue38 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue38(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue39 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue39(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue40 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue40(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue41 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue41(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue42 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue42(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue43 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue43(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue44 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue44(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue45 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue45(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue46 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue46(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue47 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue47(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue48 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue48(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue49 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue49(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue50 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue50(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue51 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue51(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue52 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue52(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue53 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue53(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue54 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue54(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue55 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue55(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue56 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue56(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM sms_queue57 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue57(@Param("number") String number);

	@Query(value = "SELECT * FROM sms_queue58 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue58(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue59 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue59(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue60 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue60(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue61 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue61(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue62 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue62(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue63 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue63(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue64 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue64(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue65 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue65(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue66 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue66(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue67 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue67(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue68 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue68(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue69 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue69(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue70 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue70(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue71 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue71(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue72 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue72(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue73 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue73(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue74 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue74(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue75 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue75(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue76 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue76(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue77 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue77(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue78 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue78(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue79 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue79(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue80 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue80(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue81 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue81(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue82 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue82(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue83 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue84(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue85 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue85(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue86 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue86(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue87 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue87(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue88 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue88(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue89 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue89(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue90 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue90(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue91 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue91(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue92 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue92(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue93 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue93(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue94 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue94(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue95 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue95(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue96 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue96(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue97 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue97(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue98 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue98(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue99 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueModel> fetchSmsQueue99(@Param("number") String number);
}

