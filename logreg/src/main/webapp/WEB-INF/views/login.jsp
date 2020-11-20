<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<p>${login}</p>
	<form action="/auth/login.html" method="post">
		<label for="username">Username:</label> 
		<input type="text" id="username" name="username"><br> 
		<p>${username}</p>
		<label for="password">Password:</label>
		<input type="password" id="password" name="password"><br>
		<p>${password}</p>
		<input type="submit" value="login">
	</form>
</body>
</html>