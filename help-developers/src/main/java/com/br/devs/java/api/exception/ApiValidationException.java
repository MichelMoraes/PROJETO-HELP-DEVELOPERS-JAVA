package com.br.devs.java.api.exception;

/**
 * Usar nos processos de validações.
 */
public class ApiValidationException extends RuntimeException {

	private static final long serialVersionUID = -5278653003357783128L;

	public ApiValidationException(String message) {
        super(message);
    }


}
