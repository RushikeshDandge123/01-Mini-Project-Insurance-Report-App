package com.rushikeshit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rushikeshit.entity.CitizenPlan;
import com.rushikeshit.repository.CitizenPlanRepository;
import com.rushikeshit.request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	CitizenPlanRepository citizenRepo;
	
	@Override
	public List<String> getPlanName() {

		return null;
	}

	@Override
	public List<String> getPlanStatus() {

		return null;
	}

	@Override
	public boolean exportExcel() {

		return false;
	}

	@Override
	public boolean exportPdf() {

		return false;
	}

	@Override
	public List<CitizenPlan> SearchRequest(SearchRequest request) {
		
		return null;
	}



}
