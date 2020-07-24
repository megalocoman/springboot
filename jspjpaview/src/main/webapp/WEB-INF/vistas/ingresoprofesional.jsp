<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingreso de clientes</title>
</head>
<body>
<h1>Ingrese su cliente</h1>
<form:form method="get"  action="/ingprofesional">
	Rut profesional: <form:input path="rutprofesional"/><br>
	Nombre: <form:input path="nombre"/><br>
	Correo: <form:input path="correo"/><br>
	Telefono: <form:input path="telefono"/><br>
	<input type="submit" value="ingresar profesional">
</form:form>

<a href="/consultaprofesional">consultar profesionales</a>
</body>
</html>