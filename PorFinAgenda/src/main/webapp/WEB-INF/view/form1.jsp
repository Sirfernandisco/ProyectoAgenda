<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/estilos.css" var="estilos" />
<link href="${estilos}" rel="stylesheet" />
<title>empleados lista lalala</title>
</head>
<body>

	<!--         <div id="contenedor"> -->
	<!--             <h2>Spring(06a) - Form1 <br />(Anotac + Model_View + Model + RequestMapping)</h2> -->
	<!--             IMPORTANTE: Puedo usar   modelAttribute="cliente"   o     commandName="cliente" -->
	<!--             Vale cualqueira de los dos y especifica el objeto donde iran los datos que se recojan  -->
	<!--             Previamente he pasado por ClienteController para recoger un cliente acio -->
	<%--             <form:form method="post" commandName="cliente" action="addCliente.htm"> --%>
	<!--                 <table> -->
	<!--                     <tr> -->
	<%--                         <td><form:label path="nombre">Nombre</form:label></td> --%>
	<%--                         <td><form:input path="nombre" /></td> --%>
	<!--                     </tr> -->
	<!--                     <tr> -->
	<%--                         <td><form:label path="id">Nombre Usuario</form:label></td> --%>
	<%--                         <td><form:input path="id" /></td> --%>
	<!--                     </tr> -->
	<!--                     <tr> -->
	<%--                         <td><form:label path="password">Contraseņa</form:label></td> --%>
	<%--                         <td><form:input path="password" /></td> --%>
	<!--                     </tr>                     -->
	<!--                 </table> -->
	<!--                 <br /> -->
	<!--                 <p><input type="submit" value="Dar de alta" /></p> -->
	<%--             </form:form> --%>
	<!--         </div> -->

	<div align="center">
		<h1>LISTADO DE USUARIOS</h1>
		<h3>
			<a href="/">Clic para crear un NUEVO USUARIO</a>
		</h3>

		<table border="1">
			<tr>
				<th>idempleados</th>
				<th>categorias</th>
				<th>departamentos</th>
				<th>codEmpleado</th>
				<th>salario</th>
				<th>fechaAlta</th>
			</tr>

			<c:forEach var="Empleados" items="${lista}">
				<tr>
					<td>${Empleados.idempleados}</td>
					<td>${Empleados.categorias.nombre}</td>
					<td>${Empleados.departamentos.nombre}</td>
					<td>${Empleados.codEmpleado}</td>
					<td>${Empleados.salario}</td>
					<td>${Empleados.fechaAlta}</td>
					<td><a href="edit?id=${Empleados.idempleados}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?id=${Empleados.idempleados}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
