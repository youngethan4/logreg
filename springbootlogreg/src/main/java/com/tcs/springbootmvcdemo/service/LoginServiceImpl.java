package com.tcs.springbootmvcdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springbootmvcdemo.model.Login;
import com.tcs.springbootmvcdemo.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public Optional<Login> findById(String username) {
		return loginRepository.findById(username);
	}

}
