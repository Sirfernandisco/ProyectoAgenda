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
		<h1 id="ho">LISTADO DE EMPLEADOS</h1>
		<h3>
			<a href="new">Clic para crear un NUEVO EMPLEADO</a>
		</h3>

		<table border="1">
			<tr>
				<th>id</th>
				<th>codEmpleado</th>
				<th>Nombre, Apellidos</th>
				<th>Telefono</th>
				<th>Categoria</th>
				<th>Departamento</th>
				<th>Salario</th>
				<th>opciones</th>
			</tr>

			<c:forEach var="Empleados" items="${lista}">
				<tr>
					<td>${Empleados.idempleados}</td>
					<td>${Empleados.codEmpleado}</td>
					<td>${Empleados.personases.nombre}
						${Empleados.personases.apellido1}
						${Empleados.personases.apellido2}</td>
					<td>${Empleados.personases.telefonoses.telefono}</td>
					<td>${Empleados.categorias.nombre}</td>
					<td>${Empleados.departamentos.nombre}</td>
					<td>${Empleados.salario}</td>
					<td><a href="detalles?id=${Empleados.idempleados}">Detalles</a>
						&nbsp;&nbsp;&nbsp;&nbsp;<a href="editar?id=${Empleados.idempleados}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="borrar?id=${Empleados.idempleados}&codEmpleado=${Empleados.codEmpleado}">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="http://localhost:8080/Spring11-MVCHibernate/">Volver al
			buscador</a><br>
	</div>
</body>
</html>
