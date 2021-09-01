package com.cit.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import java.lang.Math;

@Entity
public class IssueDetail {
	
	@Id
	String custIssueId;
	@NotNull(message="required")
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	Date issueReportDate;
	@NotBlank(message="required")
	String custId;
	@NotBlank(message="required")
	String category; //Complaint - Feedback - Suggestion
	@NotBlank(message="required")
	String description;
	String issueStatus;//InProgress;Closed;Open
	String ccRepId; // Customer Care Representative Id
	
	public IssueDetail() {
		super();
	}

	public IssueDetail(String custIssueId, Date issueReportDate, String custId, String category, String description,
			String issueStatus, String ccRepId) {
		super();
		this.custIssueId = custIssueId;
		this.issueReportDate = issueReportDate;
		this.custId = custId;
		this.category = category;
		this.description = description;
		this.issueStatus = issueStatus;
		this.ccRepId = ccRepId;
	}

	public String getCustIssueId() {
		return custIssueId;
	}

	public void setCustIssueId(String custIssueId) {
		this.custIssueId = (custIssueId+(int)(Math.random()*(1000-10+1)+10));
	}

	public Date getIssueReportDate() {
		return issueReportDate;
	}

	public void setIssueReportDate(Date issueReportDate) {
		this.issueReportDate = issueReportDate;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public String getCcRepId() {
		//return (ccRepId+(int)(Math.random()*(100-0+1)+0));
		return ccRepId;
	}

	public void setCcRepId(String ccRepId) {
		this.ccRepId = (ccRepId+(int)(Math.random()*(100-0+1)+0));
	}

	@Override
	public String toString() {
		return "IssueDetail [custIssueId=" + custIssueId + ", issueReportDate=" + issueReportDate + ", custId=" + custId
				+ ", category=" + category + ", description=" + description + ", issueStatus=" + issueStatus
				+ ", ccRepId=" + ccRepId + "]";
	}
	
}
