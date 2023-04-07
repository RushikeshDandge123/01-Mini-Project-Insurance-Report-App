package com.rushikeshit.service;

import java.util.List;

import com.rushikeshit.entity.CitizenPlan;
import com.rushikeshit.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanName();

	public List<String> getPlanStatus();

	public List<CitizenPlan> SearchRequest(SearchRequest request);

	public boolean exportExcel();

	public boolean exportPdf();
}
