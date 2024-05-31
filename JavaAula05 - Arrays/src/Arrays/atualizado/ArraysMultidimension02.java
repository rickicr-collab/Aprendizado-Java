package Arrays.atualizado;

public class ArraysMultidimension02 {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Primeiro Exemplo");
		int[] array = {2,25};
		int[][]  arrayInt = new int[3][];
		arrayInt[0] = array;
		arrayInt[1] = new int[]{4,6};
		arrayInt[2] = new int[]{7,9,3,4,5,7};
		
		
		for(int[] arrayBase: arrayInt) {
			System.out.println("\n------------");
			for(int num: arrayBase) {
				System.out.println("Números: " + num);
			}
		}
		System.out.println("---------------------------");
		System.out.println("Segundo exemplo");
		
		int[][] arrayInt2 = {{0,1}, {1,2,3}, {1,2,3,4,5,6}};
		
		for(int[] arrayBase2: arrayInt2) {
			for(int num2: arrayBase2) {
				System.out.println("Numeros: " + num2);
			}
		}
	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------");
		System.out.println("          Trabalhando com Arrays               ");
		System.out.println("-----------------------------------------------");
		System.out.println("<<< Arrays Multidimensionais inicialização >>> ");
		
	}

}
