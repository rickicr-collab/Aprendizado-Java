package Operadores;

public class OperadoresAtribuicao {
			// OPERADORES DE ATRIBUIÇÃO
			/*
			 * RECEBE :  =
			 * IGUAL A : ==
			 * MAIS IGUAL : +=
			 * MENOS IGUAL : -=
			 * MULTIPLICANDO IGUAL : *= 
			 * DIVIDINDO OU IGUAL : /=
			 * RESTO DA DIVISÃO IGUAL : %=
			 * 
			 */

	public static void main(String[] args) {
		
		// OPERACOES DE ATRIBUIÇÃO
		int salario = 1000;
		int numero = 11;
		salario += 1000;
		salario -= 500;
		salario /= 5;
		double salario1  = salario + (salario * 0.1); // OPERAÇÃO COM VARIAVEL MAIS OUTRA OPERAÇÃO ENTRE PARENTESES 
		numero %= 2;
		
		System.out.println(" ----- Imprimindo dados em Tela ------ ");
		System.out.println("O salário atualizado fica : " + salario);
		System.out.println("O salario atualizado com as operações fica : " + salario1);
		System.out.println("O numero  apos a operação é : " + numero);
		
		
		
		
	}

}
