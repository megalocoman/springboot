<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Actualizar registro clientes</title>
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
<h1><span style="color:green">actualizar de clientes</span>

        </h1>
</div>

	<div class="container ">
	
		<div >
			<form:form method="get"  action="/ingrcliente" onsubmit="return validarCliente();">
	<div class="card">
				<div class="card-header"></div>
				<div class="card-body"></div>
				<div class="form-group">
				<label>Rut cliente</label>
				<form:input path="rutcliente" id="rutcliente" class="form-control"/>
				</div>
				<div class="form-group">
				<label>Nombre</label>
				 <form:input path="nombrecliente" id="nombrecliente" class="form-control"/>
				</div>
				<div class="form-group">
				<label>Direccion</label>
				 <form:input path="direccion" id="direccion" class="form-control"/>
				</div>
				<div class="form-group">
				<label>Telefono</label>
				<form:input path="telefono" id="telefono" class="form-control"/>
				</div>
				<div class="form-group">
				<label>Correo</label>
				<form:input path="correo" id="correo" class="form-control"/>
				</div>
				<div class="form-group">
				<label>Contacto</label>
				<form:input path="contacto" id="contacto" class="form-control"/>
				<div class="card-footer"></div>
				</div>
			<input type="submit" value="ingresar cliente" role="button" class="btn btn-sucess submit">
			</div>
		
		</form:form>
		
		</div>
		<a href="/consultacliente" class="btn btn-primary"  role="button">Consultar clientes</a>
	</div>




</body>
</html>