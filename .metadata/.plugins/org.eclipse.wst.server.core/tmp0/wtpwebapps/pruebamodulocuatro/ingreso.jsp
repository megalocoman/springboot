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
	<h1>Ingreso accidente cliente</h1>

	<c:out value="${mensaje}"></c:out>

	<form action="ServletAccidentes" method="post">
		Cliente: <input type="text" name="cliente" id="cliente"> <br>
		Descripsion: <input type="text" name="des_incidente" id="des_incidente"><br> 
		fecha: <input type="date" name="fecha_inc" id="fecha_inc"><br> 
		<input	type="submit" name="ing_incidente" value="ingresar">
	</form>

	<a href="${pageContext.request.contextPath}/ServletConsultaAccidente">Ir
		a lista de accidentes</a>
	<!-- INVOCAR JS -->
	<script type="text/javascript" src="js/inicio.js"></script>
</body>
</html>