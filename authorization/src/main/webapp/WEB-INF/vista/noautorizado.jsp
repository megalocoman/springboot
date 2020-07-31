<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pagina sin autentificacion </title>
</head>
<body>
<h1>Hola a todos</h1>

	    authenticated as <sec:authentication property="user.username" /> 
	

<sec:authorize access="hasRole('administrador')">

solo lo puede ver el administrador

</sec:authorize>

<sec:authorize access="hasRole('profesional')">

solo lo puede ver el profesional

</sec:authorize>
</body>
</html>