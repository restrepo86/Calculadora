package co.com.tech.and.solve.domain;

import co.com.tech.and.solve.exceptions.BusinessExcetion;

public interface IOperacionCientifica {
	
	int ejecutar(int numeroUno) throws BusinessExcetion;
	
}
