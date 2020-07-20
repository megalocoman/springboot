<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>Crear OT</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="StyleSheet" href="Estilos/estilo.css" type="text/css"> -->
<link rel="Stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css">
<!--  FONT OSWALD -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Oswald:wght@200;300;400&display=swap">
<!-- CUSTON STYLE CSS -->
<link rel="Stylesheet" href="Estilos/Estilos.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="js/validaciones.js"></script>

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


<h1>Crear OT</h1>

	<c:if test="${cumensaje != null}">
		<c:out value="${cumensaje}" />
	</c:if>

	<form action="CrearOT" name="formcrea" method="post">
<!-- 		<table width="50%" border="0"> -->
		<table>
			<tr>
				<td width="30%">Fecha actividad</td>
				<td width="70%">
					<label for="txtfecact"></label>
					<input type="text" id="datepicker" name="txtfecact" readonly="">
				</td>
			</tr>
			<tr>
				<td width="30%">Valor</td>
				<td width="70%">
					<label for="txtval"></label>
					<input type="text" name="txtval">
				</td>
			</tr>
			<tr>
				<td width="30%">Pago</td>
				<td width="70%">
					<label for="txtpag"></label>
					<input type="text" name="txtpag">
				</td>
			</tr>
			<tr>
				<td width="30%">Status actividad</td>
				<td width="70%">
					<label for="txtstatact"></label>
					<input type="text" name="txtstatact">
				</td>
			</tr>
			<tr>
				<td width="30%">Rut Cliente (*)</td>
				<td width="70%">
					<label for="txtrutcli"></label>
					<input type="text" name="txtrutcli" >
				</td>
			</tr>
			<tr>
				<td width="30%">Rut Profesional</td>
				<td width="70%">
					<label for="txtrutprof"></label>
					<input type="text" name="txtrutprof">
<!-- 					 -->
				</td>
			</tr>
			<tr>
				<td width="30%">Codigo actividad (*)</td>
				<td width="70%">
					<label for="txtcodact"></label>
					<input type="text" name="txtcodact">
				</td>
			</tr>
	</table>
	<br>
	<br>
		<div id="Boton">
			<input type="submit" onclick="return valida(this)" value="Agregar OT" />
		</div>
	
	
<!-- 	<label for="txtfecact">Fecha actividad:</label> -->
<!-- 		<input type="text" maxlength="10" name="txtfecact" /> <br /> -->
<!-- 		<label for="txtval">Valor OT:</label> -->
<!-- 		<input type="text" name="txtval" /> <br /> -->
<!-- 		<label for="txtpag">Pago OT:</label> -->
<!-- 		<input type="text" name="txtpag" /> <br /> -->
<!-- 		<label for="txtstatact">Status Actividad:</label> -->
<!-- 		<input type="text" name="txtstatact" /> <br /> -->
<!-- 		<label for="txtrutcli">Rut Cliente:</label> -->
<!-- 		<input type="text" name="txtrutcli" required/> <br /> -->
<!-- 		<label for="txtrutprof">Rut Profesional:</label> -->
<!-- 		<input type="text" name="txtrutprof" required/> <br /> -->
<!-- 		<label for="txtcodact">Código Actividad:</label> -->
<!-- 		<input type="text" name="txtcodact" required/> <br /><br /> -->
		
<!-- 		<input type="submit" value="Agregar OT" /> -->
	</form>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/ListarOT">Volver al
		listado de OT</a>

</body>
</html>