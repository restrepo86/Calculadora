package co.com.tech.and.solve.domain;

import co.com.tech.and.solve.business.exception.NumeroNegativoException;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RaizCuadradaTest {

    private IOperacionCientifica operacionRaiz= new RaizCuadrada();

    private ExpectedException exception;

    @Test
    public void debeHallarLaRaizCuadradaDeUnNumero(){
        double resultado = operacionRaiz.ejecutar(4);
        assertEquals(2,resultado,0.0001);
    }

    @Test
    public void debeLevantarExcepcionPorRaizDeNumeroNegativo(){
        exception.expect(NumeroNegativoException.class);
        exception.expectMessage(Mensaje.RaizCuadrada.RAIZ_CUADRADA_DE_UN_NEGATIVO);
        double resultado =operacionRaiz.ejecutar(-1);
    }


}
