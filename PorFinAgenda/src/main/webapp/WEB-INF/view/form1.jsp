<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/otro.css" var="estilos" />
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
				<th>codEmpleado</th>
				<th>Nombre</th>
				<th>Telefono</th>
				<th>Categoria</th>
				<th>Departamento</th>
				<th>Salario</th>
			</tr>

			<c:forEach var="Empleados" items="${lista}">
				<tr>
					<td>${Empleados.idempleados}</td>
					<td>${Empleados.codEmpleado}</td>
					<td>${Empleados.personases.nombre}</td>
					<td>${Empleados.personases.telefonoses.telefono}</td>
					<td>${Empleados.categorias.nombre}</td>
					<td>${Empleados.departamentos.nombre}</td>
					<td>${Empleados.salario}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
