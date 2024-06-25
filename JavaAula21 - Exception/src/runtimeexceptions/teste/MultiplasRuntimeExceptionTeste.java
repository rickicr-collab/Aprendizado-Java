package runtimeexceptions.teste;

import java.sql.SQLException;



public class MultiplasRuntimeExceptionTeste {

	public static void main(String[] args) {
		talvezLanceException();
		testandoException();
			
	}
	
	private static void talvezLanceException() {
		System.out.println("----------------------------");
		System.out.println("Dentro do método !!!");
		try {
			System.out.println("Teste");
			throw new SQLException();
		}catch(Exception e) {
			System.out.println("<<<Dentro do catch SQLException e IOException e AWTException >>>");
		}
		System.out.println("Final do Programa");
	}
	
	private static void testandoException() {
		System.out.println("--------------------------------");
		try {
			System.out.println("teste dentro do Try");
			throw new ArithmeticException();
			//System.out.println("dentro do bloco try ");
		}catch(IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("<<<Dentro catch realizando Multicathc!>>>");
		}
		System.out.println("<<<Final do Programa>>.");
	}

}
