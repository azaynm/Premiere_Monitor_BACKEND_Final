package com.MSMSPerformanceMonitor.realtime_backup.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.realtime_backup.model.SMSRealtimeQueueBackupModel;

import org.springframework.data.jpa.repository.Query;


@Repository
public interface SMSRealtimeQueueBackupRepository extends CrudRepository<SMSRealtimeQueueBackupModel, Integer> {

	@Query(value = "SELECT * FROM sms_queue1 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue1(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue2 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue2(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue3 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue3(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue4 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue4(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue5 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue5(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue6 WHERE receiver_mob =:number", nativeQuery = true)
   List<SMSRealtimeQueueBackupModel> fetchSmsQueue6(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue7 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue7(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue8 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue8(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue9 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue9(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue10 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueBackupModel> fetchSmsQueue10(@Param("number") String number);
}
