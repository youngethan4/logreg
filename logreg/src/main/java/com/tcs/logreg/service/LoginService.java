package com.tcs.logreg.service;

import java.util.Optional;

import com.tcs.logreg.model.Login;

public interface LoginService {

	public Optional<Login> findById(String username);
	
}
