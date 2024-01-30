package Controledefluxo;

public class ControleDeFluxo04 {
	/*
	 * CONTROLE DE FLUXO / ESTRUTURA DE REPETIÇÃO - WHILE
	 * CRIA UMA CONDIÇÃO E ENQUANTO A CONDIÇÃO NÃO FOR TOTALEMNTE
	 * ATENDIDA A ESTRTURURA CONTINUACAR.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Imprimindo dados  em Tela");
		System.out.println("<<<Cntador Abaixo>>>");
		int contador = 0;
		while(contador < 10) {
			contador++;
			System.out.println("Contador completo : " + contador);
			//USANDO A FUNÇÃO BREAK PARA SSAIR DO LAÇO
			if(contador == 7) {
				break;
			}
		}
		System.out.println("Fim do programa ");
		
		System.out.println("-------------------------- ");
		System.out.println("Trabalhando com Do / While: ");
		// TRABALHANDO COM DO WHILE
		contador = 0;
		do {
			System.out.println("Dentro do do while " + contador++);
		}while(contador < 10);
		
		System.out.println("Fim do Programa ");
		
		System.out.println("----------------------------");
		System.out.println("trabalhando com for: ");
		// USANDO A ESTRUTURA DE REPETIÇÃO FOR 
		int tab = 9;
		int i = 1;
		int f = 10;
		// CRIANDO A CONDIÇÃO FOR PARA UM CONTADOR GERAR UMA TABUADA
		System.out.println("Gerador de Tabuada");
		System.out.println("tabuada de : " + tab);
		System.out.println("-----------");
		for(int c = i; c <= f; c++) {
			System.out.println(c + " x " + tab + " = " + (c * tab));
		}
		System.out.println("-----------");
		System.out.print("<<<Fim do Programa>>> ");
	}

}
