package co.com.tech.and.solve.domain;

import co.com.tech.and.solve.business.exception.NumeroNegativoException;
import co.com.tech.and.solve.mensaje.Mensaje;


public class RaizCuadrada implements IOperacionCientifica {
    @Override
    public double ejecutar(double numeroAOperar) throws NumeroNegativoException {
        if (numeroAOperar>0){

            return Math.sqrt(numeroAOperar);
        }else{
            throw new NumeroNegativoException(Mensaje.RaizCuadrada.RAIZ_DE_UN_NEGATIVO);
        }
    }
}
