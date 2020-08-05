<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
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
				<td><a href="/actualizarprofesional/${profesional.rutprofesional}">Actualidad</a></td>
				<td><a href="/eliminarprofesional/${profesional.rutprofesional}">Eliminar</a></td>
			</tr>

		</c:forEach>



	</table>
</body>
</html>