<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
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
<h1><span style="color:green">Generacion de informes</span>

        </h1>
</div>
<div class="row container pt-3 jumbotron  ">
	 <div class="col"><a class="btn btn-primary btn-lg" href="/generarinformecliente" role="button">Generar informe cliente </a></div>
  <div class="col"><a class="btn btn-primary btn-lg" href="/generarinformeprofesional" role="button">Generar informe profesional</a></div>
</div>


</body>
</html>