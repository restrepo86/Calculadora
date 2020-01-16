package co.com.tech.and.solve.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestaTest {
	
	private static final double DELTA = 0.00001;
	
	private IOperacion operacionResta = new Resta();

	@Test
	public void debeRestarDosNumeros() {
		double respuesta = operacionResta.ejecutar(4, 2);
		assertEquals(2, respuesta, DELTA);
	}
	
	@Test
	public void debeRestarDosNumerosDecimales() {
		double respuesta = operacionResta.ejecutar(7.4, 1.4);
		assertEquals(6, respuesta, DELTA);
	}

}
