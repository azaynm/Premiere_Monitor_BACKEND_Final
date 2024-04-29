package com.MSMSPerformanceMonitor.smsbulk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bulk_sms_profile")
public class BulkSmsModel {
	
	@Id
    @Column(name = "prof_num")
	private Integer profNum;
	
	@Column(name = "added_DT")
	private String addedDT;
	
	@Column(name = "restart_DT")
	private String restartDT;
	
	@Column(name = "A_num")
	private String aNum;
	
	@Column(name = "A_num_type")
	private Integer aNumType;
	
	@Column(name = "long_msg")
	private Integer longMsg;
	
	@Column(name = "ttl_segments")
	private Integer ttlSegments;
	
	@Column(name = "msg_1")
	private String msg1;
	
	@Column(name = "msg_length_1")
	private Integer msgLength1;
	
	@Column(name = "msg_2")
	private String msg2;
	
	@Column(name = "msg_length_2")
	private Integer msgLength2;
	
	@Column(name = "msg_3")
	private String msg3;
	
	@Column(name = "msg_length_3")
	private Integer msgLength3;
	
	@Column(name = "msg_4")
	private String msg4;
	
	@Column(name = "msg_length_4")
	private Integer msgLength4;
	
	@Column(name = "msg_5")
	private String msg5;
	
	@Column(name = "msg_length_5")
	private Integer msgLength5;
	
	@Column(name = "msg_6")
	private String msg6;
	
	@Column(name = "msg_length_6")
	private Integer msgLength6;
	
	@Column(name = "msg_7")
	private String msg7;
	
	@Column(name = "msg_length_7")
	private Integer msgLength7;
	
	@Column(name = "msg_8")
	private String msg8;
	
	@Column(name = "msg_length_8")
	private Integer msgLength8;
	
	@Column(name = "msg_9")
	private String msg9;
	
	@Column(name = "msg_length_9")
	private Integer msgLength9;
	
	@Column(name = "msg_10")
	private String msg10;
	
	@Column(name = "msg_length_10")
	private Integer msgLength10;
	
	@Column(name = "val_period")
	private Integer valPeriod;
	
	@Column(name = "no_of_msg")
	private Integer noOfMsg;
	
	@Column(name = "active")
	private Integer active;
	
	@Column(name = "prof_status")
	private Integer profStatus;
	
	@Column(name = "camp_key")
	private String campKey;
	
	@Column(name = "camp_type")
	private Integer campType;
	
	@Column(name = "thrput_mps")
	private Integer thrputMps;
	
	@Column(name = "microseconds")
	private Integer microseconds;
	
	@Column(name = "comp_id")
	private Integer compId;
	
	@Column(name = "chrg_acc_id")
	private Integer chrgAccId;
	
	@Column(name = "DCS")
	private Integer dcs;
	
	@Column(name = "read_con")
	private Integer readCon;
	
	@Column(name = "enable_tax")
	private Integer enableTax;

	public BulkSmsModel() {

	}

	public BulkSmsModel(Integer profNum, String addedDT, String restartDT, String aNum, Integer aNumType,
			Integer longMsg, Integer ttlSegments, String msg1, Integer msgLength1, String msg2, Integer msgLength2,
			String msg3, Integer msgLength3, String msg4, Integer msgLength4, String msg5, Integer msgLength5,
			String msg6, Integer msgLength6, String msg7, Integer msgLength7, String msg8, Integer msgLength8,
			String msg9, Integer msgLength9, String msg10, Integer msgLength10, Integer valPeriod, Integer noOfMsg,
			Integer active, Integer profStatus, String campKey, Integer campType, Integer thrputMps,
			Integer microseconds, Integer compId, Integer chrgAccId, Integer dcs, Integer readCon, Integer enableTax) {
		this.profNum = profNum;
		this.addedDT = addedDT;
		this.restartDT = restartDT;
		this.aNum = aNum;
		this.aNumType = aNumType;
		this.longMsg = longMsg;
		this.ttlSegments = ttlSegments;
		this.msg1 = msg1;
		this.msgLength1 = msgLength1;
		this.msg2 = msg2;
		this.msgLength2 = msgLength2;
		this.msg3 = msg3;
		this.msgLength3 = msgLength3;
		this.msg4 = msg4;
		this.msgLength4 = msgLength4;
		this.msg5 = msg5;
		this.msgLength5 = msgLength5;
		this.msg6 = msg6;
		this.msgLength6 = msgLength6;
		this.msg7 = msg7;
		this.msgLength7 = msgLength7;
		this.msg8 = msg8;
		this.msgLength8 = msgLength8;
		this.msg9 = msg9;
		this.msgLength9 = msgLength9;
		this.msg10 = msg10;
		this.msgLength10 = msgLength10;
		this.valPeriod = valPeriod;
		this.noOfMsg = noOfMsg;
		this.active = active;
		this.profStatus = profStatus;
		this.campKey = campKey;
		this.campType = campType;
		this.thrputMps = thrputMps;
		this.microseconds = microseconds;
		this.compId = compId;
		this.chrgAccId = chrgAccId;
		this.dcs = dcs;
		this.readCon = readCon;
		this.enableTax = enableTax;
	}

	public Integer getProfNum() {
		return profNum;
	}

	public void setProfNum(Integer profNum) {
		this.profNum = profNum;
	}

	public String getAddedDT() {
		return addedDT;
	}

	public void setAddedDT(String addedDT) {
		this.addedDT = addedDT;
	}

	public String getRestartDT() {
		return restartDT;
	}

	public void setRestartDT(String restartDT) {
		this.restartDT = restartDT;
	}

	public String getaNum() {
		return aNum;
	}

	public void setaNum(String aNum) {
		this.aNum = aNum;
	}

	public Integer getaNumType() {
		return aNumType;
	}

	public void setaNumType(Integer aNumType) {
		this.aNumType = aNumType;
	}

	public Integer getLongMsg() {
		return longMsg;
	}

	public void setLongMsg(Integer longMsg) {
		this.longMsg = longMsg;
	}

	public Integer getTtlSegments() {
		return ttlSegments;
	}

	public void setTtlSegments(Integer ttlSegments) {
		this.ttlSegments = ttlSegments;
	}

	public String getMsg1() {
		return msg1;
	}

	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public Integer getMsgLength1() {
		return msgLength1;
	}

	public void setMsgLength1(Integer msgLength1) {
		this.msgLength1 = msgLength1;
	}

	public String getMsg2() {
		return msg2;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public Integer getMsgLength2() {
		return msgLength2;
	}

	public void setMsgLength2(Integer msgLength2) {
		this.msgLength2 = msgLength2;
	}

	public String getMsg3() {
		return msg3;
	}

	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}

	public Integer getMsgLength3() {
		return msgLength3;
	}

	public void setMsgLength3(Integer msgLength3) {
		this.msgLength3 = msgLength3;
	}

	public String getMsg4() {
		return msg4;
	}

	public void setMsg4(String msg4) {
		this.msg4 = msg4;
	}

	public Integer getMsgLength4() {
		return msgLength4;
	}

	public void setMsgLength4(Integer msgLength4) {
		this.msgLength4 = msgLength4;
	}

	public String getMsg5() {
		return msg5;
	}

	public void setMsg5(String msg5) {
		this.msg5 = msg5;
	}

	public Integer getMsgLength5() {
		return msgLength5;
	}

	public void setMsgLength5(Integer msgLength5) {
		this.msgLength5 = msgLength5;
	}

	public String getMsg6() {
		return msg6;
	}

	public void setMsg6(String msg6) {
		this.msg6 = msg6;
	}

	public Integer getMsgLength6() {
		return msgLength6;
	}

	public void setMsgLength6(Integer msgLength6) {
		this.msgLength6 = msgLength6;
	}

	public String getMsg7() {
		return msg7;
	}

	public void setMsg7(String msg7) {
		this.msg7 = msg7;
	}

	public Integer getMsgLength7() {
		return msgLength7;
	}

	public void setMsgLength7(Integer msgLength7) {
		this.msgLength7 = msgLength7;
	}

	public String getMsg8() {
		return msg8;
	}

	public void setMsg8(String msg8) {
		this.msg8 = msg8;
	}

	public Integer getMsgLength8() {
		return msgLength8;
	}

	public void setMsgLength8(Integer msgLength8) {
		this.msgLength8 = msgLength8;
	}

	public String getMsg9() {
		return msg9;
	}

	public void setMsg9(String msg9) {
		this.msg9 = msg9;
	}

	public Integer getMsgLength9() {
		return msgLength9;
	}

	public void setMsgLength9(Integer msgLength9) {
		this.msgLength9 = msgLength9;
	}

	public String getMsg10() {
		return msg10;
	}

	public void setMsg10(String msg10) {
		this.msg10 = msg10;
	}

	public Integer getMsgLength10() {
		return msgLength10;
	}

	public void setMsgLength10(Integer msgLength10) {
		this.msgLength10 = msgLength10;
	}

	public Integer getValPeriod() {
		return valPeriod;
	}

	public void setValPeriod(Integer valPeriod) {
		this.valPeriod = valPeriod;
	}

	public Integer getNoOfMsg() {
		return noOfMsg;
	}

	public void setNoOfMsg(Integer noOfMsg) {
		this.noOfMsg = noOfMsg;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Integer getProfStatus() {
		return profStatus;
	}

	public void setProfStatus(Integer profStatus) {
		this.profStatus = profStatus;
	}

	public String getCampKey() {
		return campKey;
	}

	public void setCampKey(String campKey) {
		this.campKey = campKey;
	}

	public Integer getCampType() {
		return campType;
	}

	public void setCampType(Integer campType) {
		this.campType = campType;
	}

	public Integer getThrputMps() {
		return thrputMps;
	}

	public void setThrputMps(Integer thrputMps) {
		this.thrputMps = thrputMps;
	}

	public Integer getMicroseconds() {
		return microseconds;
	}

	public void setMicroseconds(Integer microseconds) {
		this.microseconds = microseconds;
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

	public Integer getDcs() {
		return dcs;
	}

	public void setDcs(Integer dcs) {
		this.dcs = dcs;
	}

	public Integer getReadCon() {
		return readCon;
	}

	public void setReadCon(Integer readCon) {
		this.readCon = readCon;
	}

	public Integer getEnableTax() {
		return enableTax;
	}

	public void setEnableTax(Integer enableTax) {
		this.enableTax = enableTax;
	}
	
	

	
}
