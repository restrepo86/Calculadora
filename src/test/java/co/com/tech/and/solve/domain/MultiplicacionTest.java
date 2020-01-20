package co.com.tech.and.solve.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MultiplicacionTest {

    IOperacion multiplicacion = new Multiplicacion();
    private static final double DELTA = 0.00001;
    @Test
    public void debeMultiplicarNumerosEnteros() {
        double resultado = multiplicacion.ejecutar(2, 3);
        assertEquals(6, resultado, DELTA);
    }
    @Test
    public void debeMultiplicarNumerosDecimales()
    {
        double resultado = multiplicacion.ejecutar(2.5,1);
        assertEquals(2.5,resultado, DELTA);
    }


}