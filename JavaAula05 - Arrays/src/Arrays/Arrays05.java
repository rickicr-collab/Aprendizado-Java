package Arrays;

public class Arrays05 {
	/*
	 * CONTINUANDO O ESTUDO DE ARRAYS MULTIDIMENSIONAIS 
	 * OBS 1: SO É NESSECÁRIO DECLARAR O TAMANHO DO PRIMEIRO ARRAY DELCARADO 
	 * DO ARRAYS MULTIDMENSIONAL NÃO É NECESSARIO DECLARA UM PRE VALOR DE ESPACOS.
	 * 
	 * OBS 2: INSTANCIANDO DIRETAMENTE UM ARRAYS MULTIDIMENSIONAL ALOCANDO OS ESPACOS 
	 * DENTRO DO ARRAY INICIAL E INFORMANDO QUANTOS ARRAYS QUERERM CRIA E QUANTO ELEMENTOS
	 * CADA UM TERÁ 
	 * 
	 * EXEMPLO: INT[][] DIAS = NEW {[0,0], [1, 2, 3], [0, 0, 0, 0]};
	 */

	public static void main(String[] args) {
		/* 
		 * TRABALHANDO COM ARRAYS MULTIDIMENSIONAIS 
		 * FAZENDO REFERENCIA A ARRAYS DE DIFERENTES 
		 * TAMANHOS PARA CADA POSIÇÃO ESPECIFICA DO PRIMEIRO ARRAY
		 */
		int[][] dias = new int[3][];
		/*
		 * POSIÇÃO 0: ADICIONANDO UM ARRAY INSTANCIANDO ADICIONANDO O TAMANHO DO MESMO DENTRO DO COLCHETES.
		 * POSIÇÃO 1: INSTANCIANDO UM ARRAY COM O NUMEROS DE ELEMENTOS DENTRO DELE.
		 * 
		 */
		dias[0] = new int[2];
		dias[1] = new int[]{1, 2, 3};
		dias[2] = new int[4];
		
		//UTILIZANDO FOR PARA VISUALIZAR DADOS DOS ARRAYS MULTIDIMENSIONAIS 
		System.out.println("----- Imprimindo dados em Tela----- ");
		for(int[] arr: dias) {
			System.out.println("Endereços : " + arr);
			for(int num: arr) {
				System.out.println("Array Valores: " + num);
			}
		}
	}

}
