import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class multiplicar_Test {

	Calculadora calc;
	@Before
	public void inicio() {
		calc = new Calculadora();
	}
	
	@Test
	public void testMultiplicaNegativos() {
		assertEquals(10, calc.multiplicar(-5, -2), 0);
	}

	@Test
	public void testMultiplicaNegativoPositivo() {
		assertEquals(-10, calc.multiplicar(5, -2), 0);
	}
	
	@Test
	public void testMultiplicarPorUno() {
		assertEquals(10, calc.multiplicar(10, 1), 0);
	}
	
}