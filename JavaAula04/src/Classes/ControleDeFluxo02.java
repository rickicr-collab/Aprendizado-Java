package Classes;

public class ControleDeFluxo02 {
	// CONTROLE DE FLUXO UTILIZANDO OPERADOR TERNÁRIO

	public static void main(String[] args) {
		int idade = 15;
		String status;
		
		// APLICANDO A OPERAÇÃO DE OPERADOR TERNÁRIO E COLOCANDO NA VARIAVEL STATUS
		System.out.println(" ----- Imprimindo dados em Tela ------ ");
		status = idade >= 18 ? " Status: Adulto":"Status : Não Adulto";
		System.out.println(status);
		

	}

}
