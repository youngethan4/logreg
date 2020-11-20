package com.tcs.logreg.model;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {
	
	@Size(max=20, min=3, message="password is not valid.")
	private String username;
	@Size(max=20, min=3, message="password is not valid.")
	private String password;
	@Size(max=20, min=3, message="password is not valid.")
	private String confirm;

}
