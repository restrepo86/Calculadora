package co.com.tech.and.solve.exceptions;

public class BusinessExcetion extends Exception {

	private static final long serialVersionUID = 1L;

	public BusinessExcetion(String message) {
		super(message);
	}

	public BusinessExcetion(String message, Exception e) {
		super(message, e);
	}
}
