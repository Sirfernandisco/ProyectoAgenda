package spring.services;


import java.util.List;

import spring.model.Empleados;
import spring.model.Personas;


public interface IService {
	
	public List<Empleados> mostrarEmpleados();

	public Personas get(String apellido);
	
	public Empleados getEmpleado(int id);
	
	public void saveOrUpdate(Empleados Empleado);
	
	public void saveOrUpdateP(Personas persona);
	
	public void borrarEmpleado(int id, String cod);
}
