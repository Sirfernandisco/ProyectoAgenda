package spring.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import spring.datos.Idatos;
import spring.model.Empleados;

@Service
@Transactional
public class Services implements IService{

		@Autowired
		private Idatos datos;
		
		/*
		public UserServiceImpl(){
			
		}
		
		public UserServiceImpl(UserDAO userDAO) {
			super();
			this.userDAO = userDAO;
		}
		*/


		@Override
		public List<Empleados> mostrarEmpleados() {
			
			return datos.mostrarEmpleados();
		}

		@Override
		public Empleados get(String apellido1, String apellido2) {
			return datos.get(apellido1, apellido2);
		}
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
