<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}

	<form action="login" method="post">

		Usuario: <input type='text' name='usuario'> 
		clave: <input type='password' name='clave'> 
		<input type="submit" value="ingresar">

	</form>

</body>
</html>