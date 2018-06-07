package spring.test;


import static org.junit.Assert.*;


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
	
    private int a;
    private int b;
	
	@Autowired
	private Idatos datos;
	
	
	@Test
	public void comprobarSuma(){
		a=3;
		b=2;
		assertEquals(5, datos.suma(a, b));
	}
	
	
	
	
	

	
	
}
