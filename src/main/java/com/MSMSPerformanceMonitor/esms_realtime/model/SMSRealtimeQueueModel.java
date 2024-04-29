package com.MSMSPerformanceMonitor.esms_realtime.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "sms_queue3")
public class SMSRealtimeQueueModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autoindex_id")
    private Long autoindexId;

    @Column(name = "receiver_mob", nullable = false)
    private String receiverMob;

    @Column(name = "dialog_id")
    private String dialogId;

    @Column(name = "sender", nullable = false)
    private String sender;

    @Column(name = "numtype", nullable = false)
    private String numtype;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "queuedtime", nullable = false)
    private Timestamp queuedtime;

    @Column(name = "imsi_no")
    private String imsiNo;

    @Column(name = "msc_no")
    private String mscNo;

    @Column(name = "added_time", nullable = false)
    private Timestamp addedTime;

    @Column(name = "sms_time", nullable = false)
    private Timestamp smsTime;

    @Column(name = "sms_ui", nullable = false)
    private String smsUi;

    @Column(name = "long_msg", nullable = false)
    private Integer longMsg;

    @Column(name = "num_of_cha", nullable = false)
    private Integer numOfCha;

    @Column(name = "val_period", nullable = false)
    private Integer valPeriod;

    @Column(name = "dc_schema", nullable = false)
    private Integer dcSchema;

    @Column(name = "retry_time", nullable = false)
    private Integer retryTime;

    @Column(name = "multi_msg_udh", nullable = false)
    private String multiMsgUdh;

    @Column(name = "sender_imsi_no")
    private String senderImsiNo;

    @Column(name = "sender_msc_no")
    private String senderMscNo;

    @Column(name = "cdr", nullable = false)
    private String cdr;

    @Column(name = "unq_msg_id", nullable = false)
    private String unqMsgId;

    @Column(name = "camp_key", nullable = false)
    private String campKey;

    @Column(name = "comp_id", nullable = false)
    private Long compId;

    @Column(name = "chrg_acc_id", nullable = false)
    private Long chrgAccId;

    @Column(name = "coop_acc", nullable = false)
    private Long coopAcc;

    @Column(name = "comm_ck", nullable = false)
    private String commCk;

    @Column(name = "flag", nullable = false)
    private char flag;

    @Column(name = "ttl_segments", nullable = false)
    private Integer ttlSegments;

    @Column(name = "multi_part", nullable = false)
    private Integer multiPart;

    @Column(name = "enable_tax", nullable = false)
    private Integer enableTax;

    @Column(name = "call_back_flag", nullable = false)
    private String callBackFlag;

    @Column(name = "call_back", nullable = false)
    private String callBack;

    @Column(name = "idd_cat", nullable = false)
    private Integer iddCat;

	public SMSRealtimeQueueModel() {

	}

	public SMSRealtimeQueueModel(Long autoindexId, String receiverMob, String dialogId, String sender, String numtype,
			String status, Timestamp queuedtime, String imsiNo, String mscNo, Timestamp addedTime, Timestamp smsTime,
			String smsUi, Integer longMsg, Integer numOfCha, Integer valPeriod, Integer dcSchema, Integer retryTime,
			String multiMsgUdh, String senderImsiNo, String senderMscNo, String cdr, String unqMsgId, String campKey,
			Long compId, Long chrgAccId, Long coopAcc, String commCk, char flag, Integer ttlSegments, Integer multiPart,
			Integer enableTax, String callBackFlag, String callBack, Integer iddCat) {
		this.autoindexId = autoindexId;
		this.receiverMob = receiverMob;
		this.dialogId = dialogId;
		this.sender = sender;
		this.numtype = numtype;
		this.status = status;
		this.queuedtime = queuedtime;
		this.imsiNo = imsiNo;
		this.mscNo = mscNo;
		this.addedTime = addedTime;
		this.smsTime = smsTime;
		this.smsUi = smsUi;
		this.longMsg = longMsg;
		this.numOfCha = numOfCha;
		this.valPeriod = valPeriod;
		this.dcSchema = dcSchema;
		this.retryTime = retryTime;
		this.multiMsgUdh = multiMsgUdh;
		this.senderImsiNo = senderImsiNo;
		this.senderMscNo = senderMscNo;
		this.cdr = cdr;
		this.unqMsgId = unqMsgId;
		this.campKey = campKey;
		this.compId = compId;
		this.chrgAccId = chrgAccId;
		this.coopAcc = coopAcc;
		this.commCk = commCk;
		this.flag = flag;
		this.ttlSegments = ttlSegments;
		this.multiPart = multiPart;
		this.enableTax = enableTax;
		this.callBackFlag = callBackFlag;
		this.callBack = callBack;
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

	public String getDialogId() {
		return dialogId;
	}

	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getNumtype() {
		return numtype;
	}

	public void setNumtype(String numtype) {
		this.numtype = numtype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getQueuedtime() {
		return queuedtime;
	}

	public void setQueuedtime(Timestamp queuedtime) {
		this.queuedtime = queuedtime;
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

	public String getSmsUi() {
		return smsUi;
	}

	public void setSmsUi(String smsUi) {
		this.smsUi = smsUi;
	}

	public Integer getLongMsg() {
		return longMsg;
	}

	public void setLongMsg(Integer longMsg) {
		this.longMsg = longMsg;
	}

	public Integer getNumOfCha() {
		return numOfCha;
	}

	public void setNumOfCha(Integer numOfCha) {
		this.numOfCha = numOfCha;
	}

	public Integer getValPeriod() {
		return valPeriod;
	}

	public void setValPeriod(Integer valPeriod) {
		this.valPeriod = valPeriod;
	}

	public Integer getDcSchema() {
		return dcSchema;
	}

	public void setDcSchema(Integer dcSchema) {
		this.dcSchema = dcSchema;
	}

	public Integer getRetryTime() {
		return retryTime;
	}

	public void setRetryTime(Integer retryTime) {
		this.retryTime = retryTime;
	}

	public String getMultiMsgUdh() {
		return multiMsgUdh;
	}

	public void setMultiMsgUdh(String multiMsgUdh) {
		this.multiMsgUdh = multiMsgUdh;
	}

	public String getSenderImsiNo() {
		return senderImsiNo;
	}

	public void setSenderImsiNo(String senderImsiNo) {
		this.senderImsiNo = senderImsiNo;
	}

	public String getSenderMscNo() {
		return senderMscNo;
	}

	public void setSenderMscNo(String senderMscNo) {
		this.senderMscNo = senderMscNo;
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

	public String getCampKey() {
		return campKey;
	}

	public void setCampKey(String campKey) {
		this.campKey = campKey;
	}

	public Long getCompId() {
		return compId;
	}

	public void setCompId(Long compId) {
		this.compId = compId;
	}

	public Long getChrgAccId() {
		return chrgAccId;
	}

	public void setChrgAccId(Long chrgAccId) {
		this.chrgAccId = chrgAccId;
	}

	public Long getCoopAcc() {
		return coopAcc;
	}

	public void setCoopAcc(Long coopAcc) {
		this.coopAcc = coopAcc;
	}

	public String getCommCk() {
		return commCk;
	}

	public void setCommCk(String commCk) {
		this.commCk = commCk;
	}

	public char getFlag() {
		return flag;
	}

	public void setFlag(char flag) {
		this.flag = flag;
	}

	public Integer getTtlSegments() {
		return ttlSegments;
	}

	public void setTtlSegments(Integer ttlSegments) {
		this.ttlSegments = ttlSegments;
	}

	public Integer getMultiPart() {
		return multiPart;
	}

	public void setMultiPart(Integer multiPart) {
		this.multiPart = multiPart;
	}

	public Integer getEnableTax() {
		return enableTax;
	}

	public void setEnableTax(Integer enableTax) {
		this.enableTax = enableTax;
	}

	public String getCallBackFlag() {
		return callBackFlag;
	}

	public void setCallBackFlag(String callBackFlag) {
		this.callBackFlag = callBackFlag;
	}

	public String getCallBack() {
		return callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
	}

	public Integer getIddCat() {
		return iddCat;
	}

	public void setIddCat(Integer iddCat) {
		this.iddCat = iddCat;
	}
	
	

    
}
