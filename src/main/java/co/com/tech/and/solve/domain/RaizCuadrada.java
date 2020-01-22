package co.com.tech.and.solve.domain;

public class RaizCuadrada implements IOperacionCientifica {
    @Override
    public double ejecutar(double numeroAOperar) {
        return Math.sqrt(numeroAOperar);
    }
}
