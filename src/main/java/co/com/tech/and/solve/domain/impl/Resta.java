package co.com.tech.and.solve.domain.impl;

import co.com.tech.and.solve.domain.IOperacion;

public class Resta implements IOperacion {

	@Override
	public double ejecutar(double numeroUno, double numeroDos) {
		return numeroUno - numeroDos;
	}

}
