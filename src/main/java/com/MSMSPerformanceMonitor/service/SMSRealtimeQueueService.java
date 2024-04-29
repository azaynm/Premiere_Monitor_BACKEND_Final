package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.esms_realtime.model.SMSRealtimeQueueModel;
import com.MSMSPerformanceMonitor.esms_realtime.repository.SMSRealtimeQueueRepository;
import com.MSMSPerformanceMonitor.sms.model.SMSQueueModel;
import com.MSMSPerformanceMonitor.sms.repository.SMSQueueRepository;


@Service
public class SMSRealtimeQueueService {
	
    @Autowired
    private SMSRealtimeQueueRepository sMSRealtimeQueueRepository;
    
    public List<SMSRealtimeQueueModel> fetchCampaignQueue(Integer table, String number) {
    	if(table.equals(1)) {
    		return sMSRealtimeQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(2)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(3)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(4)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(5)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(6)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(7)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(8)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(9)){
    		return sMSRealtimeQueueRepository.fetchSmsQueue9(number);
    	}
    	else {
    		return sMSRealtimeQueueRepository.fetchSmsQueue9(number);
    	}
    }
}