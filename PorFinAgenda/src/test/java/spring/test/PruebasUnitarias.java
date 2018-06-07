package spring.test;


import static org.junit.Assert.assertTrue;

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
	
	
	
	
	

	
	
}
