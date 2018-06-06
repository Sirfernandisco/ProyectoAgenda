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

	<div align="center" style="color: black">
		<h1>Todos los detalles de un empleado</h1>
	</div>
	<div style="color: black">
		<br/>
		<br/>
		<h3>Detalles de empleado</h3>
		<ul>
			<li>idPersona : <strong> ${empleado.personases.idpersonas}</strong></li>
			<li>Nombre y Apellidos : <strong> ${empleado.personases.nombre}
					${persona.apellido1} ${empleado.personases.apellido2}</strong></li>
			<li>DNI : <strong>${empleado.personases.dni}</strong></li>
			<li>Fecha Nacimiento :<strong>${empleado.personases.fechaNacimiento}
			</strong>
			</li>
			<li>Tel�fono : <strong>${empleado.personases.telefonoses.telefono}
			</strong></li>
			<li>idTel�fono : <strong>
					${empleado.personases.telefonoses.idtelefonos} </strong></li>


		</ul>

		<h3>Empleado</h3>
		<ul>
			<li>idEmpleado : <strong>${empleado.idempleados}
			</strong></li>
			<li>C�digo de Empleado : <strong>${empleado.codEmpleado}
			</strong></li>
			<li>Salario : <strong>${empleado.salario} </strong></li>
			<li>Fecha de alta: <strong>${empleado.fechaAlta}
			</strong></li>

		</ul>

		<h3>Departamento</h3>
		<ul>
			<li>idDepartamento : <strong>${empleado.departamentos.iddepartamento}
			</strong></li>
<%-- 			<li>Nombre : <strong>${empleado..departamentos.nombre}</strong></li> --%>

		</ul>
		<h3>Categor�a</h3>
		<ul>
			<li>idCategoria : <strong>${empleado.categorias.idcategorias}
			</strong></li>
			<li>Nombre : <strong>${empleado.categorias.nombre}
			</strong></li>
			<li>Descripci�n : <strong>${empleado.categorias.descripcion}
			</strong></li>

		</ul>

		<h3>Direcci�n</h3>
		<ul>
			<li>idDirecci�n : <strong>${empleado.personases.direccioneses.iddirecciones}
			</strong></li>
			<li>Direcci�n : <strong>${empleado.personases.direccioneses.direccion}
			</strong></li>
			<li>C�digo postal : <strong>${empleado.personases.direccioneses.codPostal}
			</strong></li>
			<li>Localidad : <strong>${empleado.personases.direccioneses.localidad}
			</strong></li>
			<li>Provincia : <strong>${empleado.personases.direccioneses.provincia}
			</strong></li>

		</ul>


	</div>
</body>
</html>