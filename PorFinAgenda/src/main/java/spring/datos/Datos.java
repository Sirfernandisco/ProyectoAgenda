package spring.datos;


import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.logging. Log;
import org.apache.commons.logging. LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Empleados;
import spring.model.Personas;

@Repository
public class Datos implements Idatos{
	
	static Log log = LogFactory.getLog(Datos.class.getName());
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public Datos() {
		
	}
	
	public Datos(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Empleados> mostrarEmpleados() {
		
		
		Query query = sessionFactory.getCurrentSession().createQuery("from Empleados");
		@SuppressWarnings("unchecked")
		List<Empleados> listUser = (List<Empleados>) query.list();
		log.info("*******************Listado Empleados******************");

		
		return listUser;
		
	}

	@Override
	@Transactional
	public void saveOrUpdate(Empleados Empleado) {
		sessionFactory.getCurrentSession().saveOrUpdate(Empleado);
		log.info("****************Guardar modificar Empleados****************");
	}

	@Override
	@Transactional
	public void saveOrUpdateP(Personas persona) {
		sessionFactory.getCurrentSession().saveOrUpdate(persona);
		log.info("****************Guardar modificar Personas****************");
	}

	@Override
	@Transactional
	public Personas get(String apellido1) {
		String hql = "from Personas where apellido1 like :apellido1";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("apellido1", apellido1+"%");
		
		Personas persona = (Personas) query.uniqueResult();
		log.info("*************Busca una Persona por su primer apellido y la devuelve******************");
		return persona;
	}
	
	@Override
	public Empleados getEmpleado(int id){
		String hql = "from Empleados where idempleados= :id";	
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("id", id);
		Empleados empleado = (Empleados) query.uniqueResult();
		log.info("****************Busca un Empleado por su id *********************");
		return empleado;
	}

	@Override
	public void borrarEmpleado(int id,String cod) {
		
		Empleados borrar = new Empleados();
		borrar.setIdempleados(id);
		borrar.setCodEmpleado(cod);
		sessionFactory.getCurrentSession().delete(borrar);
		log.info("*******************Borrar Empleado *****************");
			
	}


	
	
	
	
}


