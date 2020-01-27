package co.com.tech.and.solve.services;

import java.util.HashMap;
import java.util.Map;

import co.com.tech.and.solve.domain.IOperacion;
import co.com.tech.and.solve.domain.IOperacionCientifica;
import co.com.tech.and.solve.domain.impl.Factorial;
import co.com.tech.and.solve.domain.impl.Resta;
import co.com.tech.and.solve.domain.impl.Suma;
import co.com.tech.and.solve.exceptions.BusinessExcetion;

public class Calculadora {

	private Map<String, IOperacion> operacionesBasicas = new HashMap<>();
	private Map<String, IOperacionCientifica> operacionesCientificas = new HashMap<>();
	private Suma suma = new Suma();
	private Resta resta = new Resta();
	private Factorial factorial = new Factorial();

	public Calculadora() {
		operacionesBasicas.put("SUMA", suma);
		operacionesBasicas.put("RESTA", resta);
		operacionesCientificas.put("FACTORIAL", factorial);
	}

	public double ejecutarOperacion(double numeroUno, double numeroDos, String tipoOperacion) {

		return operacionesBasicas.get(tipoOperacion).ejecutar(numeroUno, numeroDos);
	}

	public int ejecutarOperacion(int numero, String tipoOperacion) throws BusinessExcetion {
	
		return operacionesCientificas.get(tipoOperacion).ejecutar(numero);
	}

}
