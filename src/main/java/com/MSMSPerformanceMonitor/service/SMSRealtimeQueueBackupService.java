package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MSMSPerformanceMonitor.realtime_backup.model.SMSRealtimeQueueBackupModel;
import com.MSMSPerformanceMonitor.realtime_backup.repository.SMSRealtimeQueueBackupRepository;



@Service
public class SMSRealtimeQueueBackupService {
	
    @Autowired
    private SMSRealtimeQueueBackupRepository sMSRealtimeQueueBackupRepository;
    
    public List<SMSRealtimeQueueBackupModel> fetchCampaignQueue(Integer table, String number) {
    	if(table.equals(1)) {
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(2)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(3)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(4)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(5)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(6)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(7)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(8)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(9)){
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue9(number);
    	}
    	else {
    		return sMSRealtimeQueueBackupRepository.fetchSmsQueue9(number);
    	}
    }
}
