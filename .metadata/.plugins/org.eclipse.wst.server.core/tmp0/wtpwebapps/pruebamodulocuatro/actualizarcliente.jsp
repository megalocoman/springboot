<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<h1>actualizar datos</h1>
	<h2>actualizar cliente</h2>
	<form action="ServletActualizarCliente" method="get">
		RUT : <input type="text" name="rut_cli" id="rut_cli"> <br>
		Nombre: <input type="text" name="nombre_cli" id="nombre_cli"><br>
		Direccion: <input type="text" name="direccion_cli"	id="direccion_cli"><br>
	 	Telefono: <input type="text" name="telefono_cli" id="telefono_cli"><br> 
		Correo: <input type="text" name="correo_cli" id="correo_cli"><br>
		Contacto: <input type="text" name="contacto_cli" id="contacto_cli"><br>
		<input type="submit" name="actualizar" value="Actualizar">
	</form>
	<a href="consultacliente.jsp">Ir a consulta de cliente</a>

	<!-- INVOCAR JS -->
	<script type="text/javascript" src="js/inicio.js"></script>
</body>
</html>