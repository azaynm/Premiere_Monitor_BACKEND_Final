package com.MSMSPerformanceMonitor.smsbulkim.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.MSMSPerformanceMonitor.smsbulk.model.SMSLoadSummeryCopy;
import com.MSMSPerformanceMonitor.smsbulkim.model.CompanyProfile;



@Repository
public interface CompanyProfileRepository extends CrudRepository<CompanyProfile, Integer>{
	
    @Query(value = "SELECT * FROM esms_company_prof WHERE id = :profile", nativeQuery = true)
    CompanyProfile fetchCompanyName(@Param("profile") Integer profile);
    


}

