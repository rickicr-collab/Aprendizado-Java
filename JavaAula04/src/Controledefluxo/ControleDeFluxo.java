package Controledefluxo;

public class ControleDeFluxo {
	
	// CONTROLE DE FLUXOS OU ESTRUTURAS CONDIÇIONAIS 
	
	/*
	 * IF : SE
	 * ELSE IF : SENÃO SE
	 * ELSE : SENÃO
	 * 
	 */

	public static void main(String[] args) {
		// IMPRIMINDO UM IF COM CONDIÇÃO VERDADEIRA
		int idade = 20;
		int salario = 2000;
		// CONDIÇÃO IF
		if (idade == 20 && salario == 2000) {
			System.out.println("Condição atendida e satisfeita");
		// CONDIÇÃO ELSE IF
		}else if(idade <= 20 || salario < 1000){
			System.out.println("Condição else if atendida e satisfeita ");
		// CONDIÇÃO ELSE
		}else {
			System.out.println("Condição else atendida e satisfeita ");
		}
		
	}
	
	
}
