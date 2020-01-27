package co.com.tech.and.solve.domain;

import co.com.tech.and.solve.business.exception.NumeroNegativoException;

public interface IOperacionCientifica {
    double ejecutar(double numeroAOperar) throws NumeroNegativoException;
}
