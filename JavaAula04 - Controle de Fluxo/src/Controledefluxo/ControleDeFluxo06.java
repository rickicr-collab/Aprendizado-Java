package Controledefluxo;

public class ControleDeFluxo06 {
	/*
	 * UTILIZANDO O COMANDO CONTINUE:
	 */
	public static void main(String[] args) {
	/*
	 * EXEMPLO 2:
	 * DADO UM VALOR DE UM CARRO DESCUBRA QUANTAS VEZES ELE PODE PARCELAR SEU VALOR
	 * POREM AS PARCELAS NÃO PODEM SER ABAIXO DE 1000.
	 */
		
	// TRABALHANDO COM O COMANDO CONTINUE:
		
		double valorTotal = 30000;
		for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela <= 1000) {
				// EXECUTANDO COMANDO CONTINUE OS VALORES MENORES QUE 1000 SERÃO IGNORADOS 
				// POUPANDO MEMORIA DESPERDICADA.
				continue;
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);
			System.out.println("consumindo memoria");
		}
	}
}
