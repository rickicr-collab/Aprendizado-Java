package excption.runtimeexception.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/*
 * TRATAMENTO DE MULTIPLAS  EXCEÇÕES:
 * OBS1: VOCE PODE TRABALHAR COM MAIS DE UM CATCH E COM MAIS DE UM TIPO DE EXCEÇÃO 
 * POR BLOCO.
 * OBS2: DEPENDENDO DA EXCEÇÃO DECLARADA NO TRY O JAVA IRÁ REDIRECIONAR PARA O TRATAMENTO
 * CORRETO DENTRO DO BLOCO DA EXCEÇÃO DECLARADA.
 * OBS3: CASO A EXCEÇÃO NÃO TENHA BLOCOS PREPARADOS ELE IRÁ MOSTRAR UM EXCEÇÃO QUE 
 * NÃO FOI TRATADA ADEQUADAMENTE.
 * OBS4: QUANDO SE TEM EXCEÇÕES DA MESMA HIERARQUIA DEVE SER COLOCADA A MAIS GENERICA PARA BAIX 
 * POIS SE A MESMA ESTIVER NO INICIO DA ESTRUTURA DARÁ UM ERRO DE COMPIAÇÃO PROGRAMAÇÃO DEVIDO 
 * AS EXCEÇÕES POSTERIORES SEREM REDUNDANTES DEVIDO A ISSO SEMPRE TEM QUE SE ESTÁ ATENTO
 * A HIERARQUIA DAS EXCEÇÕES QUANDO SE PERTENCEM A MESMA CLASSE.
 * OBS5: ESSE TRATAMENTO DE ESTRTURA PARA MULTIPLAS EXECEÇÕES É MUITO RARO E USADO APENAS 
 * ATE A VERSÃO DO JAVA 7. VERSOES POSTEIRORES TEM MÉTODOS MUIT MAIS SIMPLES PARA TRATAMENTO
 * DE MULTIPLAS EXCEÇÕES. 
 * 
 * OBS6: USANDO O PRINCIPIO DO POLIMORFISMO SE UMA EXCEÇÃO É SUBCLASSE DA MESMA É POSSIVEL UTILIZAR
 * SUA SUPERCLASSE PARA REALIZAR O TRATAEMNTO DE EXCEÇÃO DA MESMA. DEVIDO AOS PRINCIPIOS DE 
 * POLIMORFISMO.
 * 
 */

public class MultiplasRuntimeExceptionTeste {

	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("<<<Dentro ArrayIndexOutOfBoundsException!>>>");
		}catch(IllegalArgumentException e) {
			System.out.println("<<<Dentro do IllegalArgumentException!>>> ");
		}catch(ArithmeticException e) {
			System.out.println("<<<Dentro do ArithmeticException!>>>");
		}catch(RuntimeException e) {
			System.out.println("<<<Dentro do RuntimeException!>>>");
		}
		
		System.out.println("<<<Final do Programa>>.");
		
		try {
			talvezLanceException();
		}catch(SQLException e) {
			System.out.println("<<<Dentro do catch SQLException>>>");
		}catch(IOException e) {
			System.out.println("<<<Dentro do FileNotFoundException>>>");
		}
		System.out.println("Final do Programa");
	}
	
	
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException {
		System.out.println("<<<Dentro do Método Exception>>>");
	}

}
