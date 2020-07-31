<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>acceso universas</title>
</head>
<body>
<h1>todos estan bienvenidos independiente del rol</h1>

<p>Usted es el usuario: <sec:authentication property="principal.username"></sec:authentication></p>

<sec:authorize access="hasAuthority('profesional')">

Usted ve este mensaje por que es profesional

</sec:authorize>

<sec:authorize access="hasAuthority('administracion')">
Usted ve este mensaje por que es del area de administracion

</sec:authorize>

<a href="/logout"> presione para teminar sesion</a>
</body>
</html>