<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MenuOT</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>
<body>
	<!-- <h2>Menu OT</h2> -->
	<h3>Menu OT</h3>
	<div class="container mt-4">

		<a href="/listar" class="btn btn-primary">Listar</a>
		<a href="/new" class="btn btn-info">Nuevo</a>
		<table class="table">
			<thead>
				<tr>
					<th>Numero OT</th>
					<th>Fecha actividad</th>
					<th>Valor</th>
					<th>Pago</th>
					<th>Status actividad</th>
					<th>Rut cliente</th>
					<th>Rut profesional</th>
					<th>Codigo actividad</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ot}" var="ot">
					<tr>
						<td><c:out value="${ot.numot}"/></td>
<%-- 						<fmt:formatDate value="${ots.fecact}" pattern="dd-MM-yyyy"/> --%>
						<td><c:out value="${ot.fecact}"/></td>
						<td><c:out value="${ot.val}"/></td>
						<td><c:out value="${ot.pag}"/></td>
						<td><c:out value="${ot.statact}"/></td>
						<td><c:out value="${ot.rutcli}"/></td>
						<td><c:out value="${ot.rutprof}"/></td>
						<td><c:out value="${ot.codact}"/></td>
						<td><a href="/editar/${ot.numot}" class="btn btn-warning">Editar </a>
							<a href="/eliminar/${ot.numot}" class="btn btn-danger">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>


		</table>
	</div>
<!-- 	<script src="https://code.jquery.com/jquery-3.5.1.js"></script> -->
<!-- 	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script> -->
<!-- 	<script src="funcion.js"></script> -->
</body>
</html>