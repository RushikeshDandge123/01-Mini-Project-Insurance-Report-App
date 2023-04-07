package com.rushikeshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rushikeshit.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	ReportService ReportService;
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
}
