<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta datos cliente</title>
</head>
<body>
	<table>
		<tr>
			<th>rut</th>
			<th>nombre</th>
			<th>direccion</th>
			<th>fono</th>
			<th>contacto</th>
		</tr>
		<tr>
			<th>${ rut}</th>
			<th>${ nombre}</th>
			<th>${direccion }</th>
			<th>${fono}</th>
			<th>${contacto}</th>
		</tr>

	</table>
	
	<a href="index.html">regreso al inicio</a>
</body>
</html>