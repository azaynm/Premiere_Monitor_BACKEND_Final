package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.smsbulk.model.BulkSmsModel;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;
import com.MSMSPerformanceMonitor.smsbulk.model.SMSBulkQueueModel;
import com.MSMSPerformanceMonitor.smsbulk.repository.BulkSmsRepository;
import com.MSMSPerformanceMonitor.smsbulk.repository.SMSBulkQueueRepository;

@Service
public class SMSBulkQueueService {
    @Autowired
    private SMSBulkQueueRepository sMSBulkQueueRepository;
    
    public List<SMSBulkQueueModel> fetchByNumber(Integer table, String number) {
    	if(table.equals(1)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(2)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(3)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(4)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(5)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(6)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(7)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(8)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(9)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(10)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(11)) {
    		return sMSBulkQueueRepository.fetchSmsQueue11(number);
    	}
    	else if(table.equals(12)){
    		return sMSBulkQueueRepository.fetchSmsQueue12(number);
    	}    	
    	else if(table.equals(13)){
    		return sMSBulkQueueRepository.fetchSmsQueue13(number);
    	}
    	else if(table.equals(14)){
    		return sMSBulkQueueRepository.fetchSmsQueue14(number);
    	}
    	else if(table.equals(15)){
    		return sMSBulkQueueRepository.fetchSmsQueue15(number);
    	}
    	
    	else if(table.equals(16)){
    		return sMSBulkQueueRepository.fetchSmsQueue16(number);
    	}
    	
    	else if(table.equals(17)){
    		return sMSBulkQueueRepository.fetchSmsQueue17(number);
    	}
    	
    	else if(table.equals(18)){
    		return sMSBulkQueueRepository.fetchSmsQueue18(number);
    	}
    	
    	else if(table.equals(19)){
    		return sMSBulkQueueRepository.fetchSmsQueue19(number);
    	}
    	
    	else if(table.equals(20)){
    		return sMSBulkQueueRepository.fetchSmsQueue20(number);
    	}
    	
    	if(table.equals(21)) {
    		return sMSBulkQueueRepository.fetchSmsQueue21(number);
    	}
    	else if(table.equals(22)){
    		return sMSBulkQueueRepository.fetchSmsQueue22(number);
    	}    	
    	else if(table.equals(23)){
    		return sMSBulkQueueRepository.fetchSmsQueue23(number);
    	}
    	else if(table.equals(24)){
    		return sMSBulkQueueRepository.fetchSmsQueue24(number);
    	}
    	else if(table.equals(25)){
    		return sMSBulkQueueRepository.fetchSmsQueue25(number);
    	}
    	
    	else if(table.equals(26)){
    		return sMSBulkQueueRepository.fetchSmsQueue26(number);
    	}
    	
    	else if(table.equals(27)){
    		return sMSBulkQueueRepository.fetchSmsQueue27(number);
    	}
    	
    	else if(table.equals(28)){
    		return sMSBulkQueueRepository.fetchSmsQueue28(number);
    	}
    	
    	else if(table.equals(29)){
    		return sMSBulkQueueRepository.fetchSmsQueue29(number);
    	}
    	
    	else if(table.equals(30)){
    		return sMSBulkQueueRepository.fetchSmsQueue29(number);
    	}
 
    	else if(table.equals(31)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(32)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(33)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(34)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(35)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(36)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(37)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(38)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(39)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(40)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(41)){
    		return sMSBulkQueueRepository.fetchSmsQueue29(number);
    	}

    	else if(table.equals(42)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(43)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(44)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(45)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(46)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(47)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(48)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(49)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(50)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(51)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(52)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(53)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(54)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(55)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(56)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(57)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(58)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(59)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(60)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}
 
    	else if(table.equals(61)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(62)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(63)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(64)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(65)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(66)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(67)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(68)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(69)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(70)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}
 
    	else if(table.equals(71)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(72)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(73)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(74)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(75)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(76)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(77)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(78)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(79)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(80)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(81)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(82)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(83)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(84)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(85)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(86)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(87)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(88)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(89)){
    		return sMSBulkQueueRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(90)){
    		return sMSBulkQueueRepository.fetchSmsQueue10(number);
    	}

    	else if(table.equals(91)) {
    		return sMSBulkQueueRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(92)){
    		return sMSBulkQueueRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(93)){
    		return sMSBulkQueueRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(94)){
    		return sMSBulkQueueRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(95)){
    		return sMSBulkQueueRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(96)){
    		return sMSBulkQueueRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(97)){
    		return sMSBulkQueueRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(98)){
    		return sMSBulkQueueRepository.fetchSmsQueue8(number);
    	}
    	
    	else {
    		return sMSBulkQueueRepository.fetchSmsQueue99(number);
    	}	
	}
}

