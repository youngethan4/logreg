package com.tcs.logreg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping("/dashboard.html")
	public String getDashboard() {
		return "dashboard";
	}
}
