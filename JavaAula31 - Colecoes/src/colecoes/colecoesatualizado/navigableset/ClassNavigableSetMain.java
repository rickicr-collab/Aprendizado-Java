package colecoes.colecoesatualizado.navigableset;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import colecoes.colecoesatualizado.equals.Smartphone;
import colecoes.colecoesatualizado.iterator.Manga;


class SmartphoneMarcaComparable implements Comparator<Smartphone>{

	@Override
	public int compare(Smartphone o1, Smartphone o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}
	
}

public class ClassNavigableSetMain {

	public static void main(String[] args) {
		titulo();
		
		NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparable());
		Smartphone celular = new Smartphone("1804", "Sansung");
		Smartphone celular2 = new Smartphone("1834", "Apple");
		Smartphone celular3 = new Smartphone("1944", "Nokia");
		set.add(celular);
		set.add(celular2);
		set.add(celular3);
		System.out.println("<<< Imprimindo NavigableSet Smartphone >>>");
		System.out.println(set);
		
		System.out.println("------------------------------------------");
		NavigableSet<Manga> mangas = new TreeSet<>();
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50, 0));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00, 20));
		mangas.add(new Manga(3L, "Naruto", 55.60, 0));
		mangas.add(new Manga(6L, "Attack on titan", 67.85, 0));
		mangas.add(new Manga(7L, "Berserk", 75.65, 60));
		
		System.out.println("<<< Imprimindo NavigableSet Mangas >>>");
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
	

	}
	
	private static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("   Coleções - NavigableSet / TreeSet     ");
		System.out.println("-----------------------------------------");
	}


}
