package spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.model.Empleados;
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
	  
	  
	  // añadido para mostrar empleados falta modificar
		@RequestMapping("/mostrar")
		public ModelAndView handleRequest() throws Exception {
			List<Empleados> listUsers = userService.mostrarEmpleados();
			ModelAndView model = new ModelAndView("form1");
			model.addObject("lista", listUsers);
			return model;
		}
	  

//	  @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
//	  public String processSubmit(
//	          @ModelAttribute("cliente") Cliente cliente,
//	          ModelMap model) {
//	      System.out.println("--- metodo addcliente");
//	      
//	      
//	          model.addAttribute("nombre", cliente.getNombre());
//	          model.addAttribute("password", cliente.getPassword());
//	          model.addAttribute("id", cliente.getId());
//	      
//	      //En vez de guardar uno a uno... los guardo de golpe
//	      //En el proximo JSP tendre que sacarlos como   cliente.nombre    ciente.id, etc.
//	      System.out.println("--"+cliente);
//	      model.addAttribute(cliente);
//	      return "form2";
//	  }
	  
	  
	  //Tambien podria usar
	  /*
	   public ModelAndView processSubmit(@ModelAttribute("cliente") Cliente cliente, BindingResult result){
	       ModelAndView mv = new ModelAndView();
	       mv.addObject("cliente", cliente);  
	       return mv;
	  */

}
