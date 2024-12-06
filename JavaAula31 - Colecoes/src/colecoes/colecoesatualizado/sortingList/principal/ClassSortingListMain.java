package colecoes.colecoesatualizado.sortingList.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassSortingListMain {
	public static void main(String[] args) {
		titulo();
		List<String> mangas = new ArrayList<>();
		mangas.add("Attack on titan");
		mangas.add("One Piece");
		mangas.add("Naruto");
		mangas.add("Boruto");
		mangas.add("Berserk");
		
		Collections.sort(mangas);
		
		System.out.println("Visualizando a lista Nomes ( Ordenada ): ");
		for(String manga: mangas) {
			System.out.println("Mangas: [" + manga + "]");
		}
		System.out.println("---------------------------------");
		List<Double> dinheiro = new ArrayList<Double>();
		dinheiro.add(500.55);
		dinheiro.add(100.50);
		dinheiro.add(780.65);
		dinheiro.add(98.78);
		dinheiro.add(250.50);
		dinheiro.add(21.28);
		
		Collections.sort(dinheiro);
		System.out.println("visualizando a Lista Dinheiro (Ordenada): ");
		for(Double d: dinheiro) {
			System.out.println("Dinheiro: [" + d + " R$]");
		}
		
		
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("       Coleções SortingList         ");
		System.out.println("------------------------------------");
	}

}
