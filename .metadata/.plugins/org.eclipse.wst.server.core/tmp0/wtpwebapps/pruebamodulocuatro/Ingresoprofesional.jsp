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


	<c:out value="${mensajeing}"></c:out>
	<h1>Ingreso datos profesionales</h1>
	<form action="ServletIngresoProf" method="post">
		Rut profesional: <input type="text" name="rut_prof" id="rut_prof"><br>
		Nombre profesional: <input type="text" name="nom_prof"	id="nom_prof"><br> 
		Telefono: <input type="text" name="telefono" id="telefono"><br> 
		correo: <input	type="text" name="correo" id="correo"><br>
		<input	type="submit" name="ing_prof" value="ingresar">
	</form>
	<a href="consultaprofesional.jsp"> ir a consultar profesionales</a>
	<!-- INVOCAR JS -->
	<script type="text/javascript" src="js/inicio.js"></script>
</body>
</html>