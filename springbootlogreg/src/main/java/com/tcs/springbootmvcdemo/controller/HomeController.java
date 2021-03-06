package com.tcs.springbootmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@GetMapping("/")
	//@RequestMapping(path = {"/"}, method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("/guest")
	public String getGuestPage(@RequestAttribute("fname") String fname, Model model) {
		System.out.println(fname);
		model.addAttribute("mname", "R");
		return "guest";
	}
}
