package com.tcs.springbootmvcdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springbootmvcdemo.model.Login;
import com.tcs.springbootmvcdemo.repository.LoginRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public String save(Login login) {
		try {
			loginRepository.save(login);
			return "success";
		} catch(Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}

}
