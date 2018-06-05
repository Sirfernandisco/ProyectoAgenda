package spring.datos;

import java.util.ArrayList;
import java.util.List;

import spring.model.Empleados;
import spring.model.Personas;

public interface Idatos {
	
	public List<Empleados> mostrarEmpleados();
	
	public Empleados get(int idempleados);
	
	//public void saveOrUpdate(User user);
	
	//public void delete(int id);

}
