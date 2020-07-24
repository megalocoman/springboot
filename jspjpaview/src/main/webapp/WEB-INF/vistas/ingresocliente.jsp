<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingreso cliente</title>
</head>
<body>
<h1>ingrese registro de clientes</h1>

<form:form method="get"  action="/ingrcliente">
	Rut cliente: <form:input path="rutcliente"/><br>
	Nombre: <form:input path="nombrecliente"/><br>
	Direccion: <form:input path="direccion"/><br>
	Telefono: <form:input path="telefono"/><br>
	Correo: <form:input path="correo"/><br>
	Contacto: <form:input path="contacto"/><br>
	<input type="submit" value="ingresar cliente">
</form:form>

<a href="/consultacliente">consultar clientes</a>

</body>
</html>