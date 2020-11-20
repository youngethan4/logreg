package com.tcs.logreg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc // it will enable the mvc env (@requestbaody, controller , response body, requestmapping, @valid
@ComponentScan("com.tcs.logreg")
public class WebConfig {

	@Bean
	public InternalResourceViewResolver	 resolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
