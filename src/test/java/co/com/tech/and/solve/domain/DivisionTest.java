package co.com.tech.and.solve.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    private OperacionDivision operacionDivision = new OperacionDivision();
    private static final double DELTA = 0.00001;

    @Test
    public void debeDividirDosNumeros(){
        double respuesta = operacionDivision.ejecutar (10, 2);
        assertEquals (5, respuesta, DELTA);
    }

    @Test
    public void debeDividirDosNumerosDos (){
         double respuesta = operacionDivision.ejecutar(8, 4);
         assertEquals(2,respuesta, DELTA);

        }
    }

