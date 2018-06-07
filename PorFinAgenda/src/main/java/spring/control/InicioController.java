package spring.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.model.Empleados;
import spring.model.Personas;
import spring.services.IService;

@Controller
public class InicioController {

	@Autowired
	private IService userService;

	@ModelAttribute("Empleados")
	public Empleados getClienteObject() {
		return new Empleados();
	}
	
	@ModelAttribute("Personas")
	public Personas getClienteObject1() {
		System.out.println("-- devuelvo un objeto vacio");
		return new Personas();
	}

	@RequestMapping("/")
	public String initForm() {

		return "index";
	}

	@RequestMapping("/mostrar")
	public ModelAndView handleRequest() throws Exception {
		List<Empleados> listUsers = userService.mostrarEmpleados();
		ModelAndView model = new ModelAndView("form1");
		model.addObject("lista", listUsers);
		return model;
	}

	@RequestMapping("/buscar")
	public ModelAndView buscador(HttpServletRequest request) {

		Personas persona;
		String apellido1 = request.getParameter("primer");
		// String apellido2 = request.getParameter("segundo");
		if (apellido1 != "") {
			persona = userService.get(apellido1);
			if (persona == null) {
				ModelAndView model = new ModelAndView("noEncontrado");
				return model;
			} else {
				ModelAndView model = new ModelAndView("buscadorPersona");
				model.addObject("persona", persona);
				return model;
			}
		} else {
			ModelAndView model = new ModelAndView("noEncontrado");
			return model;
		}
	}
	
	@RequestMapping(value = "/detalles", method = RequestMethod.GET)
	public ModelAndView buscarIdEmpleado(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Empleados empleado=userService.getEmpleado(id);
		ModelAndView model = new ModelAndView("ficha");
		model.addObject("empleado", empleado);
		return model;		
	}
	
	//Empleado
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("darAlta");
		model.addObject("user", new Empleados());
		return model;		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Empleados user) {
		userService.saveOrUpdate(user);
		return new ModelAndView("redirect:/new2?id="+user.getIdempleados());
	}
	
	
	//Persona
	@RequestMapping(value = "/new2", method = RequestMethod.GET)
	public ModelAndView newUser2(HttpServletRequest request) {
		Empleados emp = userService.getEmpleado(Integer.parseInt(request.getParameter("id")));
		Personas p = new Personas();
		p.setEmpleados(emp);
		ModelAndView model = new ModelAndView("darAltaPersona");
		model.addObject("user2", p);
		return model;		
	}
	
	
	@RequestMapping(value = "/save2", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Personas user2) {
		userService.saveOrUpdateP(user2);
		return new ModelAndView("redirect:/mostrar");
	}
	
	//
	@RequestMapping(value = "/save3", method = RequestMethod.POST)
	public ModelAndView saveUser3(@ModelAttribute Empleados user) {
		userService.saveOrUpdate(user);
		return new ModelAndView("redirect:/mostrar");
	}
	
	@RequestMapping(value = "/borrar", method = RequestMethod.GET)
	public ModelAndView borrarEmpleado(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		String cod = request.getParameter("codEmpleado");
		userService.borrarEmpleado(id,cod);
		return new ModelAndView("redirect:/mostrar");		
	}
	
	
	@RequestMapping(value = "/editar", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Empleados emp = userService.getEmpleado(id);
		ModelAndView model = new ModelAndView("Modificar");
		model.addObject("user", emp);
		return model;		
	}
	
	

}
