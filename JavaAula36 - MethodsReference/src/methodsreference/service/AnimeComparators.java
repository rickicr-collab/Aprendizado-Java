package methodsreference.service;

import methodsreference.classe.Anime;

public class AnimeComparators {

	public static int compareByTitle(Anime a1, Anime a2) {
		return a1.getTitlle().compareTo(a2.getTitlle());

	}

	public static int compareByepisodies(Anime a1, Anime a2) {
		return Integer.compare(a1.getEpsodies(), a2.getEpsodies());
	}

	public int compareByepisodiesNonStatic(Anime a1, Anime a2) {
		return Integer.compare(a1.getEpsodies(), a2.getEpsodies());
	}

}
