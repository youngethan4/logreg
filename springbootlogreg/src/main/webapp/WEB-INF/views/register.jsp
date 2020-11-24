<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<h1>Register</h1>
	<p>${reg}</p>
	<form action="/registration/register.html" method="post">
		<label for="username">Create Username:</label> 
		<input type="text" id="username" name="username"><br> 
		<p>${username}</p>
		<label for="password">Create Password:</label>
		<input type="password" id="password" name="password"><br>
		<p>${password}</p>
		<label for="confirm">Confirm Password:</label>
		<input type="password" id="confirm" name="confirm"><br>
		<p>${confirm}</p>
		<input type="submit" value="login">
	</form>
</body>
</html>