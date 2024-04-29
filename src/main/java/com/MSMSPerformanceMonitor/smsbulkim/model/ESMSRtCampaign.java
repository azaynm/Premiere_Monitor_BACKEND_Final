package com.MSMSPerformanceMonitor.smsbulkim.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "esms_rt_campaign")
public class ESMSRtCampaign {
    
    @Id
    @Column(name = "camp_key")
    private String campKey;
    
    @Column(name = "added_datetime")
    private String addedDatetime;
    
    @Column(name = "sheduled_datetime")
    private String sheduledDatetime;
    
    @Column(name = "camp_type")
    private int campType = 1;
    
    @Column(name = "cam_owner")
    private String camOwner;
    
    @Column(name = "cam_owner_id")
    private int camOwnerId;
    
    @Column(name = "msg")
    private String msg;
    
    @Column(name = "msg_len")
    private int msgLen;
    
    @Column(name = "num_count")
    private int numCount;
    
    @Column(name = "sender")
    private String sender;
    
    @Column(name = "sender_type")
    private int senderType = 2;
    
    @Column(name = "val_datetime")
    private Timestamp valDatetime;
    
    @Column(name = "camp_pros_status")
    private int campProsStatus;
    
    @Column(name = "camp_pros_mode")
    private int campProsMode;
    
    @Column(name = "company_id")
    private int companyId;
    
    @Column(name = "account_id")
    private int accountId;
    
    @Column(name = "coop_acc_id")
    private int coopAccId;
    
    @Column(name = "num_error_count")
    private int numErrorCount;
    
    @Column(name = "common_camp_key")
    private String commonCampKey;
    
    @Column(name = "ttl_segments")
    private int ttlSegments = 1;
    
    @Column(name = "sms_language")
    private int smsLanguage = 1;
    
    @Column(name = "num_list_enable")
    private int numListEnable;
    
    @Column(name = "num_list_key")
    private String numListKey;
    
    @Column(name = "alias")
    private String alias;
    
    @Column(name = "unicode_msg")
    private String unicodeMsg;
    
    @Column(name = "id_of_sender")
    private int idOfSender;
    
    @Column(name = "optout_bypass")
    private int optoutBypass;
    
    @Column(name = "backup")
    private char backup = 'N';
    
    @Column(name = "enable_tax")
    private int enableTax = 1;
    
    @Column(name = "call_back_url")
    private String callBackUrl;
    
    @Column(name = "call_back")
    private int callBack;

	public ESMSRtCampaign() {
	}

	public ESMSRtCampaign(String campKey, String addedDatetime, String sheduledDatetime, int campType, String camOwner,
			int camOwnerId, String msg, int msgLen, int numCount, String sender, int senderType, Timestamp valDatetime,
			int campProsStatus, int campProsMode, int companyId, int accountId, int coopAccId, int numErrorCount,
			String commonCampKey, int ttlSegments, int smsLanguage, int numListEnable, String numListKey, String alias,
			String unicodeMsg, int idOfSender, int optoutBypass, char backup, int enableTax, String callBackUrl,
			int callBack) {
		this.campKey = campKey;
		this.addedDatetime = addedDatetime;
		this.sheduledDatetime = sheduledDatetime;
		this.campType = campType;
		this.camOwner = camOwner;
		this.camOwnerId = camOwnerId;
		this.msg = msg;
		this.msgLen = msgLen;
		this.numCount = numCount;
		this.sender = sender;
		this.senderType = senderType;
		this.valDatetime = valDatetime;
		this.campProsStatus = campProsStatus;
		this.campProsMode = campProsMode;
		this.companyId = companyId;
		this.accountId = accountId;
		this.coopAccId = coopAccId;
		this.numErrorCount = numErrorCount;
		this.commonCampKey = commonCampKey;
		this.ttlSegments = ttlSegments;
		this.smsLanguage = smsLanguage;
		this.numListEnable = numListEnable;
		this.numListKey = numListKey;
		this.alias = alias;
		this.unicodeMsg = unicodeMsg;
		this.idOfSender = idOfSender;
		this.optoutBypass = optoutBypass;
		this.backup = backup;
		this.enableTax = enableTax;
		this.callBackUrl = callBackUrl;
		this.callBack = callBack;
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

	public int getCampType() {
		return campType;
	}

	public void setCampType(int campType) {
		this.campType = campType;
	}

	public String getCamOwner() {
		return camOwner;
	}

	public void setCamOwner(String camOwner) {
		this.camOwner = camOwner;
	}

	public int getCamOwnerId() {
		return camOwnerId;
	}

	public void setCamOwnerId(int camOwnerId) {
		this.camOwnerId = camOwnerId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getMsgLen() {
		return msgLen;
	}

	public void setMsgLen(int msgLen) {
		this.msgLen = msgLen;
	}

	public int getNumCount() {
		return numCount;
	}

	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public int getSenderType() {
		return senderType;
	}

	public void setSenderType(int senderType) {
		this.senderType = senderType;
	}

	public Timestamp getValDatetime() {
		return valDatetime;
	}

	public void setValDatetime(Timestamp valDatetime) {
		this.valDatetime = valDatetime;
	}

	public int getCampProsStatus() {
		return campProsStatus;
	}

	public void setCampProsStatus(int campProsStatus) {
		this.campProsStatus = campProsStatus;
	}

	public int getCampProsMode() {
		return campProsMode;
	}

	public void setCampProsMode(int campProsMode) {
		this.campProsMode = campProsMode;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCoopAccId() {
		return coopAccId;
	}

	public void setCoopAccId(int coopAccId) {
		this.coopAccId = coopAccId;
	}

	public int getNumErrorCount() {
		return numErrorCount;
	}

	public void setNumErrorCount(int numErrorCount) {
		this.numErrorCount = numErrorCount;
	}

	public String getCommonCampKey() {
		return commonCampKey;
	}

	public void setCommonCampKey(String commonCampKey) {
		this.commonCampKey = commonCampKey;
	}

	public int getTtlSegments() {
		return ttlSegments;
	}

	public void setTtlSegments(int ttlSegments) {
		this.ttlSegments = ttlSegments;
	}

	public int getSmsLanguage() {
		return smsLanguage;
	}

	public void setSmsLanguage(int smsLanguage) {
		this.smsLanguage = smsLanguage;
	}

	public int getNumListEnable() {
		return numListEnable;
	}

	public void setNumListEnable(int numListEnable) {
		this.numListEnable = numListEnable;
	}

	public String getNumListKey() {
		return numListKey;
	}

	public void setNumListKey(String numListKey) {
		this.numListKey = numListKey;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUnicodeMsg() {
		return unicodeMsg;
	}

	public void setUnicodeMsg(String unicodeMsg) {
		this.unicodeMsg = unicodeMsg;
	}

	public int getIdOfSender() {
		return idOfSender;
	}

	public void setIdOfSender(int idOfSender) {
		this.idOfSender = idOfSender;
	}

	public int getOptoutBypass() {
		return optoutBypass;
	}

	public void setOptoutBypass(int optoutBypass) {
		this.optoutBypass = optoutBypass;
	}

	public char getBackup() {
		return backup;
	}

	public void setBackup(char backup) {
		this.backup = backup;
	}

	public int getEnableTax() {
		return enableTax;
	}

	public void setEnableTax(int enableTax) {
		this.enableTax = enableTax;
	}

	public String getCallBackUrl() {
		return callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public int getCallBack() {
		return callBack;
	}

	public void setCallBack(int callBack) {
		this.callBack = callBack;
	}
    
    
}