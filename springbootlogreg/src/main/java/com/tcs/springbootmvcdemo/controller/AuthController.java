package com.tcs.springbootmvcdemo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.springbootmvcdemo.model.Login;
import com.tcs.springbootmvcdemo.repository.LoginRepository;
import com.tcs.springbootmvcdemo.service.LoginService;

@Controller
@RequestMapping(path="/auth")
public class AuthController {

	@Autowired
	LoginRepository loginService;
	
	@GetMapping("/login.html")
	public String getLoginPage(){
		return "login";
	}
	
	@PostMapping("/login.html")
	public ModelAndView validateLogin(@ModelAttribute @Valid Login login, BindingResult result) {
		System.out.println("hello from validate login." + login);
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			result.getFieldErrors().forEach(e -> {
				modelAndView.addObject(e.getField(), e.getDefaultMessage());
				System.out.println(e.getDefaultMessage());
			});
			modelAndView.setViewName("login");
		}
		else {
			Optional<Login> optional = loginService.findById(login.getUsername());
			if(optional.isPresent() && login.equals(optional.get())) {
				System.out.println("Success");
				modelAndView.setViewName("redirect:/dashboard.html");
			} else {
				System.out.println("fail");
				modelAndView.addObject("login", "Username and/or password incorrect.");
				modelAndView.setViewName("login");
			}
		}
		return modelAndView;
	}
	
}
