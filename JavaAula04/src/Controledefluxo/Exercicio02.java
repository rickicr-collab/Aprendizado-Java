package Controledefluxo;

public class Exercicio02 {
		/*
		 *  EXERCICIO PROPOSTO:
		 *  CRIE UM SWITCH QUE DADO UM VALOR DE 1 A 7
		 *  CONSIDERANDO 1 DOMINGO IMPRIMA SE É DIA UTIL OU FIM DE SEMANA 
		 */

	public static void main(String[] args) {
		System.out.println("Exercicio Proposto :  estrutura Switch");
		// EXEMPLO RESOLUÇÃO 1
		byte dia = 7;
		String situacao = "";
		switch(dia) {
		case 1:
			situacao = "Domingo: Situação → Fim de Semana ";
			break;
		case 2:
			situacao = "Segunda - Feira: Situação →  Dia Util ";
			break;
		case 3:
			situacao = "Terca - Feira: Situacao →  Dia Util ";
			break;
		case 4:
			situacao = "Quarta - Feira: Situação →  Dia Util ";
			break;
		case 5:
			situacao = "Quinta - Feira: Situação →  Dia Util ";
			break;
		case 6:
			situacao = "Sexta - Feira: Situação →  Dia Util ";
			break;
		case 7:
			situacao = "Sabado: Situação → Fim de Semana";
			break;
		}
		
		System.out.println("Segunda Forma para o Exercicio");
		// EXEMPLO  RESOLUÇÃO 2
		int data = 5;;
		String sit = "";
		switch(data) {
		case 1: 
		case 7:
			sit = "Situação: Fim de Semana";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			sit = "Situação: Dia Util da Semana";
			break;
		}
		
		System.out.println(" ----- Imprimindo dados em tela ----- ");
		System.out.println("Modo Exemplo 1:");
		System.out.println(situacao);
		System.out.println(" <<<Fim do Programa>>> ");
		System.out.println("-------------------------------------");
		System.out.println("Modo Exemplo 2:");
		System.out.println(sit);
		System.out.println(" <<<Fim do Programa>>> ");
		

	}

}
