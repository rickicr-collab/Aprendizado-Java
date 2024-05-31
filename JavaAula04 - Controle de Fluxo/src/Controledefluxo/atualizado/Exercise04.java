package Controledefluxo.atualizado;

public class Exercise04 {

	public static void main(String[] args) {
		tituloGerador();
		int valorMax = 30000;
		for(int parcela = 1; parcela <= valorMax; parcela++) {
			double valorParcela = valorMax / parcela;
			if(valorParcela >= 1000) {
				System.out.println("Parcela: " + parcela + " Valor: [" +valorParcela+" R$]");
			}else {
				break;
			}
		}
	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------");
		System.out.println("     Exercicio função de quabra de laço break     ");
		System.out.println("--------------------------------------------------");
	}

}
 