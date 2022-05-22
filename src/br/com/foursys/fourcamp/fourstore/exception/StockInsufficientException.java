package br.com.foursys.fourcamp.fourstore.exception;

public class StockInsufficientException extends Exception {

	private static final long serialVersionUID = 1L;

	public StockInsufficientException() {
        super("Estoque do produto insuficiente para completar a venda");
    }
	
}
