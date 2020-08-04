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
				<th>Nombre del profesionales</th>
				<th>Numero total de actividades</th>
				<th>Numero total de accidentes</th>
				<th>Valor total de las actividades</th>
				<th>Monto recaudao por el cliente</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${informeprofesional}" var="informe">
				<tr>
					<td>${informe.getNombrecliente()}</td>
					<td>${informe.getNumeroactividades()}</td>
					<td>${informe.getNaccidentes()}</td>
					<td>${informe.getValortotal()}</td>
					<td>${informe.getValorpagado()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>