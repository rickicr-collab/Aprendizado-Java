package Controledefluxo.atualizado;

public class RepeatingStructure {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<< Estrutura while >>>");
		int contador = 0;
		while(contador < 10) {
			contador++;
			System.out.println("Contador: " + contador);
			
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("<<< Estrutura Do - While >>>");
		int contador2 = 0;
		do {
			contador2++;
			System.out.println("Contador: " + contador2);
		}while(contador2 < 10);
		
		System.out.println("--------------------------------------------------");
		System.out.println("<<< Estrutura for >>>");
		for(int i = 1; i <= 10; i++) {
			System.out.println("Contador: " + i);
		}
	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("        Estruturas de Repetição while - while do - for        ");
		System.out.println("--------------------------------------------------------------");
	}

}
