<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ingreso de clientes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="/js/validaciones.js"></script>
</head>
<body>
<h1>Ingrese su cliente</h1>
<div class="container mt-2">
	<div class="col-sm-4">
		<form:form method="get"  action="/ingprofesional">
		<div class="card">
			<label>Rut profesional</label>
			<form:input path="rutprofesional" name="rutprofesional" class="form-control"/>
			<label>Nombre</label>
			<form:input path="nombre" name="nombre" class="form-control"/>
			<label>Correo</label>
			<form:input path="correo" name="correo" class="form-control"/>
			<label>Telefono</label>
			<form:input path="telefono" name="telefono" class="form-control"/>
			<input type="submit" value="ingresar profesional" class="btn btn-sucess">
		</div>
		
</form:form>

<a href="/consultaprofesional">consultar profesionales</a>
	</div>
</div>


</body>
</html>