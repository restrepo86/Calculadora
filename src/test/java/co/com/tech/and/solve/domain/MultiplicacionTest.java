package co.com.tech.and.solve.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MultiplicacionTest {

    IOperacion multiplicacion = new Multiplicacion();

    @Test
    public void debeMultiplicarNumerosEnteros() {
        double resultado = multiplicacion.ejecutar(2, 3);
        assertEquals(6, resultado, 0.000001);
    }


}