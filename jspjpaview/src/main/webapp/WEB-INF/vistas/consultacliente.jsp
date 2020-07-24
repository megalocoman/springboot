<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>consulta de clientes</title>
</head>
<body>
<table>
		<thead>
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
				
				<td><a href="/actualizarcliente/${cliente.rutcliente}">Actualidad</a></td>
				<td><a href="/eliminarcliente/${cliente.rutcliente}">Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>