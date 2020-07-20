<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado consulta clientes</title>
<link rel="Stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css">
<!--  FONT OSWALD -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Oswald:wght@200;300;400&display=swap">
<!-- CUSTON STYLE CSS -->
<link rel="Stylesheet" href="Estilos/Estilos.css">
</head>
<body>
	<div class="menu-boton">
		<i class="fas fa-bars"></i>
	</div>

	<div>
		<nav class="nav-main">
			<img alt="Logo Principal" src="img/logo.png" class="nav-logo">
			<ul class="nav-menu">
				<li><a href="ingresocliente.jsp">Clientes</a></li>
				<li><a href="CreacionOT.jsp">OT</a></li>
				<li><a href="informe.jsp">Informes de gestión</a></li>
				<li><a href="Ingresoprofesional.jsp">Profesionales</a></li>
				<li><a href="ingreso.jsp">Accidentes</a></li>
			</ul>
			<ul class="nav-menu-derecha">
				<li><a href="#"> <i class="fas fa-search"></i>
				</a></li>
			</ul>
		</nav>
		<hr>
	</div>

	<c:out value="${mensajeeli}"></c:out>
	<c:out value="${mensajeact}"></c:out>

	<table>
		<thead>
			<tr>
				<th>Nombre Cliente</th>
				<th>Descripsion</th>
				<th>Fecha accidente</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list_acc}" var="Accidente">
				<tr>
					<td>${Accidente.nombrecliente}</td>
					<td>${Accidente.descripsion}</td>
					<td>${Accidente.fechaacc}</td>
					<td><a
						href="${pageContext.request.contextPath}/ServletEliminarAccidente?id=${Accidente.id}">eliminar</a>
					</td>
					<td><a href="actualizar.html"> actualizar datos</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>

	<form action="ServletConsultaAccidente" method="get">
		<input type="submit" name="consultaracc" value="consultar">
	</form>

	<a href="ingreso.jsp">Ir a ingreso accidentes</a>

	<!-- INVOCAR JS -->
	<script type="text/javascript" src="js/inicio.js"></script>
</body>
</html>