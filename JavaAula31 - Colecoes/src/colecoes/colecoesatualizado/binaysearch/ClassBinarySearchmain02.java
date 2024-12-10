package colecoes.colecoesatualizado.binaysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import colecoes.colecoesatualizado.sortingList.Manga;

class MangaSortByIdComparator implements Comparator<Manga>{
	@Override
	public int compare(Manga manga1, Manga manga2) {
		return Long.compare(manga1.getId(), manga2.getId());
	}
	
}

public class ClassBinarySearchmain02 {
	public static void main(String[] args) {
		titulo();
		List<Manga> mangas = new ArrayList<>();
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00));
		mangas.add(new Manga(3L, "Naruto", 55.60));
		mangas.add(new Manga(6L, "Attack on titan", 67.85));
		mangas.add(new Manga(7L, "Berserk", 75.65));
		
		//Collections.sort(mangas);
		mangas.sort(new MangaSortByIdComparator());
		System.out.println("Lista de Mangas: ");
		for(Manga m:  mangas) {
			System.out.println(m);
		}
		
		Manga mangaSearch = new Manga(7L, "Berserk", 75.65);
		System.out.println("Utilizando binary Search: [" + Collections.binarySearch(mangas, mangaSearch) + "]");
		
	}
	
	private static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("      Coleções - Binary Search      ");
		System.out.println("------------------------------------");
	}

}
