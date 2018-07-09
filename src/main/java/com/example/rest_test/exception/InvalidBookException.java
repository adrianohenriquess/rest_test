package com.example.rest_test.exception;

public class InvalidBookException extends Exception {
	private static final long serialVersionUID = -2180482899728641309L;

	/**
	 *Construtor da classe InvalidBookException
	 **/
	public InvalidBookException() {
		super();
	}
	/**
	 * 
	 * @param message Mensagem de Erro
	 * @param cause Mensagem de Erro
	 */
	public InvalidBookException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * 
	 * @param message Mensagem de Erro
	 */
	public InvalidBookException(String message) {
		super(message);
	}
	/**
	 * 
	 * @param cause Mensagem de Erro
	 */
	public InvalidBookException(Throwable cause) {
		super(cause);
	}
}
