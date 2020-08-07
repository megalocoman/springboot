<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>

<div class="jumbotron jumbotron-fluid">

	<div class="container">
	<h1 class="display-4">Ingreso al sistema</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}

	<form action="login" method="post">

		<div class="form-group">
			<label for='username'>Usuario</label>
			 <input type='text'	name='username'>
		</div>
		<div class="form-group">
		<label for='password'>Clave</label>
		 <input type='password' name='password'> 
		</div>

		<input type="hidden" name="${_csrf.parameterName}"	value="${_csrf.token}" />
		
		<button type="submit" class="btn btn-default bg-primary">ingresar</button>
<!-- 		<input type="submit" value="ingresar"> -->
	</form>
	</div>
		
</div>


</body>
</html>