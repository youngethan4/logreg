package com.tcs.logreg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.logreg.model.Login;
import com.tcs.logreg.model.Register;
import com.tcs.logreg.service.LoginService;
import com.tcs.logreg.service.RegistrationService;

@Controller
@RequestMapping(path="/registration")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@GetMapping("/register.html")
	public String getRegisterPage() {
		return "register";
	}
	
	@PostMapping("/register.html")
	public ModelAndView validateRegistration(@ModelAttribute @Valid Register register, BindingResult result) {
		System.out.println("hello from validate registration." + register);
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			result.getFieldErrors().forEach(e -> {
				modelAndView.addObject(e.getField(), e.getDefaultMessage());
				System.out.println(e.getDefaultMessage());
			});
			modelAndView.setViewName("register");
		} 
		else if(!register.getPassword().equals(register.getConfirm())) {
			modelAndView.addObject("confirm", "Passwords do not match");
			modelAndView.setViewName("register");
		} else {
			Login login = new Login(register.getUsername(), register.getPassword());
			String registered = registrationService.save(login);
			if(registered.equals("success")) {
				modelAndView.setViewName("redirect:/dashboard.html");
			} else {
				modelAndView.addObject("reg", "Registration failed. Please try again.");
				modelAndView.setViewName("register");
			}
		}
		return modelAndView;
	}
}
