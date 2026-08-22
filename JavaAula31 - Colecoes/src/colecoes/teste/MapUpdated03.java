package colecoes.teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import colecoes.classe.Leitor;
import colecoes.colecoesatualizado.iterator.Manga;

public class MapUpdated03 {
	public static void main(String[] args) {
		titulo();
		Leitor leitor1 = new Leitor("Ricardo");
		Leitor leitor2 = new Leitor("Priscila");
		Manga hellsing = new Manga(5L, "Hellsing Ultimate", 75.50, 0);
		Manga dragonBall = new Manga(9L, "Dragon Ball z", 80.00, 20);
		Manga naruto = new Manga(3L, "Naruto", 55.60, 0);
		Manga attackTitan = new Manga(6L, "Attack on titan", 67.85, 0);
		Manga berserk = new Manga(7L, "Berserk", 75.65, 60);
		Manga yuyuHakusho = new Manga(10L,"Yuyu Hakusho", 10.50, 5);
	    Manga tsukimichi = new Manga(15L,"Tsukimichi", 95.00, 5);
	    
	    
	    System.out.println("----------------------------------------------------------------");
	    System.out.println("Visualizando Maps adicionando um leitor a mais de um objeto utilizando List");
	    Map<Leitor, List<Manga>> leitorManga = new HashMap<>();
	    leitorManga.put(leitor1, List.of(berserk, yuyuHakusho, tsukimichi));
	    leitorManga.put(leitor2, List.of(attackTitan, naruto, dragonBall, hellsing));
	    
	    for(Leitor key: leitorManga.keySet()) {
	    	System.out.println("[ " + key.getNome() + " ]");
	    	for(Manga value: leitorManga.get(key)) {
	    		System.out.println(" - " + value.getNome());
	    	}

	    }
	    System.out.println("------------------------------------------------------------------");
	    System.out.println("utilizando EntrySet");
	    for(Map.Entry<Leitor, List<Manga>> entry : leitorManga.entrySet()) {
	    	Leitor leitor = entry.getKey();
	    	List<Manga> mangas = entry.getValue();
	    	System.out.println("[ " + leitor.getNome() + " ]");
	    	for(Manga manga: mangas) {
	    		System.out.println(" - " + manga.getNome());
	    	}
	    }
	    
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("       <<< Collections -  MAP >>>          ");
		System.out.println("------------------------------------");
	}

}
