package co.com.tech.and.solve.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	Factorial factorial = new Factorial();

	@Test
	public void debeHallarElFactorialDeUnNumeroEntero() {
		int respuesta = factorial.ejecutar(4);
		assertEquals(24, respuesta);
	}
}
