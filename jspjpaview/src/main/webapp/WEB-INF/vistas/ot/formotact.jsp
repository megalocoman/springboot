<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--   <title>jQuery UI Datepicker - Default functionality</title> -->
<title>ActualizacionOT</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css"   >
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="/validaciones.js"></script>
<!-- <meta charset="ISO-8859-1"> -->
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
<h1><span style="color:green">Actualiza OT</span>
        </h1>
</div>

	<div class="container">
		
		<div >
			<form:form action="/save" method="POST" onsubmit="return validarOT();">
				<div class="card">
					<div class="card-header"></div>

					<div class="card-body"></div>
					<div class="form-group">
						<label>Numero OT</label>
						<form:input path="numot"  readonly="readonly" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Fecha actividad</label>
						<form:input path="fecact"  type="text" id="datepicker" class="form-control"  />
					</div>
					<div class="form-group">
						<label>Valor</label>
						<form:input type="text" path="val" id="val"  class="form-control"  />
					</div>
					<div class="form-group">
						<label>Pago</label>
						<form:input type="text" path="pag" id="pag" class="form-control"  />
					</div>
					<div class="form-group">
						<label>Status actividad</label>
						<form:input type="text" path="statact" id="statact" class="form-control" />
					</div>
					<div class="form-group">
						<label>Rut cliente</label>
						<form:input type="text" path="rutcli" id="rutcli" class="form-control" />
					</div>
					<div class="form-group">
						<label>Rut profesional</label>
						<form:input type="text" path="rutprof" id="rutprof" class="form-control"  />
					</div>
					<div class="form-group">
						<label>Codigo actividad</label>
						<form:input type="text" path="codact" id="codact" class="form-control"  />
					</div>

					<div class="card-footer"></div>
					<input type="submit" value="Grabar" class="submit" class="btn btn-sucess" />
<!-- 					<input type="reset" value="Limpiar" class="btn btn-secondary" /> -->
				</div>
			</form:form>
		</div>
		<a href="/listar"  class="btn btn-primary"  role="button">Ir a consuta de OT</a>
	</div>
</body>
</html>