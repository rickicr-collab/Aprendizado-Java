package sobrecargametodosteste;

import sobrecargametodos.classes.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		tituloGerador();
		Anime anime = new Anime();
		anime.init("Naruto", "TV", 725, "Shonen");
		anime.imprime();
	

	}
	
	private static void tituloGerador() {
		System.out.println("---------------------------------------------------");
		System.out.println("        Introdução Sobrecarga de Metodos           ");
		System.out.println("---------------------------------------------------");
	}

}
