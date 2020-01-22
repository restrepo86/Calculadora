package co.com.tech.and.solve.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {


    private IOperacion operacionDivision;

    @Test
    public  void debeDividirDosNumeros (){
        double respuesta = operacionDivision.ejecutar ( 10, 2);
        assertEquals (5, respuesta, 0.00001);
    }
}
