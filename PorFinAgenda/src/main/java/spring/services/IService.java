package spring.services;

import java.util.ArrayList;
import java.util.List;

import spring.model.Empleados;
import spring.model.Personas;

public interface IService {
	
	public List<Empleados> mostrarEmpleados();

	public Empleados get(int idempleados);
}
