package testes;

import classesmetodos.Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// INSTANCIANDO UM OBJETO C PARA UMA CLASSE TIPO CALCULADORA
		Calculadora c = new Calculadora();
		
		// CHAMANDO OS MÉTODOS CRIADOS NÁ CLASSE CALCULADORA
		System.out.println("----- Imprimindo dados em Tela -----");
		c.Somador(); 
		c.Subtrair();
		c.Multiplica(10, 900);
		c.ImprimiDoisNumerosDivididos(100, 25);
		System.out.println("O resultado da operação é: " + c.Dividir(100, 0));
		System.out.println("O resultado da divisão é: " + c.Dividir(100, 2)); // A SAIDA SERÁ INFINITY
		
		System.out.println("---------------------------------------------------");
		c.AlterandoDoisNumeros(100, 200);
		
		//CHAMANDO MÉTODO DE SOMA DE ELEMENTOS DE ARRAY
		int[] numeros = new int[]{1,2,3,4,5};
		c.somaArray(numeros);
		c.somaVarArgs(1, 2, 3, 4, 5);
	}

}
