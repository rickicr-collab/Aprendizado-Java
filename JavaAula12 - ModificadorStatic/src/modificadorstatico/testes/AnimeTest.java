package modificadorstatico.testes;

import modificadorestatico.domain.Anime;

public class AnimeTest {

	public static void main(String[] args) {
		Anime anime1 = new Anime("One pierce");
		Anime anime2 = new Anime("Naruto");
		Anime anime3 = new Anime("Demon Slayer");
		
		System.out.println("Nome: " + anime1.getNome());
		System.out.println("Nome: " + anime2.getNome());
		System.out.println("Nome: " + anime3.getNome());
	}

}
