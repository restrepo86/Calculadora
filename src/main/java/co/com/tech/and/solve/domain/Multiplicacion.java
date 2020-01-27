package co.com.tech.and.solve.domain;


public class Multiplicacion implements IOperacion {
    @Override
    public double ejecutar(double numeroUno, double numeroDos) {
        return numeroUno*numeroDos;
    }
}
