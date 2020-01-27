package co.com.tech.and.solve.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import co.com.tech.and.solve.domain.impl.Factorial;
import co.com.tech.and.solve.exceptions.BusinessExcetion;

public class FactorialTest {

	private Factorial factorial = new Factorial();

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void debeHallarElFactorialDeUnNumeroEnteroPositivo() throws BusinessExcetion {
		int respuesta = factorial.ejecutar(4);
		assertEquals(24, respuesta);
	}

	@Test
	public void debeHallarElFactorialDeCero() throws BusinessExcetion {
		int respuesta = factorial.ejecutar(0);
		assertEquals(1, respuesta);
	}

	@Test
	public void debeHallarElFactorialDeUno() throws BusinessExcetion {
		int respuesta = factorial.ejecutar(1);
		assertEquals(1, respuesta);
	}

	@Test(expected = Exception.class)
	public void debeLanzarUnaExceptionParaElFactorialDeUnNumeroNegativo() throws Exception {
		factorial.ejecutar(-1);
		thrown.expect(Exception.class);
		thrown.expectMessage("Numero negativo");
	}

}
