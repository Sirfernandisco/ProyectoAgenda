package spring.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.datos.Datos;
import spring.model.Empleados;

@Service
@Transactional
public class Services implements IService{

		@Autowired
		private Datos datos;
		
		/*
		public UserServiceImpl(){
			
		}
		
		public UserServiceImpl(UserDAO userDAO) {
			super();
			this.userDAO = userDAO;
		}
		*/


		@Override
		public ArrayList<Empleados> mostrarEmpleados() {

			return datos.mostrarEmpleados();
		}

//		@Override
//		public User get(int id) {
//			return userDAO.get(id);
//		}
//
//		@Override
//		public void saveOrUpdate(User user) {
//			userDAO.saveOrUpdate(user);
//
//		}
//
//		@Override
//		public void delete(int id) {
//			userDAO.delete(id);
//
//		}


}
