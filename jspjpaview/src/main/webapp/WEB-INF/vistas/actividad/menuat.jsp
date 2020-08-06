<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InicioACTIVIDADES</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>
<body>
<!-- <h2>Menu Accidentes</h2> -->
	<h3>Menu Actividades</h3>
	<div class="container mt-4">
			<a href="/listarat" class="btn btn-primary">Listar</a>
<!-- 		<a href="/newat" class="btn btn-info">Nuevo</a> -->
		<table class="table">
			<thead>
				<tr>
					<th>Codigo actividad</th>
					<th>Nombre</th>
					<th>Descripcion</th>
				</tr>
			</thead>

			<tbody>
			<c:forEach items="${actividades}" var="actividades">
				<tr>
					<td><c:out value="${actividades.codact}"/></td>
					<td><c:out value="${actividades.nomact}"/></td>
					<td><c:out value="${actividades.descact}"/></td>
					<td>
					<a href="/editarat/${actividades.codact}" class="btn btn-warning">Editar </a>
					<a href="/eliminarat/${actividades.codact}" class="btn btn-danger">Eliminar</a>
<!-- 					<a th:onclick="eliminacion([[${ot.numot}]])" class="btn btn-danger"> Eliminar2</a> -->
					</td>
				</tr>
				</c:forEach>
			</tbody>


		</table>
	</div>
<!-- 	<script  src="https://code.jquery.com/jquery-3.5.1.js"></script> -->
<!-- 	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script> -->
<!-- 	<script src="funcion.js"></script> -->
</body>
</html>