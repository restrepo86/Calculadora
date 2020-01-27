package co.com.tech.and.solve.domain;

import co.com.tech.and.solve.business.exception.NumeroNegativoException;
import co.com.tech.and.solve.mensaje.Mensaje;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RaizCuadradaTest {

    private IOperacionCientifica operacionRaiz= new RaizCuadrada();

    @Test
    public void debeHallarLaRaizCuadradaDeUnNumero() throws NumeroNegativoException {
        double resultado = operacionRaiz.ejecutar(4);
        assertEquals(2,resultado,0.0001);
    }

    @Test(expected = NumeroNegativoException.class)
    public void debeLevantarExcepcionPorRaizDeNumeroNegativo() throws NumeroNegativoException {
        operacionRaiz.ejecutar(-1);
    }


}
