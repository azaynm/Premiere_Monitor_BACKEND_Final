package com.MSMSPerformanceMonitor.esms_realtime.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;

import com.MSMSPerformanceMonitor.esms_realtime.model.SMSRealtimeQueueModel;


@Repository
public interface SMSRealtimeQueueRepository extends CrudRepository<SMSRealtimeQueueModel, Integer> {

	@Query(value = "SELECT * FROM sms_queue1 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue1(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue2 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue2(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue3 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue3(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue4 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue4(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue5 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue5(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue6 WHERE receiver_mob =:number", nativeQuery = true)
   List<SMSRealtimeQueueModel> fetchSmsQueue6(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue7 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue7(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue8 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue8(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue9 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue9(@Param("number") String number);
	
	@Query(value = "SELECT * FROM sms_queue10 WHERE receiver_mob =:number", nativeQuery = true)
    List<SMSRealtimeQueueModel> fetchSmsQueue10(@Param("number") String number);
}
