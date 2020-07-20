<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>consulta cliente</title>
</head>
<body>
<h1>Resultados consulta clientes</h1>

<table>
		<thead>
			<tr>
				<th>Rut Profesional</th>
				<th>Nombre</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Correo</th>
				<th>Contacto</th>

			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list_cli}" var="Cliente">
				<tr>
					<td>${Cliente.getRutcliente()}</td>
					<td>${Cliente.getNombrecliente()}</td>
					<td>${Cliente.getDireccion()}</td>
					<td>${Cliente.getTelefono()}</td>
					<td>${Cliente.getCorreo()}</td>
					<td>${Cliente.getContacto()}</td>
					<%-- <td><a
						href="${pageContext.request.contextPath}/ServletEliminarCliente?rutcliente=${Cliente.rutcliente}">eliminar</a></td>
					<td><a href="actualizarcliente.jsp"> actualizar</a></td> --%>

				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>