<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--   <title>jQuery UI Datepicker - Default functionality</title> -->
<title>ActualizacionActividades</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="validaciones.js"></script>
<!-- <meta charset="ISO-8859-1"> -->
</head>
<body>
	<h3>Ingreso Actividad</h3>
	<div class="container mt-6">
		<div class="col-sm-2">
			<form:form action="/saveat" method="POST"   onsubmit="return validarActividad();">
				<div class="card">
					<div class="card-header"></div>

					<div class="card-body"></div>
<!-- 					<div class="form-group"> -->
<!-- 						<label>Numero Accidente</label> -->
<!-- 						<input th:field="*{idacc}" type="text" class="form-control"  readonly/> -->
<!-- 					</div> -->
					<div class="form-group">
						<label>Nombre</label>
						<form:input path="nomact" name="nomact" id="nomact" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Descripcion</label>
						<form:input path="descact" name="descact" id="descact" class="form-control"/>
					</div>
					<div class="card-footer"></div>
					<input type="submit" value="Grabar" name="btn  btn-sucess" />
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>