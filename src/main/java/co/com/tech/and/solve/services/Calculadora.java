package co.com.tech.and.solve.services;

import java.util.HashMap;
import java.util.Map;

import co.com.tech.and.solve.domain.IOperacion;
import co.com.tech.and.solve.domain.Multiplicacion;
import co.com.tech.and.solve.domain.Resta;
import co.com.tech.and.solve.domain.Suma;

public class Calculadora {

	private Suma suma = new Suma();
	private Resta resta = new Resta();
	private Multiplicacion multiplicacion= new Multiplicacion();


	public double ejecutarOperacion(double numeroUno, double numeroDos, String tipoOperacion) {
		
		Map<String, IOperacion> operaciones = new HashMap<>();
		operaciones.put("SUMA", suma);
		operaciones.put("RESTA", resta);

		operaciones.put("MULTIPLIACION", multiplicacion);
		
		return operaciones.get(tipoOperacion).ejecutar(numeroUno, numeroDos); 
		
	}

}
