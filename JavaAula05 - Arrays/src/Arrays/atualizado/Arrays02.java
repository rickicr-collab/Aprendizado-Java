package Arrays.atualizado;

public class Arrays02 {

	public static void main(String[] args) {
		tituloGerador();
		String[] nomes = new String[4];
		nomes[0] = "Ricardo";
		nomes[1] = "Marcela";
		nomes[2] = "Katerine";
		nomes[3] = "Priscila";
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Nomes: " + nomes[i]);
		}

	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------");
		System.out.println("          Trabalhando com Arrays               ");
		System.out.println("-----------------------------------------------");
		System.out.println("<<< Exemplo de Array com String >>>");
	}

}
