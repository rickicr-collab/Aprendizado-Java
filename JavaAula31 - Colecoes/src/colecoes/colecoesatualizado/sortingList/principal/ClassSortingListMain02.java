package colecoes.colecoesatualizado.sortingList.principal;

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


public class ClassSortingListMain02 {
	public static void main(String[] args) {
		titulo();
		List<Manga> mangas = new ArrayList<>();
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00));
		mangas.add(new Manga(3L, "Naruto", 55.60));
		mangas.add(new Manga(6L, "Attack on titan", 67.85));
		mangas.add(new Manga(7L, "Berserk", 75.65));
		
		System.out.println("Visualizando a Lista mangas: ");
		for(Manga m: mangas) {
			System.out.println(m);
		}
		System.out.println("---------------------------------");
		Collections.sort(mangas);
		System.out.println("Visualizando a Lista (Ordenada por Nome): ");
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
		
		System.out.println("---------------------------------");
		System.out.println("Visualizando a Lista (Ordenada por ID utilizando classe externa): ");
		Collections.sort(mangas, new MangaSortByIdComparator());
		for(Manga man: mangas) {
			System.out.println(man);
		}
		
		

	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("       Coleções SortingList         ");
		System.out.println("------------------------------------");
	}

}
