package spring.test;

import static org.junit.Assert.*;
import org.apache.commons.logging. Log;
import org.apache.commons.logging. LogFactory;
import org.hamcrest.core.IsNull;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import spring.confi.ApplicationContextConfig;

import spring.datos.Idatos;
import spring.model.Personas;

@ContextConfiguration(classes = (ApplicationContextConfig.class))

public class PruebasUnitarias {
	
	static Log log = LogFactory.getLog(PruebasUnitarias.class.getName());

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();

	private int a;
	private int b;
	private String apellido1;
	private Personas persona;

	@Autowired
	private Idatos datos;

	@Test
	public void testSuma() {
		a = 3;
		b = 2;
		assertEquals(5, datos.suma(a, b));
	}
	
	@Test
	public void testBuscadorEncontrar(){
		//si le pasamos un applido que esta en la base de datos
		apellido1="Rodri";
		persona=datos.get(apellido1);
		assertNotNull(persona);
		
	}
	
	@Test
	public void testBuscadorNoEncontrar(){
		//si la pasamos un apellido que no esta en la abse de datos
		apellido1="Pepito";
		persona=datos.get(apellido1);		
		assertNull(persona);
		//o no le pasamos ningun parametro
		persona=datos.get(null);
		assertNull(persona);
		
	}

}
