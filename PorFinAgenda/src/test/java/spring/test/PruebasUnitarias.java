package spring.test;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import spring.confi.ApplicationContextConfig;
import spring.datos.Idatos;

@ContextConfiguration(classes = (ApplicationContextConfig.class))

public class PruebasUnitarias {

	@ClassRule 
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();	
	@Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();
	
    private float resultadoReal;
    private float resultadoEsperado;
	
	@Autowired
	private Idatos datos;
	
	@Test
	public void testBuscar(){
		resultadoReal=5+5;
		resultadoEsperado=10;
		
		
	}
	
	@Test
	public void testAddTwo(){		
		
		
	}
	
	
}
