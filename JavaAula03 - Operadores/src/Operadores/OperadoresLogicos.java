package Operadores;

public class OperadoresLogicos {
	
	// OPERADORES LÓGICOS
	/*
	 * && -> AND
	 * || -> OUR
	 * ! -> NOT
	 */


	public static void main(String[] args) {
		
		//ATRIBUTOS
		 
		int idade = 18;
		float salario = 1000f;
		
		// NO OPERADOR AND AMBAS AS CONDIÇÕES PRECISAM SER SATISFEITAS PARA SER VERDADEIRO
		System.out.println(" ----- Imprimindo os dados em tela ----- ");
		System.out.println("Operador Logico AND");
		System.out.println("Verdadeiro ou Falso ?  : " + (idade <= 18 && salario >= 1000f));
		System.out.println("Verdadeiro ou Falso ?  : " + (idade >= 19 && salario >= 2000f));
		
		// NO OPERADOR OUR PELO MENOS UMA DAS CONDIÇÕES PRECISA SER SATISFEITA PARA SER VERDAEIRO
		System.out.println("Operador Logico OUR");
		System.out.println("Verdadeiro ou Falso ? : " + (idade <= 18 || salario >= 2000f));
		System.out.println("Verdadeiro ou Falso ? : " + (idade >= 19 || salario >= 2000f));
		

	}

}
