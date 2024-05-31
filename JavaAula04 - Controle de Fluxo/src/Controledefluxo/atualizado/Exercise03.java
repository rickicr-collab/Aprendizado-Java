package Controledefluxo.atualizado;

public class Exercise03 {

	public static void main(String[] args) {
		tituloGerador();
		int valorMaximo = 10;
		for(int i = 0; i <= valorMaximo;i++) {
			if(i % 2 == 0) {
				System.out.println("Números Pares: " + i);
			}
		}
	}
	
	public static void tituloGerador() {
		System.out.println("---------------------------------------------");
		System.out.println("   Exercicio Estrutura de Repetição for      ");
		System.out.println("---------------------------------------------");
		System.out.println("<<<< trabalhando com laço for >>>>");
	}

}
