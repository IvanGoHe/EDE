package Act1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	
	Calculadora c;
	
	@Before
	public void setUp(){
		c=new Calculadora();
		System.out.println("setUp");
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("setUpBeforeClass");
	}
	
	@After
	public void setUpAfter(){
		c=null;
		System.out.println("setUpAfter");
	}
	
	@AfterClass
	public static void setUpAfterClass(){
		c=null;
		System.out.println("setUpAfterClass");
	}
	
	@Test
	public void sumarTest(){
		Double valorEsperado=4.0;
		Double valorReal =Calculadora.suma(2,2);
		
		
		assertEquals(valorEsperado, valorReal,0.001);
		System.out.println("sumarTest");
	}
	
	@Test
	public void restarTest(){
		
		Double valorEsperado=4.0;
		Double valorReal =Calculadora.resta(6,2);
		
		
		assertEquals(valorEsperado, valorReal,0.001);
		System.out.println("restarTest");
	}
	
	@Test
	public void multiplicarTest(){
		Double valorEsperado=4.0;
		Double valorReal =Calculadora.multiplicar(2,2);
		
		
		assertEquals(valorEsperado, valorReal,0.001);
		System.out.println("multiplicarTest");
	}
	
	@Test
	public void dividirTest(){
		Double valorEsperado=2.0;
		Double valorReal =Calculadora.division(4,2);
		
		
		assertEquals(valorEsperado, valorReal,0.001);
		System.out.println("dividirTest");
	}
}
