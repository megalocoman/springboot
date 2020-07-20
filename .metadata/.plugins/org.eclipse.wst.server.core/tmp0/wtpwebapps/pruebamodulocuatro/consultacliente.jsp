<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

	<c:out value="${mensaje}"></c:out>
	<c:out value="${mensajeact}"></c:out>
	<h1>consulta Clientes</h1>
	<table>
		<thead>
			<tr>
				<th>Rut Profesional</th>
				<th>Nombre</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Correo</th>
				<th>Contacto</th>

			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list_cli}" var="Cliente">
				<tr>
					<td>${Cliente.rutcliente}</td>
					<td>${Cliente.nombrecliente}</td>
					<td>${Cliente.direccion}</td>
					<td>${Cliente.telefono}</td>
					<td>${Cliente.correo}</td>
					<td>${Cliente.contacto}</td>
					<td><a
						href="${pageContext.request.contextPath}/ServletEliminarCliente?rutcliente=${Cliente.rutcliente}">eliminar</a></td>
					<td><a href="actualizarcliente.jsp"> actualizar</a></td>

				</tr>
			</c:forEach>

		</tbody>
	</table>

	<form action="ServletConsultaCliente" method="get">
		<input type="submit" name="consultarcli" value="consultar">
	</form>

	<a href="ingresocliente.jsp">ir a ingreso cliente</a>

	<!-- INVOCAR JS -->
	<script type="text/javascript" src="js/inicio.js"></script>
</body>
</html>