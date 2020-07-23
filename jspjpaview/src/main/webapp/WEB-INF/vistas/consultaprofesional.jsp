<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>rut profesional</th>
			<th>nombre profesional</th>
			<th>correo</th>
			<th>telefono</th>
		</tr>
		<tr>
		<th>${profesional.rutprofesional }</th>
		<th>${profesional.nombre}</th>
		<th>${profesional.telefono}</th>
		<th>${profesional.correo}</th>
		</tr>

	</table>
</body>
</html>