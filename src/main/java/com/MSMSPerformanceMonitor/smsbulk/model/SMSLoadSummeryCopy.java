package com.MSMSPerformanceMonitor.smsbulk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SMS_Load_summery")
public class SMSLoadSummeryCopy {

	@Id
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "profile")
	private Integer profile;
	
	@Column(name = "camp_key")
	private String campKey;
	
	@Column(name = "date_time")
	private String dateTime;
	
	@Column(name = "ttl_del_sms")
	private Integer ttlDelSms;
	
	@Column(name = "ttl_exp_sms")
	private Integer ttlExpSms;
	
	@Column(name = "ttl_queue_sms")
	private Integer ttlQueueSms;
	
	@Column(name = "ttl_unpros_sms")
	private Integer ttlUnprosSms;
	
	@Column(name = "ttl_count")
	private Integer ttlCount;

	public SMSLoadSummeryCopy() {

	}

	public SMSLoadSummeryCopy(Integer id, Integer profile, String campKey, String dateTime, Integer ttlDelSms,
			Integer ttlExpSms, Integer ttlQueueSms, Integer ttlUnprosSms, Integer ttlCount) {
		this.id = id;
		this.profile = profile;
		this.campKey = campKey;
		this.dateTime = dateTime;
		this.ttlDelSms = ttlDelSms;
		this.ttlExpSms = ttlExpSms;
		this.ttlQueueSms = ttlQueueSms;
		this.ttlUnprosSms = ttlUnprosSms;
		this.ttlCount = ttlCount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProfile() {
		return profile;
	}

	public void setProfile(Integer profile) {
		this.profile = profile;
	}

	public String getCampKey() {
		return campKey;
	}

	public void setCampKey(String campKey) {
		this.campKey = campKey;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getTtlDelSms() {
		return ttlDelSms;
	}

	public void setTtlDelSms(Integer ttlDelSms) {
		this.ttlDelSms = ttlDelSms;
	}

	public Integer getTtlExpSms() {
		return ttlExpSms;
	}

	public void setTtlExpSms(Integer ttlExpSms) {
		this.ttlExpSms = ttlExpSms;
	}

	public Integer getTtlQueueSms() {
		return ttlQueueSms;
	}

	public void setTtlQueueSms(Integer ttlQueueSms) {
		this.ttlQueueSms = ttlQueueSms;
	}

	public Integer getTtlUnprosSms() {
		return ttlUnprosSms;
	}

	public void setTtlUnprosSms(Integer ttlUnprosSms) {
		this.ttlUnprosSms = ttlUnprosSms;
	}

	public Integer getTtlCount() {
		return ttlCount;
	}

	public void setTtlCount(Integer ttlCount) {
		this.ttlCount = ttlCount;
	}

	
	
}
