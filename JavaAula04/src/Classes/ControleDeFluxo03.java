package Classes;

public class ControleDeFluxo03 {
	//CONTROLE DE FLUXO - ESTRUTURA SWITCH
	
	/*
	 *  QUAIS CLASSES PRIMITIVAS PERMITIDAS A SEREM USADAS NA ESTRUTURA SWITCH
	 *  CHAR: CHAR
	 *  INTEIRO: INT
	 *  SHORT: SHORT
	 *  BYTE: BYTE
	 *  ENUM: ENUM
	 *  STRING: STRING
	 * 
	 */

	public static void main(String[] args) {
		byte dia = 5;
		String situacao = "";
		switch(dia) {
		case 1:
			situacao = "Domingo";
			break;
		case 2:
			situacao = "Segunda - Feira";
			break;
		case 3:
			situacao = "Terca - Feira";
			break;
		case 4:
			situacao = "Quarta - Feira";
			break;
		case 5:
			situacao = "Quinta - Feira";
			break;
		case 6:
			situacao = "Sexta - Feira";
			break;
		case 7:
			situacao = "Sabado";
			break;
		}
		System.out.println(" ----- Imprimindo dados em Tela ------ ");
		System.out.println(situacao);
		System.out.println("fim do programa");
		

	}

}
