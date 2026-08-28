package methodsreference.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import methodsreference.classe.Anime;
import methodsreference.service.AnimeComparators;

public class MethodsReferenceTest04 {
	public static void main(String[] args) {
		titulo();
		Supplier<AnimeComparators>  animeComparato = AnimeComparators::new;
		AnimeComparators animecomp = animeComparato.get();
		List<Anime> animes = new ArrayList(List.of(new Anime("Naruto", 750), new Anime("Hellsing", 15), new Anime("Yuyu Hakusho", 112)));
		animes.sort(animecomp::compareByepisodiesNonStatic);
		System.out.println("Resultado com Supplier: " + animes);
		System.out.println("-------------------------------------------------------");
		
		
		
	}
	
	public static void titulo() {
		System.out.println("--------------------------------------------------");
		System.out.println("          <<< Methods Reference  >>>              ");
		System.out.println("--------------------------------------------------");
	}

}
