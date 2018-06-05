package spring.datos;

import java.util.ArrayList;
import java.util.List;

import spring.model.Empleados;

public interface Idatos {
	
	public List<Empleados> mostrarEmpleados();
	
	public Empleados get(int id);
	
	//public void saveOrUpdate(User user);
	
	//public void delete(int id);

}
