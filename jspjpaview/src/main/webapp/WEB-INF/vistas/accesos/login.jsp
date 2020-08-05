<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}

	<form action="login" method="post">

		Usuario: <input type='text' name='username'> 
		clave: <input type='password' name='password'> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="ingresar">

	</form>
</body>
</html>