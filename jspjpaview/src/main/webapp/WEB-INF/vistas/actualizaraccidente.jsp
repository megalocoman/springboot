<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="get"  action="/ingraccidente">

Nombre Cliente <form:input path="nombrecliente"/><br>
Ingreso descripsion: <form:input path="descripsion"/><br>
Fecha accidente: <form:input path="fechaaccidente"/><br>
<form:hidden path="idaccidente"/>
<input type="submit" value="ingresar accidente">

</form:form>
</body>
</html>