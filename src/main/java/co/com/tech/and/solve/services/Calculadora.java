package co.com.tech.and.solve.services;

import java.util.HashMap;
import java.util.Map;

import co.com.tech.and.solve.business.exception.NumeroNegativoException;
import co.com.tech.and.solve.domain.*;
import co.com.tech.and.solve.domain.IOperacion;
import co.com.tech.and.solve.domain.OperacionDivision;
import co.com.tech.and.solve.domain.Multiplicacion;
import co.com.tech.and.solve.domain.Resta;
import co.com.tech.and.solve.domain.Suma;

public class Calculadora {

	private Suma suma = new Suma();
	private Resta resta = new Resta();
	private RaizCuadrada raizCuadrada = new RaizCuadrada();
	private OperacionDivision division = new OperacionDivision ();
	private Multiplicacion multiplicacion= new Multiplicacion();

	public double ejecutarOperacion(double numeroUno, double numeroDos, String tipoOperacion) {
		
		Map<String, IOperacion> operaciones = new HashMap<>();
		operaciones.put("SUMA", suma);
		operaciones.put("RESTA", resta);
		operaciones.put("DIVISION", division);
		operaciones.put("MULTIPLIACION", multiplicacion);
		
		return operaciones.get(tipoOperacion).ejecutar(numeroUno, numeroDos); 
		
	}
	public double ejecutarOperacion(double numero, String tipoOperacion) throws NumeroNegativoException {
		Map<String, IOperacionCientifica> operacionCientificaMap = new HashMap<>();
		operacionCientificaMap.put("RAIZ CUADRADA", raizCuadrada);
		//aca podemos agregar mas operaciones cientificas con un solo parametro, como seno, coseno, factorial etc.

		return operacionCientificaMap.get(tipoOperacion).ejecutar(numero);
	}

}
