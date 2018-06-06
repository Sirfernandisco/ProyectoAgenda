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
		System.out.println("-- devuelvo un objeto vacio");
		return new Empleados();
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
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("darAlta");
		model.addObject("user", new Empleados());
		return model;		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Empleados user) {
		userService.saveOrUpdate(user);
		return new ModelAndView("redirect:/");
	}
	
	
	@RequestMapping(value = "/borrar", method = RequestMethod.GET)
	public ModelAndView borrarEmpleado(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		userService.borrarEmpleado(id);
		return new ModelAndView("redirect:/mostrar");		
	}

}
