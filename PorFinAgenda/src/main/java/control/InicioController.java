package spring.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.model.Cliente;

@Controller

public class InicioController {
	  @ModelAttribute("cliente")
	  public Cliente getClienteObject() {
	      System.out.println("-- devuelvo un objeto vacio");
	      return new Cliente();
	  }

	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public String initForm() {
	      System.out.println("--- metodo cliente");


	      return "form1";
	  }
	  

	  @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
	  public String processSubmit(
	          @ModelAttribute("cliente") Cliente cliente,
	          ModelMap model) {
	      System.out.println("--- metodo addcliente");
	      
	      /*
	          model.addAttribute("nombre", cliente.getNombre());
	          model.addAttribute("password", cliente.getPassword());
	          model.addAttribute("id", cliente.getId());
	      */
	      //En vez de guardar uno a uno... los guardo de golpe
	      //En el proximo JSP tendre que sacarlos como   cliente.nombre    ciente.id, etc.
	      System.out.println("--"+cliente);
	      model.addAttribute(cliente);
	      return "form2";
	  }
	  
	  
	  //Tambien podria usar
	  /*
	   public ModelAndView processSubmit(@ModelAttribute("cliente") Cliente cliente, BindingResult result){
	       ModelAndView mv = new ModelAndView();
	       mv.addObject("cliente", cliente);  
	       return mv;
	  */

}
