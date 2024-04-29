package com.MSMSPerformanceMonitor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.smsbulkim.model.ESMSOpted;
import com.MSMSPerformanceMonitor.smsbulkim.repository.ESMSOptedRepository;

@Service
public class ESMSOptedService {
	
	@Autowired
	private ESMSOptedRepository eSMSOptedRepository;
	
	public ArrayList<ESMSOpted> fetchOpted(String number) {
		int lastDigit = Integer.parseInt(number.substring(number.length() - 1));
		
		if(lastDigit==0) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted0(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted0Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		else if(lastDigit==1) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted1(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted1Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==2) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted2(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted2Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==3) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted3(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted3Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==4) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted4(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted4Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==5) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted5(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted5Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==6) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted6(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted6Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==7) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted7(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted7Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else if(lastDigit==8) {
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted8(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted8Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
		
		else{
			List<ESMSOpted> normal = eSMSOptedRepository.fetchOpted9(number);
			List<ESMSOpted> backup = eSMSOptedRepository.fetchOpted9Bk(number);
			ArrayList<ESMSOpted> newList = new ArrayList<ESMSOpted>();
			newList.addAll(normal);
			return newList;
		}
	}
	
	
}
