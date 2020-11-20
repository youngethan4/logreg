package com.tcs.logreg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
	
	@Id
	@Column(length = 20)
	@Size(max=20, min=3, message="username is not valid.")
	private String username;
	@Size(max=20, min=3, message="password is not valid.")
	private String password;
}
