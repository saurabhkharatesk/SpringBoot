<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
	body {
		font-family: Arial, sans-serif;
		background-color: #f4f4f4;
		margin: 0;
		display: flex;
		justify-content: center;
		align-items: center;
		height: 100vh;
		
	}

	.login-container {
		background-color: #fff;
		border-radius: 8px;
		box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
		padding: 20px;
		width: 300px;
		text-align: center;
	}

	.login-container h2 {
		color: #333;
	}

	.login-form {
		margin-top: 20px;
	}

	.form-group {
		margin-bottom: 15px;
	}

	.form-group label {
		display: block;
		margin-bottom: 5px;
		color: #555;
	}

	.form-group input {
		width: 100%;
		padding: 4px;
		box-sizing: border-box;
		border: 1px solid #ccc;
		border-radius: 4px;
	}

	.form-group button {
		background-color: #4caf50;
		color: #fff;
		padding: 10px 15px;
		border: none;
		border-radius: 4px;
		cursor: pointer;
	}

	.form-group button:hover {
		background-color: #45a049;
	}
	
</style>
</head>
<body>
	<div class="login-container">
<form action="register" name="fn">
	<h2>Register</h2>
	
	<div class="form-group">
		<label for="name">Name :</label>
		<input type="text" name="name" required>
	</div>
	<div class="form-group">
		<label for="uname">UserName :</label>
		<input type="text" name="uname" required>
	</div>
	<div class="form-group">
		<label for="password">Password :</label>
		<input type="text" name="password" required>
	</div>
	<div class="form-group">
		<label for="mobileno">Mobile No :</label>
		<input type="text" name="mobileno" required>
	</div>
	<div class="form-group">
		<button class="btn btn-success" type="submit" value="Register">Register</button>
	</div>
	</form>
	</div>
</body>
</html>