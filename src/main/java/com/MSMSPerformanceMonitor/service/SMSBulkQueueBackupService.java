package com.MSMSPerformanceMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.bulk_backup.model.SMSBulkQueueBackupModel;
import com.MSMSPerformanceMonitor.bulk_backup.repository.SMSBulkQueueBackupRepository;


@Service
public class SMSBulkQueueBackupService {
    @Autowired
    private SMSBulkQueueBackupRepository sMSBulkQueueBackupRepository;
    
    public List<SMSBulkQueueBackupModel> fetchByNumber(Integer table, String number) {
    	if(table.equals(1)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue1(number);
    	}
    	else if(table.equals(2)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue2(number);
    	}    	
    	else if(table.equals(3)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue3(number);
    	}
    	else if(table.equals(4)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue4(number);
    	}
    	else if(table.equals(5)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue5(number);
    	}
    	
    	else if(table.equals(6)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue6(number);
    	}
    	
    	else if(table.equals(7)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue7(number);
    	}
    	
    	else if(table.equals(8)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue8(number);
    	}
    	
    	else if(table.equals(9)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue9(number);
    	}
    	
    	else if(table.equals(10)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue10(number);
    	}
    	
    	else if(table.equals(11)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue11(number);
    	}
    	else if(table.equals(12)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue12(number);
    	}    	
    	else if(table.equals(13)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue13(number);
    	}
    	else if(table.equals(14)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue14(number);
    	}
    	else if(table.equals(15)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue15(number);
    	}
    	
    	else if(table.equals(16)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue16(number);
    	}
    	
    	else if(table.equals(17)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue17(number);
    	}
    	
    	else if(table.equals(18)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue18(number);
    	}
    	
    	else if(table.equals(19)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue19(number);
    	}
    	
    	else if(table.equals(20)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue20(number);
    	}
    	
    	if(table.equals(21)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue21(number);
    	}
    	else if(table.equals(22)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue22(number);
    	}    	
    	else if(table.equals(23)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue23(number);
    	}
    	else if(table.equals(24)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue24(number);
    	}
    	else if(table.equals(25)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue25(number);
    	}
    	
    	else if(table.equals(26)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue26(number);
    	}
    	
    	else if(table.equals(27)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue27(number);
    	}
    	
    	else if(table.equals(28)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue28(number);
    	}
    	
    	else if(table.equals(29)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue29(number);
    	}
    	
    	else if(table.equals(30)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue30(number);
    	}
 
    	else if(table.equals(31)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue31(number);
    	}
    	else if(table.equals(32)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue32(number);
    	}    	
    	else if(table.equals(33)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue33(number);
    	}
    	else if(table.equals(34)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue34(number);
    	}
    	else if(table.equals(35)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue35(number);
    	}
    	
    	else if(table.equals(36)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue36(number);
    	}
    	
    	else if(table.equals(37)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue37(number);
    	}
    	
    	else if(table.equals(38)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue38(number);
    	}
    	
    	else if(table.equals(39)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue39(number);
    	}
    	
    	else if(table.equals(40)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue40(number);
    	}
    	
    	else if(table.equals(41)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue41(number);
    	}

    	else if(table.equals(42)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue42(number);
    	}    	
    	else if(table.equals(43)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue43(number);
    	}
    	else if(table.equals(44)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue44(number);
    	}
    	else if(table.equals(45)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue45(number);
    	}
    	
    	else if(table.equals(46)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue46(number);
    	}
    	
    	else if(table.equals(47)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue47(number);
    	}
    	
    	else if(table.equals(48)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue48(number);
    	}
    	
    	else if(table.equals(49)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue49(number);
    	}
    	
    	else if(table.equals(50)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue50(number);
    	}
    	
    	else if(table.equals(51)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue51(number);
    	}
    	else if(table.equals(52)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue52(number);
    	}    	
    	else if(table.equals(53)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue53(number);
    	}
    	else if(table.equals(54)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue54(number);
    	}
    	else if(table.equals(55)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue55(number);
    	}
    	
    	else if(table.equals(56)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue56(number);
    	}
    	
    	else if(table.equals(57)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue57(number);
    	}
    	
    	else if(table.equals(58)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue58(number);
    	}
    	
    	else if(table.equals(59)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue59(number);
    	}
    	
    	else if(table.equals(60)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue60(number);
    	}
 
    	else if(table.equals(61)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue61(number);
    	}
    	else if(table.equals(62)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue62(number);
    	}    	
    	else if(table.equals(63)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue63(number);
    	}
    	else if(table.equals(64)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue64(number);
    	}
    	else if(table.equals(65)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue65(number);
    	}
    	
    	else if(table.equals(66)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue66(number);
    	}
    	
    	else if(table.equals(67)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue67(number);
    	}
    	
    	else if(table.equals(68)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue68(number);
    	}
    	
    	else if(table.equals(69)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue69(number);
    	}
    	
    	else if(table.equals(70)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue70(number);
    	}
 
    	else if(table.equals(71)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue71(number);
    	}
    	else if(table.equals(72)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue72(number);
    	}    	
    	else if(table.equals(73)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue73(number);
    	}
    	else if(table.equals(74)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue74(number);
    	}
    	else if(table.equals(75)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue75(number);
    	}
    	
    	else if(table.equals(76)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue76(number);
    	}
    	
    	else if(table.equals(77)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue77(number);
    	}
    	
    	else if(table.equals(78)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue78(number);
    	}
    	
    	else if(table.equals(79)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue79(number);
    	}
    	
    	else if(table.equals(80)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue80(number);
    	}
    	
    	else if(table.equals(81)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue81(number);
    	}
    	else if(table.equals(82)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue82(number);
    	}    	
    	else if(table.equals(83)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue83(number);
    	}
    	else if(table.equals(84)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue84(number);
    	}
    	else if(table.equals(85)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue85(number);
    	}
    	
    	else if(table.equals(86)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue86(number);
    	}
    	
    	else if(table.equals(87)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue87(number);
    	}
    	
    	else if(table.equals(88)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue88(number);
    	}
    	
    	else if(table.equals(89)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue89(number);
    	}
    	
    	else if(table.equals(90)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue90(number);
    	}

    	else if(table.equals(91)) {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue91(number);
    	}
    	else if(table.equals(92)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue92(number);
    	}    	
    	else if(table.equals(93)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue93(number);
    	}
    	else if(table.equals(94)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue94(number);
    	}
    	else if(table.equals(95)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue95(number);
    	}
    	
    	else if(table.equals(96)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue96(number);
    	}
    	
    	else if(table.equals(97)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue97(number);
    	}
    	
    	else if(table.equals(98)){
    		return sMSBulkQueueBackupRepository.fetchSmsQueue98(number);
    	}
    	
    	else {
    		return sMSBulkQueueBackupRepository.fetchSmsQueue99(number);
    	}	
	}
}


