<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InicioACTIVIDADES</title>
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
<!-- <h2>Menu Accidentes</h2> -->
	<h3>Menu Actividades</h3>
	<div class="container mt-4">
<!-- 			<a href="/listarat" class="btn btn-primary">Listar</a> -->
 		<a href="/newat" class="btn btn-info">Nuevo</a> 
		<table class="table">
			<thead>
				<tr>
					<th>Codigo actividad</th>
					<th>Nombre</th>
					<th>Descripcion</th>
				</tr>
			</thead>

			<tbody>
			<c:forEach items="${actividades}" var="actividades">
				<tr>
					<td><c:out value="${actividades.codact}"/></td>
					<td><c:out value="${actividades.nomact}"/></td>
					<td><c:out value="${actividades.descact}"/></td>
					<td>
					<a href="/editarat/${actividades.codact}" class="btn btn-warning">Editar </a></td>
					<td><a href="/eliminarat/${actividades.codact}" class="btn btn-danger">Eliminar</a></td>
					
				</tr>
				</c:forEach>
			</tbody>


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