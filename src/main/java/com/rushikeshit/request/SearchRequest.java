package com.rushikeshit.request;

import java.time.LocalDate;

public class SearchRequest {

	private String planName;
	private String gender;
	private String planStatus;
	private LocalDate startDate;
	private LocalDate endDate;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "SearchRequest [planName=" + planName + ", gender=" + gender + ", planStatus=" + planStatus
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
