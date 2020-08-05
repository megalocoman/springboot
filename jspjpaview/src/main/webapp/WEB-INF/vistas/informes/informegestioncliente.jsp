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
				<th>Nombre de cliente</th>
				<th>Numero de accidentes</th>
				<th>Numero de actividad</th>
				<th>valor total de las asesorias</th>
				<th>Monto pagado del cliente</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${informecliente}" var="informe">
				<tr>
					<td>${informe.getNombrecliente()}</td>
					<td>${informe.getNaccidentes()}</td>
					<td>${informe.getNactividad()}</td>
					<td>${informe.getValortotal()}</td>
					<td>${informe.getValorpagado()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>