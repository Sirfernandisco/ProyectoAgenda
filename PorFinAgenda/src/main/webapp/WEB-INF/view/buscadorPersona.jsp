<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/otro.css" var="estilos" />
<link href="${estilos}" rel="stylesheet" />
<title>Persona Encontrada</title>
</head>
<body>

	<div align="center">
		<h1>Datos de la persona</h1>
	

		<table border="1">
			<tr>
				<th>idPersona</th>
				<th>Nombre Apellidos</th>
				<th>dni</th>
				<th>Fecha Nacimiento</th>
				<th>Telefono</th>
				<th>Direccion</th>
				<th>Localidad</th>
				<th>Provincia</th>
				<th>idEmpleado</th>
				
			</tr>

			
				<tr>
					<td>${persona.idpersonas}</td>
					<td>${persona.nombre} ${persona.apellido1} ${persona.apellido2}</td>
					<td>${persona.dni}</td>
					<td>${persona.fechaNacimiento}</td>
					<td>${persona.telefonoses.telefono}</td>
					<td>${persona.direccioneses.direccion}</td>
					<td>${persona.direccioneses.localidad}</td>
					<td>${persona.direccioneses.provincia}</td>
					<td>${persona.empleados.idempleados}</td>
					<td><a href="detalles?id=${persona.empleados.idempleados}">Detalles</a>
					</td>
				</tr>
			

		</table>
	</div>
</body>
</html>