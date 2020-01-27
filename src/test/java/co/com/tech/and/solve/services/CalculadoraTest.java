package co.com.tech.and.solve.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.com.tech.and.solve.exceptions.BusinessExcetion;

public class CalculadoraTest {
	
	private static final double DELTA = 0.0001;
	
	private Calculadora calculadora = new Calculadora();

	@Test
	public void debeEjecutarLaOperacionCorrespondienteSuma() {
		double resultado = calculadora.ejecutarOperacion(1, 2, "SUMA");
		assertEquals(3, resultado, DELTA);
	}
	
	@Test
	public void debeEjecutarLaOperacionCorrespondienteResta() {
		double resultado = calculadora.ejecutarOperacion(3, 1.2, "RESTA");
		assertEquals(1.8, resultado, DELTA);
	}

	@Test
	public void debeEjecutarLaOperacionCorrespondienteFactorial() throws BusinessExcetion {
		int resultado = calculadora.ejecutarOperacion(4, "FACTORIAL");
		assertEquals(24, resultado);
	}
}
