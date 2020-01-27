package co.com.tech.and.solve.services;

import java.util.HashMap;
import java.util.Map;

import co.com.tech.and.solve.business.exception.NumeroNegativoException;
import co.com.tech.and.solve.domain.*;

public class Calculadora {

	private Suma suma = new Suma();
	private Resta resta = new Resta();
	private RaizCuadrada raizCuadrada = new RaizCuadrada();

	public double ejecutarOperacion(double numeroUno, double numeroDos, String tipoOperacion) {
		
		Map<String, IOperacion> operaciones = new HashMap<>();
		operaciones.put("SUMA", suma);
		operaciones.put("RESTA", resta);
		
		return operaciones.get(tipoOperacion).ejecutar(numeroUno, numeroDos); 
		
	}
	public double ejecutarOperacion(double numero, String tipoOperacion) throws NumeroNegativoException {
		Map<String, IOperacionCientifica> operacionCientificaMap = new HashMap<>();
		operacionCientificaMap.put("RAIZ CUADRADA", raizCuadrada);
		//aca podemos agregar mas operaciones cientificas con un solo parametro, como seno, coseno, factorial etc.

		return operacionCientificaMap.get(tipoOperacion).ejecutar(numero);
	}

}
