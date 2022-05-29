package br.com.foursys.fourcamp.fourstore.exception;

public class ProductNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException() {
        System.err.println("Nenhum produto encontrado com essa Sku");
    }
}
