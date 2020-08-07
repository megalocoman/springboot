<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MenuOT</title>
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
	<!-- <h2>Menu OT</h2> -->
	<h3>Menu OT</h3>
	<div class="container mt-4">

<!-- 		<a href="/listar" class="btn btn-primary">Listar</a> -->
		<a href="/new" class="btn btn-info">Nuevo</a>
		<table class="table">
			<thead>
				<tr>
					<th>Numero OT</th>
					<th>Fecha actividad</th>
					<th>Valor</th>
					<th>Pago</th>
					<th>Status actividad</th>
					<th>Rut cliente</th>
					<th>Rut profesional</th>
					<th>Codigo actividad</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ot}" var="ot">
					<tr>
						<td><c:out value="${ot.numot}"/></td>
						<td><fmt:formatDate type="date" value="${ot.fecact}"/></td>
						<td><fmt:formatNumber value="${ot.val}" type="currency" minFractionDigits="0"/></td>
						<td><fmt:formatNumber value="${ot.pag}" type="currency" minFractionDigits="0"/></td>
						<td><c:out value="${ot.statact}"/></td>
						<td><c:out value="${ot.rutcli}"/></td>
						<td><c:out value="${ot.rutprof}"/></td>
						<td><c:out value="${ot.codact}"/></td>
						<td><a href="/editar/${ot.numot}" class="btn btn-warning">Editar </a></td>
						<td><a href="/eliminar/${ot.numot}" class="btn btn-danger">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	<div id=bottombuttons>
		
	</div>
	<script type="text/javascript" > 
	$("table").tableExport(); 
	var $buttons = $("table").find('caption').children().detach();
	$buttons.appendTo('#bottombuttons');
	</script>

</body>
</html>