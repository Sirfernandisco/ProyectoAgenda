package spring.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import spring.datos.Idatos;
import spring.model.Empleados;
import spring.model.Personas;

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
		public Empleados get(int idempleados) {
			return datos.get(idempleados);
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
