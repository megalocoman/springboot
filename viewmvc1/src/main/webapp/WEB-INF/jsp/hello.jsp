<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>

	<table>
		<thead>
			<tr>
				<th>codigo actividad</th>
				<th>nombre</th>
				<th>descripcion</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${listacc}" var="act">
				<tr>
					<td>${ act.codigoactividad}</td>
					<td>${ act.nombre}</td>
					<td>${act.descripcion}</td>
					<%-- <td><a
						href="${pageContext.request.contextPath}/ServletEliminarAccidente?id=${Accidente.id}">eliminar</a>
					</td>
					<td><a href="actualizar.html"> actualizar datos</a></td> --%>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>