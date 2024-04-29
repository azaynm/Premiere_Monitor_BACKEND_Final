package com.MSMSPerformanceMonitor.smsbulkim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "esms_company_prof")
public class CompanyProfile {

	@Id
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "acc_no")
	private Integer accNo;
	
	@Column(name = "name")
	private String name;

	@Column(name = "contact_no")
	private String contactNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	
	@Column(name = "max_bulk_sms_count")
	private Integer maxBulkSmsCount;
	
	@Column(name = "acc_mngr_email")
	private String accMngrEmail;
	
	@Column(name = "acc_mngr_code")
	private String accMngrCode;
	
	@Column(name = "charging_method")
	private String chargingMethod;
	
	@Column(name = "optout")
	private Integer optout;
	
	@Column(name = "added_by")
	private String addedBy;
	
	@Column(name = "added_date")
	private String addedDate;
	
	@Column(name = "removed_date")
	private String removedDate;
	
	@Column(name = "removed_by")
	private String removedBy;
	
	@Column(name = "block_company")
	private Integer blockCompany;
	
	
	@Column(name = "modify_by")
	private String modifyBy;
	
	@Column(name = "modify_date")
	private String modifyDate;
	
	
	@Column(name = "display_extra_info")
	private Integer displayExtraInfo;
	
	
	
	public CompanyProfile() {

	}



	public CompanyProfile(Integer id, Integer accNo, String name, String contactNo, String email, String address,
			Integer maxBulkSmsCount, String accMngrEmail, String accMngrCode, String chargingMethod, Integer optout,
			String addedBy, String addedDate, String removedDate, String removedBy, Integer blockCompany,
			String modifyBy, String modifyDate, Integer displayExtraInfo) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.name = name;
		this.contactNo = contactNo;
		this.email = email;
		this.address = address;
		this.maxBulkSmsCount = maxBulkSmsCount;
		this.accMngrEmail = accMngrEmail;
		this.accMngrCode = accMngrCode;
		this.chargingMethod = chargingMethod;
		this.optout = optout;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.removedDate = removedDate;
		this.removedBy = removedBy;
		this.blockCompany = blockCompany;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.displayExtraInfo = displayExtraInfo;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getAccNo() {
		return accNo;
	}



	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getContactNo() {
		return contactNo;
	}



	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Integer getMaxBulkSmsCount() {
		return maxBulkSmsCount;
	}



	public void setMaxBulkSmsCount(Integer maxBulkSmsCount) {
		this.maxBulkSmsCount = maxBulkSmsCount;
	}



	public String getAccMngrEmail() {
		return accMngrEmail;
	}



	public void setAccMngrEmail(String accMngrEmail) {
		this.accMngrEmail = accMngrEmail;
	}



	public String getAccMngrCode() {
		return accMngrCode;
	}



	public void setAccMngrCode(String accMngrCode) {
		this.accMngrCode = accMngrCode;
	}



	public String getChargingMethod() {
		return chargingMethod;
	}



	public void setChargingMethod(String chargingMethod) {
		this.chargingMethod = chargingMethod;
	}



	public Integer getOptout() {
		return optout;
	}



	public void setOptout(Integer optout) {
		this.optout = optout;
	}



	public String getAddedBy() {
		return addedBy;
	}



	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}



	public String getAddedDate() {
		return addedDate;
	}



	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}



	public String getRemovedDate() {
		return removedDate;
	}



	public void setRemovedDate(String removedDate) {
		this.removedDate = removedDate;
	}



	public String getRemovedBy() {
		return removedBy;
	}



	public void setRemovedBy(String removedBy) {
		this.removedBy = removedBy;
	}



	public Integer getBlockCompany() {
		return blockCompany;
	}



	public void setBlockCompany(Integer blockCompany) {
		this.blockCompany = blockCompany;
	}



	public String getModifyBy() {
		return modifyBy;
	}



	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}



	public String getModifyDate() {
		return modifyDate;
	}



	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}



	public Integer getDisplayExtraInfo() {
		return displayExtraInfo;
	}



	public void setDisplayExtraInfo(Integer displayExtraInfo) {
		this.displayExtraInfo = displayExtraInfo;
	}



	




	

	
	
}

