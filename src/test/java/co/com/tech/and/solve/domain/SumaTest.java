package co.com.tech.and.solve.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.com.tech.and.solve.domain.impl.Suma;

public class SumaTest {
	
	private static final double DELTA = 0.0000001;
	
	private IOperacion operacionSuma = new Suma();
	
	@Test
	public void debeSumarDosNumeros() {
		double resultado = operacionSuma.ejecutar(1, 3);
		assertEquals(4, resultado, DELTA); 
	}
	
	@Test
	public void debeSumarDosNumerosDecimales() {
		double resultado = operacionSuma.ejecutar(1.2, 2.3);
		assertEquals(3.5, resultado, DELTA); 
	}
	
	@Test
	public void debeSumarNumerosNegativos() {
		double resultado = operacionSuma.ejecutar(-1, -3);
		assertEquals(-4, resultado, DELTA); 
	}

}
