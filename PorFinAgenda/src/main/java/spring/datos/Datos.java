package spring.datos;


import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Empleados;

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
	public Empleados get(int idempleados) {
		String hql = "from Empleados where idempleados=" + idempleados;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		
		Empleados empleado = (Empleados) query.uniqueResult();
		
		
		return empleado;
	}
}


