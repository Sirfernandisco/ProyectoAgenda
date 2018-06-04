package spring.datos;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import spring.model.Empleados;

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
	public ArrayList<Empleados> mostrarEmpleados() {
		@SuppressWarnings("unchecked")
		ArrayList<Empleados> listUser = (ArrayList<Empleados>) sessionFactory.getCurrentSession()
				.createCriteria(Empleados.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
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

//	@Override
//	@Transactional
//	public User get(int id) {
//		String hql = "from User where id=" + id;
//		Query query = sessionFactory.getCurrentSession().createQuery(hql);
//		
//		@SuppressWarnings("unchecked")
//		List<User> listUser = (List<User>) query.list();
//		
//		if (listUser != null && !listUser.isEmpty()) {
//			return listUser.get(0);
//		}
//		
//		return null;
//	}
}


