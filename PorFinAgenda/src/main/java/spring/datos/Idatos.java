package spring.datos;


import java.util.List;

import spring.model.Empleados;
import spring.model.Personas;


public interface Idatos {
	
	public List<Empleados> mostrarEmpleados();
	
	public Personas get(String apellido);
	
	public Empleados getEmpleado(int id);
	
	public void saveOrUpdate(Empleados empleado);
	
	//public void delete(int id);

}
