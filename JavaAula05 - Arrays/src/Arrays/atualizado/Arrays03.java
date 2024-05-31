package Arrays.atualizado;

public class Arrays03 {

	public static void main(String[] args) {
		tituloGerador();
		int[] numeros = new int[4]; // primeira forma
		int[]numeros2 = {4,5,6,8,12,25}; // segunda forma
		int[] numeros3 = new int[] {15,25,35,45,55}; // terceira forma
		
		for(int i = 0; i < numeros2.length; i++) {
			System.out.println("Numeros: " + numeros2[i]);
		}
		System.out.println("--------------------------------------------");
		for(int num: numeros3) {
			System.out.println("numeros: " + num);
		}

	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------");
		System.out.println("          Trabalhando com Arrays               ");
		System.out.println("-----------------------------------------------");
		System.out.println("<<< Formas de inicializar e visualizar um array >>>");
	}

}
