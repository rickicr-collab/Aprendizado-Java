package blocodeinicializacao.testes;

import blocodeinicializacao.classes.Anime;

public class AnimeTeste {

	public static void main(String[] args) {
		tituloGerador();
		Anime anime = new Anime("One Pierce");
		System.out.println("Anime: " + anime.getNome());
		
		
		

	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------");
		System.out.println("      Bloco de Inicialização          ");
		System.out.println("--------------------------------------");
	}

}
