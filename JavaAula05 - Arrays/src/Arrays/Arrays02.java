package Arrays;

public class Arrays02 {
	/*
	 * CONTINUANDO O TEMA DE ARRAYS E SEUS FUNDAMENTOS E PROPRIEDADES:
	 * 
	 * VALORES INICIAIS PREENCHIDOS AUTOMATICAMENTE PARA CADA CLASSE:
	 * BYTE : VALOR INICIAL  = 0
	 * INT : VALOR INICIAL  = 0
	 * SHORT : VALOR INICIAL = 0
	 * LONG : VALOR INCIAL  = 0
	 * DOUBLE : VALOR INICIAL = 0
	 * FLOAT : VALOR INCIAL  = 0.0
	 * 
	 * TIPO CHAR : VALOR INCIAL SERÁ UNICOA REPRESENTANDO ESPAÇO VAZIO : '\UOOOO' → ' '
	 * TIPO BOOLEAN : RECEBERÁ O VALOR = FALSE
	 * TIPO REFERENCE EXEMPLO (STRING) : RECEBERA VALOR INICIAL = NULL
	 */

	public static void main(String[] args) {
		System.out.println("Trabalhando com Arrays");
		// ATRIBUIDO UM ARRAY A UM OBJETO DE INDICES 3
		// EXEMPLO 1
		System.out.println(" ----- Primeiro Exemplo ------ ");
		int[] idade = new int[3];
		// OS ARRYAS POSSUEM POR PADRÃO VALORES INICIALIZADOS DE ACORDO COM A CLASSE PRIMITIVA
		System.out.println("Idade 1: " + idade[0]);
		System.out.println("Idade 2: " + idade[1]);
		System.out.println("Idade 2: " + idade[2]);
		
		// EXEMPLO 2
		System.out.println(" ----- Segundo Exemplo ----- ");
		String[] nomes = new String[4];
		
		nomes[0] = "Ricardo";
		nomes[1] = "Karla";
		nomes[2] = "Patricia";
		nomes[3] = "Marcela";
		
		// DEFININDO O TAMANHO DO ARRAY USANDO A FUNÇÃO LENGTH
		// IMPRIMINDO UTILIZANDO O FOR OS VALORES EM CADA INDICE E A POSIÇÃO DE CADA UM DENTRO DO ARRAY
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Nome: " + nomes[i]+ " / " +  " posição : " + (i + 1));
		}
		

	}

}
