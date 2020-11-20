package com.tcs.logreg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//@GetMapping("/")
	@RequestMapping(path = {"/"}, method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}
}
