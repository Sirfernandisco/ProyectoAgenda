package spring.services;


import java.util.List;

import spring.model.Empleados;


public interface IService {
	
	public List<Empleados> mostrarEmpleados();

	public Empleados get(int idempleados);
}
