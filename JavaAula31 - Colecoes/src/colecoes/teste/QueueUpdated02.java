package colecoes.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import colecoes.colecoesatualizado.iterator.Manga;


class MangaPrecoComparator implements Comparator<Manga>{
	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
}

public class QueueUpdated02 {
	public static void main(String[] args) {
		titulo();
		Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
		mangas.add(new Manga(5L, "Hellsing Ultimate", 75.50, 0));
		mangas.add(new Manga(9L, "Dragon Ball z", 80.00, 20));
		mangas.add(new Manga(3L, "Naruto", 55.60, 0));
		mangas.add(new Manga(6L, "Attack on titan", 67.85, 0));
		mangas.add(new Manga(7L, "Berserk", 75.65, 60));
		mangas.add(new Manga(10L,"Yuyu Hakusho", 10.50, 5));
		mangas.add(new Manga(15L,"Tsukimichi", 95.00, 5));
		
		System.out.println("------------ visualizando os mangas com classe contendo comparator -------------");
		while(!mangas.isEmpty()) {
			System.out.println(mangas.poll());
		}
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------------------");
		System.out.println("       <<< Collections -  Queue/PriorityQueue >>>   ");
		System.out.println("----------------------------------------------------");
	}

}
