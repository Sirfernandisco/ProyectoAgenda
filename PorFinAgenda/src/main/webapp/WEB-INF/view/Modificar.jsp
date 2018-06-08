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
		<h1>Formulario De Empleado (Modificar)</h1>
		<table>
			<form:form action="save3" method="post" modelAttribute="user">
				<form:hidden path="idempleados" />
				<tr>
					<td>codEmpleado:</td>
					<td><form:input path="codEmpleado" /></td>
				</tr>
				<tr>
					<td>Salario:</td>
					<td><form:input path="salario" /></td>
				</tr>
				<tr>
					<td>fechaAlta:</td>
					<td><form:input path="fechaAlta" /></td>
				</tr>
				<tr>
					<td>idDepartamento:</td>
					<td><select name="departamentos.iddepartamento">
						<option value="1">RRHH</option>
						<option value="2">Informática</option>
						<option value="3">Logística</option>
						<option value="4">Dirección</option>
					</select></td>
				</tr>
				<tr>
					<td>idCategoria:</td>
					<td><select name="categorias.idcategorias">
						<option value="1">Programador</option>
						<option value="2">Analísta</option>
						<option value="3">Técnico Recursos Humanos</option>
						<option value="4">Secretaria</option>
						<option value="5">Recepcionista</option>
						<option value="6">Master del Universo</option>
					</select></td>
				</tr>


				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Registro"></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>