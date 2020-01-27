package co.com.tech.and.solve.domain.impl;

import co.com.tech.and.solve.domain.IOperacionCientifica;
import co.com.tech.and.solve.exceptions.BusinessExcetion;

public class Factorial implements IOperacionCientifica {

	public int ejecutar(int numero) throws BusinessExcetion {
		int numeroFactorial = 1;
		if (numero > 0) {
			numeroFactorial = numero * ejecutar(numero - 1);
		} else if (numero < 0) {
			throw new BusinessExcetion("Numero negativo");
		}

		return numeroFactorial;
	}

}
