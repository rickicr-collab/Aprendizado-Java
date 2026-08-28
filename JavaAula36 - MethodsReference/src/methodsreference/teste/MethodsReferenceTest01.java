package methodsreference.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import methodsreference.classe.Anime;
import methodsreference.service.AnimeComparators;

public class MethodsReferenceTest01 {
	public static void main(String[] args) {
		titulo();
		
		List<Anime> animes = new ArrayList(List.of(new Anime("Naruto", 750), new Anime("Hellsing", 15), new Anime("Yuyu Hakusho", 112)));
		Collections.sort(animes,AnimeComparators::compareByTitle);
		Collections.sort(animes,AnimeComparators::compareByepisodies);
		System.out.println(animes);
	}
	
	public static void titulo() {
		System.out.println("-------------------------------------------");
		System.out.println("     <<< Methods Reference / static >>>    ");
		System.out.println("-------------------------------------------");
	}

}
