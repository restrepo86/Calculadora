package co.com.tech.and.solve.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaizCuadradaTest {

    private IOperacionCientifica operacionRaiz= new RaizCuadrada();

    @Test
    public void debeHallarLaRaizCuadradaDeUnNumero(){
        double resultado = operacionRaiz.ejecutar(4);
        assertEquals(2,resultado,0.0001);
    }


}
