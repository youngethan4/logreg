package com.tcs.springbootmvcdemo.service;

import java.util.Optional;

import com.tcs.springbootmvcdemo.model.Login;

public interface LoginService {

	public Optional<Login> findById(String username);
	
}
