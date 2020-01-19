package co.com.tech.and.solve.domain;

public class Factorial {

	public int ejecutar(int numero) {
		if (numero == 0) {
			return 1;
		}

		return numero * ejecutar(numero - 1);
	}

}
