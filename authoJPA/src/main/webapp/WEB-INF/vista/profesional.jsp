<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>profesional</title>
</head>
<body>
<h1>Usted es un profesional</h1>
<p>Usted es el usuario: <sec:authentication property="principal.username"></sec:authentication></p>
</body>
</html>