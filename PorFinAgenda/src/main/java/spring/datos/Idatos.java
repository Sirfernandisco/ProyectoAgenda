package spring.datos;


import java.util.List;

import spring.model.Empleados;
import spring.model.Personas;


public interface Idatos {
	
	public List<Empleados> mostrarEmpleados();
	
	public Personas get(String apellido);
	
	//public void saveOrUpdate(User user);
	
	//public void delete(int id);

}
