package co.com.tech.and.solve.domain;

import org.junit.Test;

public class RaizCuadradaTest {

    private IOperacionCientifica operacionRaiz = new RaizCuadrada();

    @Test
    public void debeHallarRaizCuadradaDeUnNumero(){
        double resultado = operacionRaiz.ejecutar(4);
    }


}
