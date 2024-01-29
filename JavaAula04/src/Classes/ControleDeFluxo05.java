package Classes;

public class ControleDeFluxo05 {
	/*
	 * UTILIZANDO O COMANDO BREAK 
	 * 
	 */

	public static void main(String[] args) {
		/*
		 * EXEMPLO 1:
		 * DADO UM VALOR DE UM CARRO DESCUBRA QUANTAS VEZES ELE PODE PARCELAR SEU VALOR
		 * POREM AS PARCELAS NÃO PODEM SER ABAIXO DE 1000.
		 */
		
		// TRABALHANDO COM O COMANDO BREAK 
		double valorTotal = 30000;
		
		for(int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				break;
			}
			System.out.println(" Parcela "+ parcela + " R$ " + valorParcela );
		}
	}

}
