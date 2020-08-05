<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Actualizar registro profesionales</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css"   >
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="/js/validaciones.js"></script>
</head>
<body>
<div class="container mt-4">
	<div class="col-sm-4">
		<form:form method="get"  action="/actprofesional">
		<div class="card">
			<div class="card-header"></div>
			<div class="card-body"></div>
			<div class="form-group">
			<label>Rut cliente</label>
			<form:input path="rutprofesional" class="form-control"/>
			</div>
			<div class="form-group">
			<label>nombre</label>
			<form:input path="nombre" class="form-control"/>
			</div>
			<div class="form-group">
			<label>correo</label>
			<form:input path="correo" class="form-control"/>
			</div>
			<div class="form-group">
			<label>telefono</label>
			<form:input path="telefono" class="form-control"/>
			<div class="card-footer"></div>
			<input type="submit" value="ingresar cliente" class="btn btn-sucess">
			</div>
		</div>
		</form:form>
	
	</div>



</div>

</body>
</html>