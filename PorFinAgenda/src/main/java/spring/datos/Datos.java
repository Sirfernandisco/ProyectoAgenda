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
		return listUser;
	}

//	@Override
//	@Transactional
//	public void saveOrUpdate(User user) {
//		sessionFactory.getCurrentSession().saveOrUpdate(user);
//	}

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
		String hql = "from Personas where apellido1= :apellido1";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("apellido1", apellido1);
		
		Personas persona = (Personas) query.uniqueResult();
		
		
		return persona;
	}
}


