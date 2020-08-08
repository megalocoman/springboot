<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--   <title>jQuery UI Datepicker - Default functionality</title> -->
<title>ListarOT</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="validaciones.js"></script>
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
<h1><span style="color:green">Ingreso OT</span>
        </h1>
</div>
	<div class="container ">
			<div >
			<form:form action="/save" method="POST" onsubmit="return validarOT();">
				<div class="card">
					<div class="card-header"></div>

					<div class="card-body"></div>
		
					<div class="form-group">

						<label>Fecha actividad</label> <form:input name="fecact" path="fecact"   id="datepicker"  class="form-control" />
					</div>
					<div class="form-group">
						<label>Valor</label> <form:input name="val" path="val" id="val" class="form-control" />
					</div>
					<div class="form-group">
						<label>Pago</label> <form:input name="pag" path="pag" id="pag" class="form-control" />
					</div>
					<div class="form-group">
						<label>Status actividad</label>
						<form:select path="statact" name="statact" id="statact" class="form-control">
						<form:option value="Sin Status">---</form:option>
   						<form:option value="Pendiente">Pendiente</form:option>
   						<form:option value="En Proceso">En Proceso</form:option>
   						<form:option value="Planificada">Planificada</form:option>
   						<form:option value="Finalizada">Finalizada</form:option>
   						<form:option value="Cancelada">Cancelada</form:option>
   						<form:option value="Otro">Otro</form:option>
						</form:select>
<%-- 						 <form:input name="statact" id="statact" path="statact" class="form-control" /> --%>
					</div>
					<div class="form-group">
						<label>Rut cliente</label> <form:input name="rutcli" path="rutcli" id="rutcli" class="form-control" />
					</div>
					<div class="form-group">
						<label>Rut profesional</label> <form:input name="rutprof" path="rutprof" id="rutprof" class="form-control" />
					</div>
					<div class="form-group">
						<label>Codigo actividad</label> 
						<form:select path="codact" class="form-control" name="codact">
						<form:option value="0">---</form:option>
   						<form:option value="1">Capacitacion</form:option>
   						<form:option value="2">Curso</form:option>
   						<form:option value="3">Asesoria</form:option>
   						<form:option value="4">Gestion</form:option>
   						<form:option value="5">Visita</form:option>
   						<form:option value="6">Soporte</form:option>
   						<form:option value="7">Otra</form:option>
						</form:select>
<%-- 						<form:input name="codact" path="codact" id="codact"  class="form-control" /> --%>
					</div>

					<div class="card-footer"></div>
					<input type="submit" value="Ingresar" class="submit" class="btn btn-sucess" />
				</div>
			</form:form>
		</div>
		<a href="/listar"  class="btn btn-primary"  role="button">Ir a consulta de OT</a>
	</div>
</body>
</html>