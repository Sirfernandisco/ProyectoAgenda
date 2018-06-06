package spring.datos;


import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Empleados;
import spring.model.Personas;

@Repository
public class Datos implements Idatos{
	
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
		System.out.println(listUser);
		return listUser;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Empleados Empleado) {
		sessionFactory.getCurrentSession().saveOrUpdate(Empleado);
	}

//	@Override
//	@Transactional
//	public void delete(int id) {
//		User userToDelete = new User();
//		userToDelete.setId(id);
//		sessionFactory.getCurrentSession().delete(userToDelete);
//	}

	@Override
	@Transactional
	public Personas get(String apellido1) {
		String hql = "from Personas where apellido1 like :apellido1";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("apellido1", apellido1+"%");
		
		Personas persona = (Personas) query.uniqueResult();
		
		
		return persona;
	}
	
	@Override
	public Empleados getEmpleado(int id){
		String hql = "from Empleados where idempleados= :id";	
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("id", id);
		Empleados empleado = (Empleados) query.uniqueResult();
		return empleado;
	}
}


