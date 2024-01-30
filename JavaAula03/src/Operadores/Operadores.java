package Operadores;

public class Operadores {
	// IMPRIMINDO DADOS EM TELA 
			// STRIBUINDO VALORES A VARIAVEIS
			
			/*
			 * TIPO INT => TIPO NUMERO INTEIRO
			 * TIPO BOOLEAN => TIPO VALORES BOOLEANOS TRUE / FALSE
			 * TIPO FLOAT => TIPO VALORES FLUTUANTES OU REAIS 
			 * TIPO STRING => TIPO TEXTOS OU PALAVRAS 
			 * TIPO CHAR => TIPOS CARACTERES (SO ACEITA UM UNICO CARACTER POR VARIAVEL)
			 */
			
			/*
			 * OPERADORES
			 * ++ => INCREMENTO
			 * -- => DECREMENTO
			 * + => OPERADOR DE MAIS
			 * - => OPERADOR DE MENOS
			 * * => OPERADOR DE MULTIPLICAÇÃO
			 / => OPERADOR DE DIVISÃO 
			 * () => OPERADOR DE CAST
			 * ! => OPERADOR DE NEGAÇÃO
			 * < => MENOR QUE
			 * > => MAIOR QUE
			 * <=  MENOR OU IGUAL
			 * >= MAIOR OU IGUAL
			 * == IGUAL A 
			 * 
			 */

	public static void main(String[] args) {
		// TRABALHANDO COM VALORES BOOLEANOS 
		boolean dezMaiorQueVinte = 10 > 20;
		boolean vinteMenorQueDez = 20 > 10;
		boolean comparacao = (10 == 10);
		boolean comp = (5 != 5);
		boolean menorQue = 10 <= 20;
		boolean maiorQue = 10 >= 20;
		
		System.out.println(" ----- Imprimindo Valores em Tel ------ ");
		System.out.println("Primeiro Exemplo ");
		System.out.println(dezMaiorQueVinte);
		System.out.println("Segundo Exemplo ");
		System.out.println(vinteMenorQueDez);
		System.out.println("Terceiro Exemplo ");
		System.out.println("A igualdade a seguir é verdadeira ou falsa ? : " + comparacao);
		System.out.println("A igualdade a seguir é verdadeira ou falsa ? : " + comp);
		System.out.println("Quarto Exemplo ");
		System.out.println("O numero a seguir é menor ou igual ao outro ? : " + menorQue);
		System.out.println("O numero a seguir é maior ou igual ao outro ? : " + maiorQue);
		
		
				

	}

}
