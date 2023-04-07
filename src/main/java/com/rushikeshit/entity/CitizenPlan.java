package com.rushikeshit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITIZEN_PLANS_INFO")
public class CitizenPlan {

	@Id
	private Integer citizenId;
	private String citizenName;
	private String emailId;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private Double benefitAmount;

	@Override
	public String toString() {
		return "CitizenPlan [citizenId=" + citizenId + ", citizenName=" + citizenName + ", emailId=" + emailId
				+ ", gender=" + gender + ", planName=" + planName + ", planStatus=" + planStatus + ", startDate="
				+ startDate + ", endDate=" + endDate + ", benefitAmount=" + benefitAmount + "]";
	}

	public Integer getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Double getBenefitAmount() {
		return benefitAmount;
	}

	public void setBenefitAmount(Double benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

}
