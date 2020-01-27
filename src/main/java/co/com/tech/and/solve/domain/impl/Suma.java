package co.com.tech.and.solve.domain.impl;

import co.com.tech.and.solve.domain.IOperacion;

public class Suma implements IOperacion {

	public double ejecutar(double numeroUno, double numeroDos) {
		return numeroUno + numeroDos;
	}

}
