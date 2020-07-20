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
<title>Modificar OT</title>
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

<h1>Modificar OT</h1>

	<c:if test="${cumensaje != null}">
		<c:out value="${cumensaje}" />
	</c:if>

	<form action="ModificarOT" name="formmodif" method="post">
		<table>
			<tr>
				<td width="30%">Fecha Actividad</td>
				<td width="70%">
					<label for="txtfecact"></label>
<!-- 					<input type="text" value="test"/> -->
					<input type="text" value="<%=(String)request.getAttribute("fecact")%>"/>
<%-- 					<input type="text" name="txtfecact" value="${datosot.user.getFecact()}"/> --%>
				</td>
			</tr>
			<tr>
				<td width="30%">Valor OT</td>
				<td width="70%">
					<label for="txtval"></label>
<!-- 					<input type="text" value="txtval"/> -->
					<input type="text" value="<%=request.getAttribute("val")%>"/>
<%-- 					<input type="text" name="txtval" value="${datosot.getVal()}"/> --%>
				</td>
			</tr>
			<tr>
				<td width="30%">Pago OT</td>
				<td width="70%">
					<label for="txtpag"></label>
<!-- 					<input type="text" value="txtpag"/> -->
					<input type="text" value="<%=request.getAttribute("pag")%>"/>
<%-- 					<input type="text" name="txtpag" value="${datosot.getPag()}"/> --%>
				</td>
			</tr>
			<tr>
				<td width="30%">Status Actividad</td>
				<td width="70%">
					<label for="txtstatact"></label>
<!-- 					<input type="text" value="txtstatact"/> -->
					<input type="text" value="<%=(String)request.getAttribute("statact")%>"/>
<%-- 					<input type="text" name="txtstatact" value="${datosot.getStatact()}"/> --%>
				</td>
			</tr>
			<tr>
				<td width="30%">Rut Cliente</td>
				<td width="70%">
					<label for="txtrutcli"></label>
<!-- 					<input type="text" value="txtrutcli"/> -->
					<input type="text" value="<%=(String)request.getAttribute("rutcli")%>"/>
<%-- 					<input type="text" name="txtrutcli" value="${datosot.getRutcli()}"/> --%>
				</td>
			</tr>
			<tr>
				<td width="30%">Rut Profesional</td>
				<td width="70%">
					<label for="txtrutprof"></label>
<!-- 					<input type="text" value="txtrutprof"/> -->
					<input type="text" value="<%=(String)request.getAttribute("rutprof")%>"/>
<%-- 					<input type="text" name="txtrutprof" value="${datosot.getRutprof()}"/> --%>
				</td>
			</tr>
			<tr>
				<td width="30%">Código Actividad</td>
				<td width="70%">
					<label for="txtcodact"></label>
<!-- 					<input type="text" value="txtcodact"/> -->
					<input type="text" value="<%=request.getAttribute("codact")%>"/>
<%-- 					<input type="text" name="txtcodact" value="${datosot.getCodact()}"/> --%>
				</td>
			</tr>
		</table>
		<br><br>
		<div id="Boton">
			<input type="hidden" name="hdnnumot" value="<%=request.getAttribute("numot")%>">
<%-- 			<input type="hidden" name="hdnnumot" value="${datosot.getNumot()}"> --%>
			&nbsp; <input type="submit" value="Modificar OT">
		</div>
	</form>
	<br>
		<a href="${pageContext.request.contextPath}/ListarOT">Volver al listado de OT</a>

			
<%-- 		Fecha Actividad: <input type="text" name="txtfecact" value="${datosot.fecact}" /><br> --%>
<%-- 		Valor OT: <input type="text" name="txtval" value="${datosot.val}" /><br> --%>
<%-- 		Pago OT: <input type="text" name="txtpag" value="${datosot.pag}" /><br> --%>
<%-- 		Status Actividad: <input type="text" name="txtstatact" value="${datosot.statact}" /><br> --%>
<%-- 		Rut Cliente: <input type="text" name="txtrutcli" value="${datosot.rutcli}" /><br> --%>
<%-- 		Rut Profesional: <input type="text" name="txtrutprof" value="${datosot.rutprof}" /><br> --%>
<%-- 		Código Actividad: <input type="text" name="txtcodact" value="${datosot.codact}" /><br><br> --%>

<!-- 		<input type="hidden" name="hdnnumotot"  value="numot" /> -->
<!-- 		<input type="submit" value="Modificar OT" /> -->
</body>
</html>