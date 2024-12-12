package colecoes.colecoesatualizado.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ClassInteratorMain {
	
	public static void main(String[] args) {
		titulo();
		List<Manga> mangas = new ArrayList<>();
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50, 0));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00, 20));
		mangas.add(new Manga(3L, "Naruto", 55.60, 0));
		mangas.add(new Manga(6L, "Attack on titan", 67.85, 0));
		mangas.add(new Manga(7L, "Berserk", 75.65, 60));
		
		Iterator<Manga> iteratorManga = mangas.iterator();
		while(iteratorManga.hasNext()) {
			if(iteratorManga.next().getQuantidade() == 0) {
				iteratorManga.remove();
			}
		}
		mangas.removeIf(manga -> manga.getQuantidade() == 0);
		System.out.println(mangas);
		
	}
	
	private static void titulo() {
		System.out.println("-------------------------------");
		System.out.println("      Coleções - iterator      ");
		System.out.println("-------------------------------");
	}

}
