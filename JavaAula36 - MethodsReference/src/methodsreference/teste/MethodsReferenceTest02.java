package methodsreference.teste;

import java.util.ArrayList;
import java.util.List;

import methodsreference.classe.Anime;
import methodsreference.service.AnimeComparators;

public class MethodsReferenceTest02 {
	public static void main(String[] args) {
		titulo();
		AnimeComparators animeComparator = new AnimeComparators();
		List<Anime> animes = new ArrayList(List.of(new Anime("Naruto", 750), new Anime("Hellsing", 15), new Anime("Yuyu Hakusho", 112)));
		animes.sort(animeComparator::compareByepisodiesNonStatic);
		System.out.println(animes);
		
	}
	
	public static void titulo() {
		System.out.println("-------------------------------------------");
		System.out.println("<<< Methods Reference / non Static >>>     ");
		System.out.println("-------------------------------------------");
	}


}
