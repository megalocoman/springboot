<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css"   >
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <script type="text/javascript" src="/validaciones.js"></script>
</head>
<body>

<div class="container">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand text-white"> Sobrevivientes </a>
			<button class="navbar-toggler" type="button" data-target="#menu" data-toggle="collapse" type="button">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="menu">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a href="/ingresosistema" class="nav-link">Inicio</a>
					</li>
					<li class="nav-item"><a href="/consultacliente" class="nav-link">Clientes</a>
					</li>
					<li class="nav-item"><a href="/listar" class="nav-link">OT</a>
					</li>
					<li class="nav-item"><a href="/paginagenerarinforme" class="nav-link">Informes de gestión</a>
					</li>
					<li class="nav-item"><a href="/consultaprofesional" class="nav-link">Profesionales</a>
					</li>
					<li class="nav-item"><a href="/consultaacc" class="nav-link">Accidentes</a>
					</li>
					<li class="nav-item"><a href="/listarat" class="nav-link">Actividades</a>
					</li>
				
				</ul>
				<span class="nav-bar-text">
					Trabajo final - FullStack Java   
				</span>
				<span class="nav-bar-text">
					<a href="/logout" class='btn btn-success pull-right' class="btn btn-primary"  role="button" > 
          logout </a>
				</span>
				
			
			</div>
		</nav>
	</div>

<div class="container ">
<h1><span style="color:green">Actualizar registro accidente</span>

        </h1>
</div>
<div class="container ">
	<h1></h1>
	<div >
		<form:form method="get"  action="/ingraccidente" onsubmit="return validaraccidente();">
			<div class="card">
				<div class="card-header"></div>
				<div class="card-body"></div>
				
				<div class="form-group">
					<label>Nombre Cliente</label>
					 <form:input path="nombrecliente" id="nombrecliente"  class="form-control"/>
				</div>
				<div class="form-group">
					<label>Ingreso descripsion</label>
					 <form:input path="descripsion" id="descripsion" class="form-control"/>
				</div>
				<div class="form-group">
					<label>Fecha accidente</label>
					 <form:input path="fechaaccidente" id="fechaaccidente" class="form-control"/>
				</div>

				<form:hidden path="idaccidente"/>
				<div class="card-footer"></div>
				<input type="submit" class="submit" value="ingresar accidente" class="btn btn-sucess">
					
			</div>
		</form:form>
	</div>
<!-- 	<a class="btn btn-primary"  role="button" href="/consultaacc">Ir a consulta de accidente</a> -->

</div>

</body>
</html>