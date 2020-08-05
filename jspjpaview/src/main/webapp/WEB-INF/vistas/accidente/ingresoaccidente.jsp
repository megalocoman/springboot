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
<title>Insert title here</title>
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

	<div class="container mt-2">
		<div class="col-sm-4">	
			<form:form method="get"  action="/ingraccidente">
			<div class="card">
				<div class="form-group">
					<label>Nombre Cliente</label>
					<form:input path="nombrecliente" name="nombrecliente" class="form-control"/>
				</div>
				
				<div class="form-group">
					<label>Ingreso descripsion: </label><form:input path="descripsion" name="descripsion" class="form-control"/>
				</div>
				
				<div class="form-group">
					<label>Fecha accidente: </label>
					<form:input path="fechaaccidente" name="fechaaccidente" class="form-control"/>
				</div>
				
			<input type="submit" value="ingresar accidente" class="btn btn-sucess">
			</div>
			</form:form>
			
			<a href="/consultaacc">ir a consulta de accidente</a>
		</div>

	</div>

</body>
</html>