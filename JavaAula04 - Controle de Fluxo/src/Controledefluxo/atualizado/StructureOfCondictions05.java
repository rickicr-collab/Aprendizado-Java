package Controledefluxo.atualizado;

public class StructureOfCondictions05 {

	public static void main(String[] args) {
		tituloGerador();
		int valorMax = 50;
		for(int i = 0; i <= valorMax; i++) {
			if(i > 25) {
				break;
			}
			System.out.println("Numeros: " + i);
		}

	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------------");
		System.out.println("        Trabalhando com função break            ");
		System.out.println("------------------------------------------------");
		System.out.println("Função de quebra de laço - Break");
	}

}
