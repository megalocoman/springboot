<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="js/validaciones.js"></script>
<!-- <link rel="StyleSheet" href="Estilos/estilo.css" type="text/css"> -->
<link rel="Stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css">
<!--  FONT OSWALD -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Oswald:wght@200;300;400&display=swap">
<!-- CUSTON STYLE CSS -->
<link rel="Stylesheet" href="Estilos/Estilos.css">
<link rel="Stylesheet" href="Estilos/estilos.css">

<title>Listado OT</title>
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

	<h1>Listado de OT</h1>

	<c:if test="${cumensaje != null}">
		<c:out value="${cumensaje}" />
	</c:if>

	<table>
		<thead>

			<tr>
				<th class="cabecera">Número OT</th>
				<th class="cabecera">Fecha</th>
				<th class="cabecera">Valor</th>
				<th class="cabecera">Pago</th>
				<th class="cabecera">Status Actividad</th>
				<th class="cabecera">Rut Cliente</th>
				<th class="cabecera">Rut Profesional</th>
				<th class="cabecera">Actividad</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${listadoot}" var="user">
				<tr>
					<td>${user.numeroot}</td>
					<td>${user.fecha_actividad}</td>
					<td>${user.valor}</td>
					<td>${user.pago}</td>
					<td>${user.statusactividad}</td>
					<td>${user.nombrecliente}</td>
					<td>${user.nombreprof}</td>
					<td>${user.descripcion}</td>
				</tr>
			</c:forEach>

		</tbody>



	</table>
	<br>
	<br>
	<!-- 	<table> -->
	<!-- 		<tr> -->

	<form action="ListarOT" method="get">
		<input type="submit" name="consultarprof" value="consultar">
	</form>

	<div id="Boton">
		<a href="${pageContext.request.contextPath}/CrearOT">Creación OT</a>
	</div>
	<!-- 		</tr> -->
	<!-- 	</table> -->

</body>
</html>