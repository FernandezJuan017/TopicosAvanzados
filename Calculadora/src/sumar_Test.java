import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class sumar_Test {

	Calculadora calc;
	@Before
	public void inicio() {
		calc = new Calculadora();
	}
	
	@Test
	public void suma() {
		assertEquals(5, calc.sumar(3, 2), 0);
	}
	@Test
	public void sumaNegativo() {
		double res= calc.sumar(-3, -5);
		assertTrue(res<0);
	}
	
}
