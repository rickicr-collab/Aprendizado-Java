package excption.runtimeexception.teste;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.stream.XMLStreamException;

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
 * 
 * TRATAMENTO DE EXCEÇÕES A PARTIR DA VERSÃO 7 EM DIANTE DO JAVA 
 * 
 * FUNÇÃO PIP:É UMA FUNÇÃO ONDE UM MÉTODO SENDO TRATADO NO BLOCO TRY AO LANÇÃR UMA EXCEÇÃO
 * CASO HAJA MAIS DE UMA EXCEÇÃO DELCLARADA ELE IRA SELECIONAR QUAL DAS EXCEÇÕES FOI LANCADA 
 * É JOGARA NA VARIAVEL E DENTRO DO BLOCO CATCH E DEPOIS ERÁ PARA DENTRO DO BLOCO CATH PARA 
 * PROSSEGUIR COM O CODIGO ATÉ O FINAL DO PROGRAMA.
 * 
 * OBS1: NÃO SE PODE ATRIBUIR UMA NOVA INSTACIA DE EXCEÇÃO DENTRO DE UM BLOCO CATH A PARTIR DA VERSÃO 7
 * EM DIANTE DO JAVA DEVIDO TER MAIS DE UMA EXCEÇÃO NÃO SE PODE DETERMINAR QUAL EXCEÇÃO SERÁ APLICADA 
 * ENTÃO DEVIDO A ISSO O JAVA NÃO PERMITE ESSA PRATICA.
 * 
 * OBS2: MESMO QUE VOCE ESTEJA FILTRANDO TODAS AS EXCEÇÕES SENDO TRATADAS POR EXCEPTION COMO 
 * SUPER CLASSE DE SUAS DERIVADAS SUBCLASSES O JAVA APENAS ELA EVITANDO QUE VOCE MULTIPLICASSE
 * CODIGO.
 * 
 * 
 */

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
