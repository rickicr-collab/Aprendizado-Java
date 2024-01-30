package Arrays;

public class Arrays01 {
	
	/*
	 *  ARRAYS PROPRIEDADES E FUNDAMENTOS 
	 *  OBS: TODO ARRAY EM JAVA É UMA REFERENCIA A UM OBJETO E TODO O ARRAY EM SI É UM OBJETO
	 *  OBS1: A FORMA DE DECLARAÇÃO DE UM ARRAYS : INT IDADE[] É UTILIZAVEL MAIS NÃO RECOMENDADO
	 *  OBS2: TODO ARRAYS CRIADO O VALOR ATRIBUIDO AO TAMANHO DO ARRAY É FIXO NÃO PODE SER ALTERADO
	 */

	public static void main(String[] args) {
		int [] idade = new int[5];// RECOMENDADO
		// ALOCANDO OS VALORES DOS INDIÇES DE ACORDO COM A CLASSE PRIMITIVA PRÉ DELCARADA
		idade[0] = 5;
		idade[1] = 4;
		idade[2] = 3;
		idade[3] = 2;
		idade[4] = 0;
		
		// IMPRIMINDO VALORES DO ARRAY DE ACORDO COM SUAS POSIÇÕES 
		System.out.println("Idade 1: " + idade[0]);
		System.out.println("Idade 2: " + idade[1]);
		System.out.println("Idade 2: " + idade[2]);
		System.out.println("Idade 2: " + idade[3]);
		System.out.println("Idade 2: " + idade[4]);
		

	}

}
