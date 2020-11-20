package com.tcs.logreg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.logreg.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

}
