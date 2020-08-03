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
			<td>${acc.fechaaccidente}</td>
			<td><a href="/elimaccidente/${acc.idaccidente}">Eliminar</a></td>
			<td><a href="/actaccidente/${acc.idaccidente}">Actualizar</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>