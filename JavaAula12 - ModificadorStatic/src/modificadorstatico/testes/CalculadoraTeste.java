package modificadorstatico.testes;

import modificadorstatico.classes.Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		/*
		 * AO UTILIZAR O OPERADOR STATIC DENTRO DA CLASSE CALCULADORA
		 * DEVIDO A MESMA NÃO POSSUIR ATRIBUTOS NÃO HA NECESSIDADE DE 
		 * CRIAR UM OBJETO POIS O MÉTODO STATIC NÃO ESTÁ VINCULADO 
		 * A OBJETOS E SIM A PROPRIA CLASSE 
		 */
		
		// CHAMANDO OS MÉTODOS STATICS CRIADOS NÁ CLASSE CALCULADORA USANDO A CLASSE CALCULADORA
		System.out.println("----- Imprimindo dados em Tela -----");
		Calculadora.Somador(); 
		Calculadora.Subtrair();
		Calculadora.Multiplica(10, 900);
		Calculadora.ImprimiDoisNumerosDivididos(100, 0);
		System.out.println("O resultado da operação é: " + Calculadora.Dividir(100, 0));
		System.out.println("O resultado da divisão é: " + Calculadora.Dividir(100, 2)); // A SAIDA SERÁ INFINITY
		
		//CHAMANDO MÉTODO DE SOMA DE ELEMENTOS DE ARRAY
		int[] numeros = new int[]{1,2,3,4,5};
		Calculadora.somaArray(numeros);
		Calculadora.somaVarArgs(1, 2, 3, 4, 5);
	}

}
