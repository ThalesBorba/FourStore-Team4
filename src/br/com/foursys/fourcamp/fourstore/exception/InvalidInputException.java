package br.com.foursys.fourcamp.fourstore.exception;

public class InvalidInputException extends Exception {

	private static final long serialVersionUID = 1L;

    public InvalidInputException(Long id) {
        System.err.println("\nOp��o Inv�lida!");
	}
    
    public InvalidInputException(Integer id) {
        System.err.println("\nOp��o Inv�lida!");
	}
}
