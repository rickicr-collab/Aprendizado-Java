package colecoes.colecoesatualizado.navigableset;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import colecoes.colecoesatualizado.iterator.Manga;

class MangaPrecoComparator implements Comparator<Manga>{
	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
}



public class ClassNavigableSetMain02 {
	public static void main(String[] args) {
		titulo();
		
		NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50, 0));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00, 20));
		mangas.add(new Manga(3L, "Naruto", 55.60, 0));
		mangas.add(new Manga(6L, "Attack on titan", 67.85, 0));
		mangas.add(new Manga(7L, "Berserk", 75.65, 60));
		mangas.add(new Manga(10L,"Yuyu Hakusho", 10.50, 5));
		mangas.add(new Manga(15L,"Tsukimichi", 95.00, 5));
		
		Manga yahiko = new Manga(15L, "Akatsuki", 60.00, 5);
		
		System.out.println("<<< Imprimindo NavigableSet Mangas >>>");
		for(Manga manga: mangas) {
			System.out.println(manga);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("<<< Imprimindo utilizando o Método descendingSet >>>");
		for(Manga manga2: mangas.descendingSet()) {
			System.out.println(manga2);
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("<<< Método NavigableSet Uteis >>>");
		// método lower: dentro de uma comparação de preço ele traz os objetos de valor mais baixo proximo do valor de comparação.
		System.out.println("Método Lower: " + mangas.lower(yahiko));
		
		// metodo floor: dentro da comparação por exemplo de preço ele traz o valor igual ou menor abaixo dele:
		System.out.println("Método floor: " + mangas.floor(yahiko));
		
		// metodo higher: dentro da comparação ele traz o maior valor:
		System.out.println("Método Higher: " + mangas.higher(yahiko));
		
		// metodo ceiling: dentro da comparação ele traz o valor igual ou maior:
		System.out.println("Método ceiling: " + mangas.ceiling(yahiko));
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("<<< Metodos pollFirst / pollLast >>>");
		// metodo pullfirst: Retira primeiro elemento da lista e atualiza o tamanho da mesma:
		System.out.println("tamanho original : " + mangas.size());
		System.out.println("Elemento retirado - Metodo PollFirst: " + mangas.pollFirst());
		System.out.println("Tamanho atualizado: " + mangas.size());
		// método pollLast: retira o ultimo elemento da lista e atualiza o tamanho da mesma:
		System.out.println("tamanho original : " + mangas.size());
		System.out.println("Elemento retirado - Metodo PollLast: " + mangas.pollLast());
		System.out.println("Tamanho atualizado: " + mangas.size());
	}
	
	private static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("   Coleções - NavigableSet / TreeSet     ");
		System.out.println("-----------------------------------------");
	}

}
