package com.MSMSPerformanceMonitor.sms.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sms_queue3")
public class SMSQueueModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autoindex_id")
    private Long autoindexId;

    @Column(name = "receiver_mob", nullable = false, length = 20)
    private String receiverMob;

    @Column(name = "status", nullable = false, length = 2)
    private String status;

    @Column(name = "queuedtime", nullable = false)
    private Timestamp queuedTime;

    @Column(name = "imsi_no", length = 45)
    private String imsiNo;

    @Column(name = "msc_no", length = 45)
    private String mscNo;

    @Column(name = "added_time", nullable = false)
    private Timestamp addedTime;

    @Column(name = "sms_time", nullable = false)
    private Timestamp smsTime;

    @Column(name = "profile", nullable = false)
    private Integer profile;

    @Column(name = "retry_time", nullable = false)
    private Integer retryTime;

    @Column(name = "sender_imsi_no", length = 45)
    private String senderImsiNo;

    @Column(name = "charged", nullable = false, length = 5)
    private String charged;

    @Column(name = "sender_msc_no", length = 45)
    private String senderMscNo;

    @Column(name = "post_prepaid")
    private Integer postPrepaid;

    @Column(name = "sms_len", nullable = false)
    private Integer smsLen;

    @Column(name = "long_msg", nullable = false)
    private Integer longMsg;

    @Column(name = "UDH", nullable = false, length = 10)
    private String udh;

    @Column(name = "multi_part", nullable = false)
    private Integer multiPart;

    @Column(name = "cdr", nullable = false, length = 2)
    private String cdr;

    @Column(name = "unq_msg_id", nullable = false, length = 25)
    private String unqMsgId;

    @Column(name = "unq_key", nullable = false, length = 21)
    private String unqKey;

    @Column(name = "comp_id", nullable = false)
    private Integer compId;

    @Column(name = "chrg_acc_id", nullable = false)
    private Integer chrgAccId;

    @Column(name = "coop_acc", nullable = false)
    private Integer coopAcc;

    @Column(name = "idd_cat", nullable = false)
    private Integer iddCat;

    
	public SMSQueueModel() {
	
	}


	public SMSQueueModel(Long autoindexId, String receiverMob, String status, Timestamp queuedTime, String imsiNo,
			String mscNo, Timestamp addedTime, Timestamp smsTime, Integer profile, Integer retryTime,
			String senderImsiNo, String charged, String senderMscNo, Integer postPrepaid, Integer smsLen,
			Integer longMsg, String udh, Integer multiPart, String cdr, String unqMsgId, String unqKey, Integer compId,
			Integer chrgAccId, Integer coopAcc, Integer iddCat) {
		
		this.autoindexId = autoindexId;
		this.receiverMob = receiverMob;
		this.status = status;
		this.queuedTime = queuedTime;
		this.imsiNo = imsiNo;
		this.mscNo = mscNo;
		this.addedTime = addedTime;
		this.smsTime = smsTime;
		this.profile = profile;
		this.retryTime = retryTime;
		this.senderImsiNo = senderImsiNo;
		this.charged = charged;
		this.senderMscNo = senderMscNo;
		this.postPrepaid = postPrepaid;
		this.smsLen = smsLen;
		this.longMsg = longMsg;
		this.udh = udh;
		this.multiPart = multiPart;
		this.cdr = cdr;
		this.unqMsgId = unqMsgId;
		this.unqKey = unqKey;
		this.compId = compId;
		this.chrgAccId = chrgAccId;
		this.coopAcc = coopAcc;
		this.iddCat = iddCat;
	}


	public Long getAutoindexId() {
		return autoindexId;
	}


	public void setAutoindexId(Long autoindexId) {
		this.autoindexId = autoindexId;
	}


	public String getReceiverMob() {
		return receiverMob;
	}


	public void setReceiverMob(String receiverMob) {
		this.receiverMob = receiverMob;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Timestamp getQueuedTime() {
		return queuedTime;
	}


	public void setQueuedTime(Timestamp queuedTime) {
		this.queuedTime = queuedTime;
	}


	public String getImsiNo() {
		return imsiNo;
	}


	public void setImsiNo(String imsiNo) {
		this.imsiNo = imsiNo;
	}


	public String getMscNo() {
		return mscNo;
	}


	public void setMscNo(String mscNo) {
		this.mscNo = mscNo;
	}


	public Timestamp getAddedTime() {
		return addedTime;
	}


	public void setAddedTime(Timestamp addedTime) {
		this.addedTime = addedTime;
	}


	public Timestamp getSmsTime() {
		return smsTime;
	}


	public void setSmsTime(Timestamp smsTime) {
		this.smsTime = smsTime;
	}


	public Integer getProfile() {
		return profile;
	}


	public void setProfile(Integer profile) {
		this.profile = profile;
	}


	public Integer getRetryTime() {
		return retryTime;
	}


	public void setRetryTime(Integer retryTime) {
		this.retryTime = retryTime;
	}


	public String getSenderImsiNo() {
		return senderImsiNo;
	}


	public void setSenderImsiNo(String senderImsiNo) {
		this.senderImsiNo = senderImsiNo;
	}


	public String getCharged() {
		return charged;
	}


	public void setCharged(String charged) {
		this.charged = charged;
	}


	public String getSenderMscNo() {
		return senderMscNo;
	}


	public void setSenderMscNo(String senderMscNo) {
		this.senderMscNo = senderMscNo;
	}


	public Integer getPostPrepaid() {
		return postPrepaid;
	}


	public void setPostPrepaid(Integer postPrepaid) {
		this.postPrepaid = postPrepaid;
	}


	public Integer getSmsLen() {
		return smsLen;
	}


	public void setSmsLen(Integer smsLen) {
		this.smsLen = smsLen;
	}


	public Integer getLongMsg() {
		return longMsg;
	}


	public void setLongMsg(Integer longMsg) {
		this.longMsg = longMsg;
	}


	public String getUdh() {
		return udh;
	}


	public void setUdh(String udh) {
		this.udh = udh;
	}


	public Integer getMultiPart() {
		return multiPart;
	}


	public void setMultiPart(Integer multiPart) {
		this.multiPart = multiPart;
	}


	public String getCdr() {
		return cdr;
	}


	public void setCdr(String cdr) {
		this.cdr = cdr;
	}


	public String getUnqMsgId() {
		return unqMsgId;
	}


	public void setUnqMsgId(String unqMsgId) {
		this.unqMsgId = unqMsgId;
	}


	public String getUnqKey() {
		return unqKey;
	}


	public void setUnqKey(String unqKey) {
		this.unqKey = unqKey;
	}


	public Integer getCompId() {
		return compId;
	}


	public void setCompId(Integer compId) {
		this.compId = compId;
	}


	public Integer getChrgAccId() {
		return chrgAccId;
	}


	public void setChrgAccId(Integer chrgAccId) {
		this.chrgAccId = chrgAccId;
	}


	public Integer getCoopAcc() {
		return coopAcc;
	}


	public void setCoopAcc(Integer coopAcc) {
		this.coopAcc = coopAcc;
	}


	public Integer getIddCat() {
		return iddCat;
	}


	public void setIddCat(Integer iddCat) {
		this.iddCat = iddCat;
	}

    

}


