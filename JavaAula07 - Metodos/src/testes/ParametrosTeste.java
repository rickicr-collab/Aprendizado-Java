package testes;

import classesmetodos.Calculadora;

public class ParametrosTeste {

	public static void main(String[] args) {
		
		// INSTANCIANDO UM OBJETO DA CLASSE CALCULADORA
		Calculadora calc = new Calculadora();
		
		// CRIANDO VARIAVEIS INT
		int num1 = 5;
		int num2 = 10;
		
		/*
		 * OBS 1: MESMO QUE VOCE DECLARE VARIAVEIS INTEIRAS E 
		 * PASSE COMO ARGUMENTO PARA O METODO OS VALORES ORIGINAIS 
		 * DENTRO DO MÉTODO NUNCA SERÃO ALTERADOS 
		 * O QUE SERÁ PASSADO SERÁ UM COPIA DOS VALORES DENTRO DAS VARIAVEIS 
		 */
		
		
		calc.AlterandoDoisNumeros(num1, num2);
		System.out.println("Dentro do Teste!");
		System.out.println("O Numero 1 : " + num1);
		System.out.println("O Numero 2 : " + num2);
		
		
		

	}

}
