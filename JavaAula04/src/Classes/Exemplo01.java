package Classes;

public class Exemplo01 {
	
	// CONTROLE DE FLUXOS OU ESTRUTURAS CONDIÇIONAIS 
	
		/*
		 * IF : SE
		 * ELSE IF : SENÃO SE
		 * ELSE : SENÃO
		 */

	public static void main(String[] args) {
		
		// APLICANDO ESTRUTURAS CONDICIONAIS 
		int idade = 25;
		String categoria = "";
		System.out.println(" ----- Imprimindo dados em tela ------ ");
		// ESTRUTURA CONDICIONAL IF
		if (idade >= 18 && idade <= 70) {
		//  CONDIÇÃO IF  CRIANDO UMA VARIAVEL STRING PARA COM CONCATENACAO DE COM VALOR INTEIRO
			categoria = "Com a idade de: " + idade +  " → Voto Obrigatótio !! "	;		
		// ESTRUTURA CONDICIONAL ELSE IF 
		}else if((idade >= 16 && idade < 18) || idade > 70) {
		// CONDIÇÃO ELSE IF COM VARIAVEL DE RETORNO COM CONCATENAÇÃO COM INTEIRO 
			categoria = " Com a idade de : " + idade + " → Voto Opcionál !! ";
		// ESTRUTURA ELSE
		}else {
		// CONDIÇÃO ELSE COM VARIAVEL DE RETORNO COM CONCATENAÇÃO COM INTEIRO
			categoria = " Com a idade de : " + idade + " → Voto Proibido !! ";
		}
		// IMPRIMINDO O VALOR DA VARIAVEL CATEGORIA 
		System.out.println(categoria);

	}

}
