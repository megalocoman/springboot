<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>administrador</title>
</head>
<body>
<h1>usted es un administrador</h1>
<p>Usted es el usuario: <sec:authentication property="principal.username"></sec:authentication></p>

</body>
</html>