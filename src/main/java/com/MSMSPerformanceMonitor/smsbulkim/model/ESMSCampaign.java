package com.MSMSPerformanceMonitor.smsbulkim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "esms_campaign")
public class ESMSCampaign {

	@Id
    @Column(name = "camp_key")
	private String campKey;
	
	@Column(name = "added_datetime")
	private String addedDatetime;
	
	
	
	@Column(name = "sheduled_datetime")
	private String sheduledDatetime;
	
	@Column(name = "cam_owner")
	private String camOwner;
	
	@Column(name = "cam_owner_id")
	private Integer camOwnerId;
	
	@Column(name = "alias")
	private String alias;
	
	@Column(name = "msg")
	private String msg;
	
	@Column(name = "msg_len")
	private Integer msgLen;
	
	@Column(name = "template_no")
	private Integer templateNo;
	
	@Column(name = "sender")
	private String sender;
	
	@Column(name = "sender_type")
	private Integer senderType;
	
	@Column(name = "num_of_rec")
	private Integer numOfRec;
	
	@Column(name = "val_datetime")
	private String valDatetime;
	
	@Column(name = "excel_prepros")
	private Integer excelPrepros;
	
	@Column(name = "camp_prepros")
	private Integer campPrepros;
	
	@Column(name = "camp_pros_status")
	private Integer campProsStatus;
	
	@Column(name = "camp_pros_mode")
	private Integer campProsMode;
	
	@Column(name = "camp_prority")
	private Integer campPrority;
	
	@Column(name = "company_id")
	private Integer companyId;
	
	@Column(name = "profile")
	private Integer profile;
	
	@Column(name = "appr_id")
	private Integer apprId;
	
	@Column(name = "application_id")
	private Integer applicationId;
	
	@Column(name = "account_id")
	private Integer accountId;
	
	@Column(name = "camp_curr_status")
	private Integer campCurrStatus;
	
	
	@Column(name = "camp_curr_time")
	private String campCurrTime;
	
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
	
	@Column(name = "coop_acc_id")
	private Integer coopAccId;
	
	@Column(name = "excel")
	private Integer excel;
	
	@Column(name = "ttl_segments")
	private Integer ttlSegments;
	
	@Column(name = "sms_language")
	private Integer smsLanguage;
	
	@Column(name = "num_list_enable")
	private Integer numListEnable;
	
	@Column(name = "num_list_key")
	private String numListKey;
	
	@Column(name = "charging_method")
	private String chargingMethod;
	
	@Column(name = "ex_pros_status")
	private String exProsStatus;
	
	@Column(name = "approved_datetime")
	private String approvedDatetime;
	
	@Column(name = "unicode_msg")
	private String unicodeMsg;
	
	@Column(name = "id_of_sender")
	private Integer idOfSender;
	
	@Column(name = "optout_bypass")
	private Integer optoutBypass;
	
	@Column(name = "enable_tax")
	private Integer enableTax;
	
	@Column(name = "backup")
	private String backup;
	
	@Column(name = "valid_num_count")
	private Integer validNumCount;

	public ESMSCampaign() {
		
	}

	public ESMSCampaign(String campKey, String addedDatetime, String sheduledDatetime, String camOwner,
			Integer camOwnerId, String alias, String msg, Integer msgLen, Integer templateNo, String sender,
			Integer senderType, Integer numOfRec, String valDatetime, Integer excelPrepros, Integer campPrepros,
			Integer campProsStatus, Integer campProsMode, Integer campPrority, Integer companyId, Integer profile,
			Integer apprId, Integer applicationId, Integer accountId, Integer campCurrStatus, String campCurrTime,
			Integer ttlDelSms, Integer ttlExpSms, Integer ttlQueueSms, Integer ttlUnprosSms, Integer ttlCount,
			Integer coopAccId, Integer excel, Integer ttlSegments, Integer smsLanguage, Integer numListEnable,
			String numListKey, String chargingMethod, String exProsStatus, String approvedDatetime, String unicodeMsg,
			Integer idOfSender, Integer optoutBypass, Integer enableTax, String backup, Integer validNumCount) {
	
		this.campKey = campKey;
		this.addedDatetime = addedDatetime;
		this.sheduledDatetime = sheduledDatetime;
		this.camOwner = camOwner;
		this.camOwnerId = camOwnerId;
		this.alias = alias;
		this.msg = msg;
		this.msgLen = msgLen;
		this.templateNo = templateNo;
		this.sender = sender;
		this.senderType = senderType;
		this.numOfRec = numOfRec;
		this.valDatetime = valDatetime;
		this.excelPrepros = excelPrepros;
		this.campPrepros = campPrepros;
		this.campProsStatus = campProsStatus;
		this.campProsMode = campProsMode;
		this.campPrority = campPrority;
		this.companyId = companyId;
		this.profile = profile;
		this.apprId = apprId;
		this.applicationId = applicationId;
		this.accountId = accountId;
		this.campCurrStatus = campCurrStatus;
		this.campCurrTime = campCurrTime;
		this.ttlDelSms = ttlDelSms;
		this.ttlExpSms = ttlExpSms;
		this.ttlQueueSms = ttlQueueSms;
		this.ttlUnprosSms = ttlUnprosSms;
		this.ttlCount = ttlCount;
		this.coopAccId = coopAccId;
		this.excel = excel;
		this.ttlSegments = ttlSegments;
		this.smsLanguage = smsLanguage;
		this.numListEnable = numListEnable;
		this.numListKey = numListKey;
		this.chargingMethod = chargingMethod;
		this.exProsStatus = exProsStatus;
		this.approvedDatetime = approvedDatetime;
		this.unicodeMsg = unicodeMsg;
		this.idOfSender = idOfSender;
		this.optoutBypass = optoutBypass;
		this.enableTax = enableTax;
		this.backup = backup;
		this.validNumCount = validNumCount;
	}

	public String getCampKey() {
		return campKey;
	}

	public void setCampKey(String campKey) {
		this.campKey = campKey;
	}

	public String getAddedDatetime() {
		return addedDatetime;
	}

	public void setAddedDatetime(String addedDatetime) {
		this.addedDatetime = addedDatetime;
	}

	public String getSheduledDatetime() {
		return sheduledDatetime;
	}

	public void setSheduledDatetime(String sheduledDatetime) {
		this.sheduledDatetime = sheduledDatetime;
	}

	public String getCamOwner() {
		return camOwner;
	}

	public void setCamOwner(String camOwner) {
		this.camOwner = camOwner;
	}

	public Integer getCamOwnerId() {
		return camOwnerId;
	}

	public void setCamOwnerId(Integer camOwnerId) {
		this.camOwnerId = camOwnerId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getMsgLen() {
		return msgLen;
	}

	public void setMsgLen(Integer msgLen) {
		this.msgLen = msgLen;
	}

	public Integer getTemplateNo() {
		return templateNo;
	}

	public void setTemplateNo(Integer templateNo) {
		this.templateNo = templateNo;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Integer getSenderType() {
		return senderType;
	}

	public void setSenderType(Integer senderType) {
		this.senderType = senderType;
	}

	public Integer getNumOfRec() {
		return numOfRec;
	}

	public void setNumOfRec(Integer numOfRec) {
		this.numOfRec = numOfRec;
	}

	public String getValDatetime() {
		return valDatetime;
	}

	public void setValDatetime(String valDatetime) {
		this.valDatetime = valDatetime;
	}

	public Integer getExcelPrepros() {
		return excelPrepros;
	}

	public void setExcelPrepros(Integer excelPrepros) {
		this.excelPrepros = excelPrepros;
	}

	public Integer getCampPrepros() {
		return campPrepros;
	}

	public void setCampPrepros(Integer campPrepros) {
		this.campPrepros = campPrepros;
	}

	public Integer getCampProsStatus() {
		return campProsStatus;
	}

	public void setCampProsStatus(Integer campProsStatus) {
		this.campProsStatus = campProsStatus;
	}

	public Integer getCampProsMode() {
		return campProsMode;
	}

	public void setCampProsMode(Integer campProsMode) {
		this.campProsMode = campProsMode;
	}

	public Integer getCampPrority() {
		return campPrority;
	}

	public void setCampPrority(Integer campPrority) {
		this.campPrority = campPrority;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getProfile() {
		return profile;
	}

	public void setProfile(Integer profile) {
		this.profile = profile;
	}

	public Integer getApprId() {
		return apprId;
	}

	public void setApprId(Integer apprId) {
		this.apprId = apprId;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getCampCurrStatus() {
		return campCurrStatus;
	}

	public void setCampCurrStatus(Integer campCurrStatus) {
		this.campCurrStatus = campCurrStatus;
	}

	public String getCampCurrTime() {
		return campCurrTime;
	}

	public void setCampCurrTime(String campCurrTime) {
		this.campCurrTime = campCurrTime;
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

	public Integer getCoopAccId() {
		return coopAccId;
	}

	public void setCoopAccId(Integer coopAccId) {
		this.coopAccId = coopAccId;
	}

	public Integer getExcel() {
		return excel;
	}

	public void setExcel(Integer excel) {
		this.excel = excel;
	}

	public Integer getTtlSegments() {
		return ttlSegments;
	}

	public void setTtlSegments(Integer ttlSegments) {
		this.ttlSegments = ttlSegments;
	}

	public Integer getSmsLanguage() {
		return smsLanguage;
	}

	public void setSmsLanguage(Integer smsLanguage) {
		this.smsLanguage = smsLanguage;
	}

	public Integer getNumListEnable() {
		return numListEnable;
	}

	public void setNumListEnable(Integer numListEnable) {
		this.numListEnable = numListEnable;
	}

	public String getNumListKey() {
		return numListKey;
	}

	public void setNumListKey(String numListKey) {
		this.numListKey = numListKey;
	}

	public String getChargingMethod() {
		return chargingMethod;
	}

	public void setChargingMethod(String chargingMethod) {
		this.chargingMethod = chargingMethod;
	}

	public String getExProsStatus() {
		return exProsStatus;
	}

	public void setExProsStatus(String exProsStatus) {
		this.exProsStatus = exProsStatus;
	}

	public String getApprovedDatetime() {
		return approvedDatetime;
	}

	public void setApprovedDatetime(String approvedDatetime) {
		this.approvedDatetime = approvedDatetime;
	}

	public String getUnicodeMsg() {
		return unicodeMsg;
	}

	public void setUnicodeMsg(String unicodeMsg) {
		this.unicodeMsg = unicodeMsg;
	}

	public Integer getIdOfSender() {
		return idOfSender;
	}

	public void setIdOfSender(Integer idOfSender) {
		this.idOfSender = idOfSender;
	}

	public Integer getOptoutBypass() {
		return optoutBypass;
	}

	public void setOptoutBypass(Integer optoutBypass) {
		this.optoutBypass = optoutBypass;
	}

	public Integer getEnableTax() {
		return enableTax;
	}

	public void setEnableTax(Integer enableTax) {
		this.enableTax = enableTax;
	}

	public String getBackup() {
		return backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public Integer getValidNumCount() {
		return validNumCount;
	}

	public void setValidNumCount(Integer validNumCount) {
		this.validNumCount = validNumCount;
	}
	
	
	
}
