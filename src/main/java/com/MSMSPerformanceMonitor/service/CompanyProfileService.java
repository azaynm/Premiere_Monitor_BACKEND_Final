package com.MSMSPerformanceMonitor.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;
import com.MSMSPerformanceMonitor.smsbulk.repository.SMSLoadSummeryCopyRepository;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;
import com.MSMSPerformanceMonitor.smsbulkim.repository.CompanyProfileRepository;

import javax.persistence.EntityNotFoundException;

import java.util.Calendar;

@Service
public class CompanyProfileService {
	
	@Autowired
    private CompanyProfileRepository companyProfileRepository;
	
	public CompanyProfile getCompanyName(Integer profile) {
        return companyProfileRepository.fetchCompanyName(profile);
    }
	


}

