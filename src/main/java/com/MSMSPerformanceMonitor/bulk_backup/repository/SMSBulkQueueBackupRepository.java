package com.MSMSPerformanceMonitor.bulk_backup.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.bulk_backup.model.SMSBulkQueueBackupModel;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SMSBulkQueueBackupRepository extends CrudRepository<SMSBulkQueueBackupModel, Integer> {
	
	
	@Query(value = "SELECT * FROM sms_queue1 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue1(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue2 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue2(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue3 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue3(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue4 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue4(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue5 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue5(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue6 WHERE receiver_mob =:number", nativeQuery = true)
   List<SMSBulkQueueBackupModel> fetchSmsQueue6(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue7 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue7(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue8 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue8(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue9 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue9(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue10 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue10(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue11 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue11(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue12 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue12(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue13 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue13(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue14 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue14(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue15 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue15(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue16 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue16(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue17 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue17(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue18 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue18(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue19 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue19(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue20 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue20(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue21 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue21(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue22 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue22(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM sms_queue23 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue23(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue24 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue24(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue25 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue25(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue26 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue26(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue27 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue27(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue28 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue28(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue29 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue29(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue30 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue30(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue31 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue31(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue32 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue32(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue33 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue33(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue34 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue34(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue35 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue35(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue36 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue36(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue37 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue37(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue38 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue38(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue39 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue39(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue40 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue40(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue41 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue41(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue42 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue42(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue43 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue43(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue44 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue44(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue45 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue45(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue46 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue46(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue47 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue47(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue48 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue48(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue49 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue49(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue50 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue50(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue51 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue51(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue52 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue52(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue53 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue53(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue54 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue54(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue55 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue55(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue56 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue56(@Param("number") String number);
	
	
	@Query(value = "SELECT * FROM sms_queue57 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue57(@Param("number") String number);

	@Query(value = "SELECT * FROM sms_queue58 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue58(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue59 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue59(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue60 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue60(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue61 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue61(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue62 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue62(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue63 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue63(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue64 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue64(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue65 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue65(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue66 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue66(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue67 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue67(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue68 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue68(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue69 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue69(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue70 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue70(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue71 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue71(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue72 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue72(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue73 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue73(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue74 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue74(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue75 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue75(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue76 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue76(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue77 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue77(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue78 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue78(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue79 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue79(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue80 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue80(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue81 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue81(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue82 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue82(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue83 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue83(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue84 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue84(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue85 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue85(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue86 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue86(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue87 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue87(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue88 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue88(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue89 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue89(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue90 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue90(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue91 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue91(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue92 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue92(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue93 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue93(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue94 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue94(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue95 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue95(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue96 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue96(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue97 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue97(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue98 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue98(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue99 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSBulkQueueBackupModel> fetchSmsQueue99(@Param("number") String number);
}


