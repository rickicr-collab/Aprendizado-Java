package colecoes.colecoesatualizado.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import colecoes.colecoesatualizado.iterator.Manga;

public class ClassSetMain {

	public static void main(String[] args) {
		titulo();
		Set<Manga> mangas = new HashSet<>();
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50, 0));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00, 20));
		mangas.add(new Manga(3L, "Naruto", 55.60, 0));
		mangas.add(new Manga(6L, "Attack on titan", 67.85, 0));
		mangas.add(new Manga(7L, "Berserk", 75.65, 60));
		
		
		System.out.println("<<< Imprimindo a Lista Set >>>");
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
		
		System.out.println("------------------------------------");
		
		Set<Manga> mangas2 = new LinkedHashSet<>();
		mangas2.add(new Manga(5L, "Hellsing Ultimate", 75.50, 0));
		mangas2.add(new Manga(9L, "Dragon Ball z", 80.00, 20));
		mangas2.add(new Manga(3L, "Naruto", 55.60, 0));
		mangas2.add(new Manga(6L, "Attack on titan", 67.85, 0));
		mangas2.add(new Manga(7L, "Berserk", 75.65, 60));
		
		System.out.println("<<< Imprimindo a Lista LinkedHashSet >>>");
		for(Manga manga2: mangas2) {
			System.out.println(manga2);
		}

	}
	
	private static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("   Coleções - Set / HashSet - Linked     ");
		System.out.println("-----------------------------------------");
	}

}
