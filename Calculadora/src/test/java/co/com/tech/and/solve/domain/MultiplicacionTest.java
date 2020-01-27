package co.com.tech.and.solve.domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplicacionTest {
    IOperacion operacionMultiplicacion = new Multiplicacion();

    @Test
    public void debeMultiplicarNumerosEnteros()
    {
        double resultado = operacionMultiplicacion.ejecutar(1,2);
        assertEquals(resultado,2,0.000001);

    }
    @Test void debeMultiplicarNumerosDecimales()
    {
        double resultado = operacionMultiplicacion.ejecutar(1.5,1);
        assertEquals(resultado,1.5, 0.000001 );

    }

}
