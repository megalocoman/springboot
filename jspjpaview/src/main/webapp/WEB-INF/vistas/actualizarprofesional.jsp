<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualizar registro profesionales</title>
</head>
<body>
<form:form method="get"  action="/actprofesional">
	Rut cliente: <form:input path="rutprofesional"/><br>
	nombre: <form:input path="nombre"/><br>
	correo: <form:input path="correo"/><br>
	telefono: <form:input path="telefono"/><br>
	<input type="submit" value="ingresar cliente">
</form:form>
</body>
</html>