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
<!-- 	<a href="/consultaacc" class="btn btn-primary">Consultar</a> -->
	<a href="/paginaingresoaccidente" class="btn btn-info">Nuevo</a>
	
		<table class="table">
			<thead>
				<tr>
					<th>Nombre cliente</th>
					<th>descripsion</th>
					<th>Fecha accidente</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listacc}" var="acc">
					<tr>
						<td>${acc.nombrecliente}</td>
						<td>${acc.descripsion}</td>
						<td><fmt:formatDate value="${acc.fechaaccidente}"/></td>
<%-- 						<td>${acc.fechaaccidente}</td> --%>
						<td><a href="/elimaccidente/${acc.idaccidente}" class="btn btn-warning">Eliminar</a></td>
						<td><a href="/actaccidente/${acc.idaccidente}" class="btn btn-danger">Actualizar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>
</html>