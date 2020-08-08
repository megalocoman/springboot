<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingreso de Sistema</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h1><span style="color:green">bienvenido a nuestro sistema de gestion</span>
<a href="/logout" class='btn btn-success pull-right' class="btn btn-primary"  role="button" > 
        logout </a> 
        </h1>
</div>

<div class="container">

<a href="/consultacliente" class="btn form-control btn-lg btn-primary btn-block">Clientes</a>
<a href="/listar" class="btn form-control btn-lg btn-primary btn-block">OT</a>
<a href="/paginagenerarinforme" class="btn form-control btn-lg btn-primary btn-block">Informes de gestión</a>
<a href="/consultaprofesional" class="btn form-control btn-lg btn-primary btn-block">Profesionales</a>
<a href="/consultaacc" class="btn form-control btn-lg btn-primary btn-block">Accidentes</a>
<a href="/listarat" class="btn form-control btn-lg btn-primary btn-block">Actividades</a>
</div>
</body>
</html>