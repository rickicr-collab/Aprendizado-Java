package colecoes.teste;

import java.util.HashMap;
import java.util.Map;

import colecoes.classe.Leitor;
import colecoes.colecoesatualizado.iterator.Manga;

public class MapUpdated02 {
	public static void main(String[] args) {
		titulo();
		Map <Leitor, Manga> listaMap = new HashMap<>();
		Leitor leitor1 = new Leitor("ricardo");
		Leitor leitor2 = new Leitor("Priscila");
		Leitor leitor3 = new Leitor("Bruno");
		Leitor leitor4 = new Leitor("Marcela");
		Leitor leitor5 = new Leitor("Luana");
		Leitor leitor6 = new Leitor("Erica");
		Leitor leitor7 = new Leitor("Emanuelly");

		Manga hellsing = new Manga(5L, "Hellsing Ultimate", 75.50, 0);
		Manga dragonBall = new Manga(9L, "Dragon Ball z", 80.00, 20);
		Manga naruto = new Manga(3L, "Naruto", 55.60, 0);
		Manga attackTitan = new Manga(6L, "Attack on titan", 67.85, 0);
		Manga berserk = new Manga(7L, "Berserk", 75.65, 60);
		Manga yuyuHakusho = new Manga(10L,"Yuyu Hakusho", 10.50, 5);
	    Manga tsukimichi = new Manga(15L,"Tsukimichi", 95.00, 5);

		listaMap.put(leitor1, hellsing);
		listaMap.put(leitor2, dragonBall);
		listaMap.put(leitor3, naruto);
		listaMap.put(leitor4, attackTitan);
		listaMap.put(leitor5, berserk);
		listaMap.put(leitor6, yuyuHakusho);
		listaMap.put(leitor7, tsukimichi);
		
		
		System.out.println("---------------------------------------------");
		System.out.println(" ------ <<< Visualizando o Map  >>> ---------");
		listaMap.forEach((chave, valor) -> System.out.println("[ " +  chave.getNome() + " / "  + valor.getNome() + " ]"));
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("       <<< Collections -  MAP >>>          ");
		System.out.println("------------------------------------");
	}

}
