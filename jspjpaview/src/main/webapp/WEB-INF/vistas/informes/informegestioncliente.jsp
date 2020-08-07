<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-striped table-bordered ">
		<thead  class="thead-dark">
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
					<td><fmt:formatNumber value="${informe.getValortotal()}" type="currency" minFractionDigits="0"/></td>
					<td><fmt:formatNumber value="${informe.getValorpagado()}" type="currency" minFractionDigits="0"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>