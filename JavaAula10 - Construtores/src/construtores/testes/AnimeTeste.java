package construtores.testes;

import construtores.classes.Anime;

public class AnimeTeste {

	public static void main(String[] args) {
		tituloGerador();
		Anime anime = new Anime("Naruto", "TV / Ação / Aventura", 725, "Shonen", "Pierrot");
		Anime anime2 = new Anime("Dragon Ball Z", "TV / Ação / Aventura", 301, "Shonen", "Universo7");
		anime.imprime();
		anime2.imprime();

	}

	public static void tituloGerador() {
		System.out.println("------------------------------------------");
		System.out.println("        Introdução a Construtores         ");
		System.out.println("------------------------------------------");
	}

}
