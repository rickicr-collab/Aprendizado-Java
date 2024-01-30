package Arrays;

public class Arrays03 {
	/*
	 * CONTINUANDO O ESTUDOS DE ARRAYS
	 * FORMAS DE INICIALIZAÇÃO DE ARRYAS POSSIVEIS.
	 * 
	 * O USO DA FORMA DE CONTROLE DE FLUXO FOREACH.
	 * 
	 */

	public static void main(String[] args) {
	/*
	 * PRIMEIRA FORMA : INTANCIANDO UM NOVO OBJETO ATRIBUINDO O VALOR TOTAL DE ESPACOS DENTRO DOS COLCHETES DO NOVO OBJETO INSTANCIADO.
	 * EXEMPLO DA PRIMEIRA FORMA → INT[] NUMEROS = NEW INT[5];
	 * SEGUNDA FORMA :  DE INICIALIZA O ARRAY INFORMANDO A QUANTIDADE DE VALORES DESEJADO DENTRO DE CHAVES.
	 * EXEMPLO SEGUNDA FORMA → INT[] NUMEROS = {1, 2, 3, 4, 5};
	 * TERCEIRA FORMA : INICIALIZANDO O ARRAY ATRIBUINDO A UM NOVO OBJETO JA COLOCCANDO OS VALORES APOS INSTANCIA DENTRO DE CHAVES.
	 * EXEMPLO DA TERCEIRA FORMA → INT[] NUMEROS = NEW INT[] {1, 2, 3, 4, 5};
	 */
		
		System.out.println("Trabalhando com Arrays ");
		System.out.println(" ----- Imprimindo dados em Tela ----- ");
		int[] numeros = {1, 2, 3, 4, 5}; // 5 ESPACOS DE MEMORIA COM INDICES DE 0 A 4
		
		
		//USANDO A FUNÇÃO LENGTH DESCOBRINDO O TAMANHO DO ARRAY.
		System.out.println("Utilizando o For para interação com o array ");
		System.out.println("Quantidade de espaços de memoria : " + numeros.length);
		//PRIMIEIRA FORMA USANDO A FUNÇÃO FOR PARA VISUALIZAR O ARRAY COMPLETAMENTE.
		for(int c = 0; c < numeros.length; c++) {
			System.out.println("Array Nº: " + numeros[c] + " Ná posição : " + c);
		}
		
		//UTILIZANDO O CONTROLE DE FLUXO / ESTRUTURA DE REPETIÇÃO FOREACH.
		// EXEMPLO 1
		System.out.println("utilizando p FOREACH para interação com array ");
		System.out.println(" --- Exemplo 1 --- ");
		for(int aux : numeros) {
			System.out.println("Array : " + aux);
		}
		//EXEMPLO 2
		System.out.println(" --- Exemplo 2 --- ");
		String[] nomes = {"Ricardo", "Marina ", "Claudia "};
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
