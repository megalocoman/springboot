<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>consulta de clientes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script src="/FileSaver.js"></script>
<script src="/tableexport.js"></script>
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
<h1><span style="color:green">Consulta clientes</span>

        </h1>
</div>
<div class="container mt-4">
<a href="/paginaingresocliente" class="btn btn-info">Nuevo</a>
	<table class="table table-striped table-bordered">
		<thead class="thead-dark">
			<tr>
				<th>Rut profesional</th>
				<th>Nombre cliente</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Correo</th>
				<th>Contacto</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
		<c:forEach items="${listcli}" var="cliente">
			<tr>
				<td>${cliente.rutcliente }</td>
				<td>${cliente.nombrecliente}</td>
				<td>${cliente.direccion}</td>
				<td>${cliente.telefono}</td>
				<td>${cliente.correo}</td>
				<td>${cliente.contacto}</td>
				
				<td><a href="/actualizarcliente/${cliente.rutcliente}" class="btn btn-warning">Editar</a></td>
				<td><a href="/eliminarcliente/${cliente.rutcliente}" class="btn btn-danger">Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
	<div id=bottombuttons>
	
	</div>
</div>
	<script type="text/javascript" > 
	$("table").tableExport(); 
	var $buttons = $("table").find('caption').children().detach();
	$buttons.appendTo('#bottombuttons');
	</script>
</body>
</html>