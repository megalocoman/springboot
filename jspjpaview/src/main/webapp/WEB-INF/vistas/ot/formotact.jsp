<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--   <title>jQuery UI Datepicker - Default functionality</title> -->
<title>ActualizacionOT</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css"   >
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="/validaciones.js"></script>
<!-- <meta charset="ISO-8859-1"> -->
</head>
<body>
	<h3>Actualiza OT</h3>
	<div class="container mt-4">
		<div class="col-sm-4">
			<form:form action="/save" method="POST" onsubmit="return validarOT();">
				<div class="card">
					<div class="card-header"></div>

					<div class="card-body"></div>
					<div class="form-group">
						<label>Numero OT</label>
						<form:input path="numot"  readonly="readonly" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Fecha actividad</label>
						<form:input path="fecact"  type="date" id="datepicker" class="form-control"  />
					</div>
					<div class="form-group">
						<label>Valor</label>
						<form:input type="text" path="val" id="val"  class="form-control"  />
					</div>
					<div class="form-group">
						<label>Pago</label>
						<form:input type="text" path="pag" id="pag" class="form-control"  />
					</div>
					<div class="form-group">
						<label>Status actividad</label>
						<form:input type="text" path="statact" id="statact" class="form-control" />
					</div>
					<div class="form-group">
						<label>Rut cliente</label>
						<form:input type="text" path="rutcli" id="rutcli" class="form-control" />
					</div>
					<div class="form-group">
						<label>Rut profesional</label>
						<form:input type="text" path="rutprof" id="rutprof" class="form-control"  />
					</div>
					<div class="form-group">
						<label>Codigo actividad</label>
						<form:input type="text" path="codact" id="codact" class="form-control"  />
					</div>

					<div class="card-footer"></div>
					<input type="submit" value="Grabar" class="btn btn-sucess" />
<!-- 					<input type="reset" value="Limpiar" class="btn btn-secondary" /> -->
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>