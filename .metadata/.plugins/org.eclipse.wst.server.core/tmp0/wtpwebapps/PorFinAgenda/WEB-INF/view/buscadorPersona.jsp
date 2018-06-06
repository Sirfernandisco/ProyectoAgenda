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
		<!-- <h3>
			 Persona
		</h3>
			<ul>
				<li>idPersona : <strong> ${persona.idpersonas}</strong></li>
				<li>Nombre y Apellidos : <strong> ${persona.nombre} ${persona.apellido1} ${persona.apellido2}</strong></li>
				<li>DNI : <strong>${persona.dni}</strong></li>
				<li>Fecha Nacimiento :<strong>${persona.fechaNacimiento} </strong> </li>
				<li>Teléfono : <strong>${persona.telefonoses.telefono} </strong></li>
				<li>idTeléfono : <strong> ${persona.telefonoses.idtelefonos} </strong></li>
				

			</ul>
			
		<h3>
			 Empleado
		</h3>
			<ul>
				<li>idEmpleado : <strong>${persona.empleados.idempleados} </strong></li>
<%-- 				<li>Código de Empleado : <strong>${persona.empleados.codEmpleado} </strong></li> --%>
<%-- 				<li>Salario : <strong>${persona.empleados.salario} </strong></li> --%>
<%-- 				<li>Fecha de alta: <strong>${persona.empleados.fechaAlta} </strong></li> --%>

			</ul>
			
		 <h3>
			 Departamento
		</h3>
			<ul>
<%-- 				<li>idDepartamento : <strong>${persona.empleados.departamentos.iddepartamento} </strong></li> --%>
<%-- 				<li>Nombre : <strong>${persona.empleados.departamentos.nombre} </strong></li> --%>

			</ul>
		<h3>
			 Categoría
		</h3>
			<ul>
<%-- 				<li>idCategoria : <strong>${persona.empleados.categorias.idcategorias} </strong></li> --%>
<%-- 				<li>Nombre : <strong>${persona.empleados.categorias.nombre} </strong></li> --%>
<%-- 				<li>Descripción : <strong>${persona.empleados.categorias.descripcion} </strong></li> --%>

			</ul>
			
		<h3>
			 Dirección
		</h3>
			<ul>
				<li>idDirección : <strong>${persona.direccioneses.iddirecciones} </strong></li>
				<li>Dirección : <strong>${persona.direccioneses.direccion} </strong></li>
				<li>Código postal : <strong>${persona.direccioneses.codPostal} </strong></li>
				<li>Localidad : <strong>${persona.direccioneses.localidad} </strong></li>
				<li>Provincia : <strong>${persona.direccioneses.provincia} </strong></li>

			</ul> -->
			
		

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
					<td><a href="detail?id=${user.id}">Detalles</a>
					</td>
				</tr>
			

		</table>
	</div>
</body>
</html>