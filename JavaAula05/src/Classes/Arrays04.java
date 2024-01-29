package Classes;
	
	/*
	 * TRABALHANDO COM ARRAYS MULTIDIMENSIONAIS.
	 * FORMA RECOMENDADE DE SINTAXE PARA CRIAÇÃO DE ARRAYS MULTIDIMENSIONAIS É:
	 * EXEMPLO 1 → INT[][] DIAS = NEW INT[][]; → RECOMENDADO
	 * EXEMPLO 2 → INT[] DIAS[] = NEW INT[][];
	 */
public class Arrays04 {

	public static void main(String[] args) {
		// CRIANDO UM ARRAY MULTIDIMENSIONAL
		int[][] dias = new int[2][2];
		//ATRIBUINDO VALORES AS POSIÇÕES EM MEMORIA 
		dias[0][0] = 30;
		dias[0][1] = 20;
		dias[1][0] = 40;
		dias[1][1] = 50;
		
		// CRIANDO UM FOR PARA VISUALIZAR OS DADOS DENTRO DA MEMORIA DE AMBOS ENDEREÇOS.
		//UTILIZANDO O LAÇO FOR
		//EXEMPLO 1
		System.out.println("---- Imprimindo dados em Tela ---- ");
		System.out.println("-- Imprimindo usando Laço de repetição FOR -- ");
		for(int i = 0; i < dias.length; i++) {
			System.out.println("Endereço: " + dias[i]);
			for(int j = 0; j< dias[i].length; j++) {
				System.out.println("Dias: " + dias[i][j]);
			}
		}
		
		//UTILIZANDO O LAÇO FOREACH
		//EXEMPLO 2
		System.out.println("-- Imprimindo usando Laço de repetição FOREACH -- ");
		for(int[] ref: dias) {
			System.out.println("Endereços: " + ref);
			for(int dia: ref) {
				System.out.println("Numeros: " + dia);	
			}
		}
	}

}
