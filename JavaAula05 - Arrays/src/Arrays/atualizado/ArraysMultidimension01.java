package Arrays.atualizado;

public class ArraysMultidimension01 {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("trabalhando com for com indiçe");
		int[][] dias = new int[3][3];
		
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 20;
		
		dias[1][0] = 32;
		dias[1][1] = 15;
		dias[1][2] = 11;
		
		dias[2][0] = 11;
		dias[2][1] = 05;
		dias[2][2] = 07;
		
		for(int i = 0; i < dias.length; i++) {
			for(int j = 0; j < dias[i].length; j++) {
				System.out.println("numeros: " + dias[i][j]);
			}
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Trabalhando com Foreach - visualização");
		for(int[] array: dias) {
			for(int num: array) {
				System.out.println("Numeros: " + num);
			}
		}
		
	
	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------");
		System.out.println("          Trabalhando com Arrays               ");
		System.out.println("-----------------------------------------------");
		System.out.println("<<< Arrays Multidimensionais >>>");
	}

}
