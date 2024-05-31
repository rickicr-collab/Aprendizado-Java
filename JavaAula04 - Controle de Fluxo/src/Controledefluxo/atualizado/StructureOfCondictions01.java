package Controledefluxo.atualizado;

public class StructureOfCondictions01 {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exemplo - condição If");
		int idade = 20;
		boolean isAutorizadoAComprarBebida = idade >=18;
		if(isAutorizadoAComprarBebida) {
			System.out.println("Autorizado a Comprar Bebida");
		}
		if(!isAutorizadoAComprarBebida) {
			System.out.println("Não autorizado a Comprar Bebida");
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Exemplo - condição if / else");
		if(isAutorizadoAComprarBebida) {
			System.out.println("Autorizado a Comprar Bebida");
		}else {
			System.out.println("Não autorizado a Comprar Bebida");
		}
		
	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------");
		System.out.println("         Estruturas de Condição                   ");
		System.out.println("--------------------------------------------------");
		System.out.println("<<< Condições if / Condições if else >>>");
	}

}
