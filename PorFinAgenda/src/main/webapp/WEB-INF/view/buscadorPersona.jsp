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
				<th>Nombre Apellidos</th>
				<th>dni</th>
				<th>Fecha Nacimiento</th>
				<th>Telefono</th>
				<th>Direccion</th>
				<th>Departamento</th>
				<th>D</th>
			</tr>

			
				<tr>
					<td>${persona.idpersonas}</td>
					<td>${persona.nombre} ${persona.apellido1} ${persona.apellido2}</td>
					<td>${persona.dni}</td>
					<td>${persona.fechaNacimiento}</td>
					<td>${persona.telefonoses.telefono}</td>
					<td>${persona.direccioneses.direccion}</td>
					<td><a href="detail?id=${user.id}">Detalles</a>
						&nbsp;&nbsp;&nbsp;&nbsp;<a href="edit?id=${user.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${user.id}">Eliminar</a>
					</td>
				</tr>
			

		</table>
	</div>
</body>
</html>