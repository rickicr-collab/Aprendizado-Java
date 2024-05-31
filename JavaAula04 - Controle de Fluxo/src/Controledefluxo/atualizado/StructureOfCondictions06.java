package Controledefluxo.atualizado;

public class StructureOfCondictions06 {

	public static void main(String[] args) {
		tituloGerador();
		double valorTotal = 30000;
		for(int parcela = (int)valorTotal;parcela >= 1;parcela--) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				continue;
			}
			System.out.println("Parcela: " + parcela + " Valor: [" + valorParcela +" R$]");
		}

	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------------");
		System.out.println("        Trabalhando com função continue            ");
		System.out.println("------------------------------------------------");
		System.out.println("Função de isolamento de laço - continue");
	}

}
