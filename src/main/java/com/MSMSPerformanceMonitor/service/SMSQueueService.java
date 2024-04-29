package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.sms.model.SMSQueueModel;
import com.MSMSPerformanceMonitor.sms.repository.SMSQueueRepository;


@Service
public class SMSQueueService {
    @Autowired
    private SMSQueueRepository sMSQueueRepository;
    
    public List<SMSQueueModel> fetchCampaignQueue(Integer table, String number) {
    	if(table.equals(1)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(2)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(3)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(4)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(5)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(6)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(7)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(8)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(9)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(10)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(11)) {
    		return sMSQueueRepository.fetchSmsQueue11(number);
    	}
    	else if(table.equals(12)){
    		return sMSQueueRepository.fetchSmsQueue12(number);
    	}    	
    	else if(table.equals(13)){
    		return sMSQueueRepository.fetchSmsQueue13(number);
    	}
    	else if(table.equals(14)){
    		return sMSQueueRepository.fetchSmsQueue14(number);
    	}
    	else if(table.equals(15)){
    		return sMSQueueRepository.fetchSmsQueue15(number);
    	}
    	
    	else if(table.equals(16)){
    		return sMSQueueRepository.fetchSmsQueue16(number);
    	}
    	
    	else if(table.equals(17)){
    		return sMSQueueRepository.fetchSmsQueue17(number);
    	}
    	
    	else if(table.equals(18)){
    		return sMSQueueRepository.fetchSmsQueue18(number);
    	}
    	
    	else if(table.equals(19)){
    		return sMSQueueRepository.fetchSmsQueue19(number);
    	}
    	
    	else if(table.equals(20)){
    		return sMSQueueRepository.fetchSmsQueue20(number);
    	}
    	
    	if(table.equals(21)) {
    		return sMSQueueRepository.fetchSmsQueue21(number);
    	}
    	else if(table.equals(22)){
    		return sMSQueueRepository.fetchSmsQueue22(number);
    	}    	
    	else if(table.equals(23)){
    		return sMSQueueRepository.fetchSmsQueue23(number);
    	}
    	else if(table.equals(24)){
    		return sMSQueueRepository.fetchSmsQueue24(number);
    	}
    	else if(table.equals(25)){
    		return sMSQueueRepository.fetchSmsQueue25(number);
    	}
    	
    	else if(table.equals(26)){
    		return sMSQueueRepository.fetchSmsQueue26(number);
    	}
    	
    	else if(table.equals(27)){
    		return sMSQueueRepository.fetchSmsQueue27(number);
    	}
    	
    	else if(table.equals(28)){
    		return sMSQueueRepository.fetchSmsQueue28(number);
    	}
    	
    	else if(table.equals(29)){
    		return sMSQueueRepository.fetchSmsQueue29(number);
    	}
    	
    	else if(table.equals(30)){
    		return sMSQueueRepository.fetchSmsQueue29(number);
    	}
 
    	else if(table.equals(31)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(32)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(33)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(34)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(35)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(36)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(37)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(38)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(39)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(40)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(41)){
    		return sMSQueueRepository.fetchSmsQueue29(number);
    	}

    	else if(table.equals(42)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(43)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(44)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(45)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(46)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(47)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(48)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(49)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(50)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(51)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(52)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(53)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(54)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(55)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(56)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(57)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(58)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(59)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(60)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}
 
    	else if(table.equals(61)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(62)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(63)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(64)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(65)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(66)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(67)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(68)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(69)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(70)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}
 
    	else if(table.equals(71)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(72)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(73)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(74)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(75)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(76)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(77)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(78)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(79)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(80)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(81)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(82)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(83)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(84)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(85)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(86)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(87)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(88)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(89)){
    		return sMSQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(90)){
    		return sMSQueueRepository.fetchSmsQueue10(number);
    	}

    	else if(table.equals(91)) {
    		return sMSQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(92)){
    		return sMSQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(93)){
    		return sMSQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(94)){
    		return sMSQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(95)){
    		return sMSQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(96)){
    		return sMSQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(97)){
    		return sMSQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(98)){
    		return sMSQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else {
    		return sMSQueueRepository.fetchSmsQueue99(number);
    	}
    	
	}

  
}


