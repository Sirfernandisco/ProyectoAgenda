<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/estilos.css" var="estilos" />
<link href="${estilos}" rel="stylesheet" />
<title>Lista de empleados</title>
</head>
<body>

	<div align="center">
		<h1>LISTADO DE EMPLEADOS</h1>
		<h3>
			<a href="/">Clic para crear un NUEVO EMPLEADO</a>
		</h3>

		<table border="1">
			<tr>
				<th>id</th>
				<th>Categorias</th>
				<th>Departamentos</th>
				<th>CodEmpleado</th>
				<th>Nombre y Apellidos</th>
				<th>salario</th>
			</tr>
				<tr items="${lista2}">
					<td>${Empleados.idempleados}</td>
				</tr>
		</table>
	</div>
</body>
</html>