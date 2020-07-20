<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informes de gestión</title>
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

	<h1>Informes de gestion</h1>
	<h2>informe de gestion profesional</h2>

	<table>
		<thead>
			<tr>
				<th>Profesional</th>
				<th>Numero de cliente</th>
				<th>Numero de actividades</th>
				<th>Valor total</th>
				<th>Monto total pagado</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="table" items="${informe_prof}">
				<tr>

					<td>${table.profesional}</td>
					<td>${table.ncliente}</td>
					<td>${table.nactividades}</td>
					<td>${table.valortotal}</td>
					<td>${table.totalpagado}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<form action="ServletInformeProfesional" method="get">
		<input type="submit" name="inf_profesional" value="crear informe">
	</form>


	<h2>Informe clientes</h2>

	<table id="table1">
		<thead>
			<tr>
				<th>Cliente</th>
				<th>Numero actividades</th>
				<th>Valor actividades</th>
				<th>Total pagado</th>
				<th>total accidentes</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="lista" items="${informe_cli}">
				<tr>
					<td>${lista.nombrecliente}</td>
					<td>${lista.numeroactividades}</td>
					<td>${lista.valortotal}</td>
					<td>${lista.valorpagado}</td>
					<td>${lista.naccidentes}</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>

	<form action="ServletInformeCliente" method="get">
		<input type="submit" name="inf_profesional" value="crear informe">
	</form>

	<!-- INVOCAR JS -->
	<script type="text/javascript" src="js/inicio.js"></script>

</body>
</html>