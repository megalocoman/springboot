<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
 <div class="container mt-4">
 <a href="/paginaingresoprofesional" class="btn btn-info">Ingreso profesional</a>
 	<table class="table">
		<thead>
			<tr>
				<th>rut profesional</th>
				<th>nombre profesional</th>
				<th>correo</th>
				<th>telefono</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
		<c:forEach items="${listprof}" var="profesional">
			<tr>
				<td>${profesional.rutprofesional }</td>
				<td>${profesional.nombre}</td>
				<td>${profesional.correo}</td>
				<td>${profesional.telefono}</td>
				<td><a href="/actualizarprofesional/${profesional.rutprofesional}" class="btn btn-warning">Actualidad</a></td>
				<td><a href="/eliminarprofesional/${profesional.rutprofesional}" class="btn btn-danger">Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
 </div>
 
 
	
</body>
</html>