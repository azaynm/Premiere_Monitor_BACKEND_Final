package com.MSMSPerformanceMonitor.smsbulkim.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "esms_opted")
public class ESMSOpted {

    @Id
    @Column(name = "Mobile_Number", nullable = false)
    private Long mobileNumber;

    @Column(name = "senderID", nullable = false, columnDefinition = "int default 0")
    private Integer senderID;


    public ESMSOpted() {
    }

    public ESMSOpted(Long mobileNumber, Integer senderID) {
        this.mobileNumber = mobileNumber;
        this.senderID = senderID;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getSenderID() {
        return senderID;
    }

    public void setSenderID(Integer senderID) {
        this.senderID = senderID;
    }
}

