package com.tcs.logreg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.logreg.model.Login;
import com.tcs.logreg.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public Optional<Login> findById(String username) {
		return loginRepository.findById(username);
	}

}
