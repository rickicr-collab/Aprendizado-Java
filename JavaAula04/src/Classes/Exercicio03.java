package Classes;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * EXERCICIO :
		 * IMPRIMIR TODOS OS NUMEROS PARES DE 0 ATE 100000
		 */
		
		//CRIANDO UM LAÇO FOR PARA IMPRIMIIR OS VALORES DENTRO DE UM INTERVALO
		// PRIMIERO EXEMPLO COM NUMEROS PARES
		System.out.println("Imprimindo o intervalo com numeros pares");
		int valor = 100000;
		for(int i = 0; i <= valor; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("<<<FIM do Programa>>>");
		//SEGUNDO EXEMPLO COM NUMEROS IMPARES
		int numero = 100;
		System.out.println("Imprimindo o intrvalo com numeros impares");
		for(int i = 0; i <= numero; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("<<<FIM do Programa>>>");
	}

}
