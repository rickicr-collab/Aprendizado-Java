package Arrays.atualizado;

public class Arrays01 {

	public static void main(String[] args) {
		tituloGerador();
		
		int[] idades = new int[4];
		idades[0] = 18;
		idades[1] = 25;
		idades[2] = 18;
		idades[3] = 25;
		for(int id: idades) {
			System.out.println("idades: ["+ id + "]");
		}
		
	}
	
	public static void tituloGerador() {
		System.out.println("---------------------------------------------------");
		System.out.println("               Trabalhando com Arrays              ");
		System.out.println("---------------------------------------------------");
		System.out.println(" <<<<< Arrays com Interiros >>>>>>");
	}

}
