package com.tcs.logreg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.logreg.model.Login;
import com.tcs.logreg.repository.LoginRepository;

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
