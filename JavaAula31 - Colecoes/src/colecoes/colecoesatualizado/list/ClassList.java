package colecoes.colecoesatualizado.list;

import java.util.ArrayList;
import java.util.List;

public class ClassList {
	public static void main(String[] args) {
		titulo();
		List<String> nomes = new ArrayList<>();
		List<String> nomes2 = new ArrayList<String>();
		nomes.add("Ricardo");
		nomes.add("Marcela");
		nomes.add("Patricia");
		nomes2.add("Cunha");
		nomes2.add("Bruno");
		nomes2.add("Karla");
		
		nomes.addAll(nomes2);
		boolean isRemoved = nomes.remove("Ricardo");

		System.out.println("<<< Imprimindo a lista >>>");
		for (Object nome : nomes) {
			System.out.println("Nomes : [" + nome + "]");
		}
		
		System.out.println("Removeu Ricardo: " + isRemoved);
		
		System.out.println("###############################");
		System.out.println("<<< Imprimindo a Lista e suas Posições >>>");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome na posição [" + i + "]ª → [" + nomes.get(i) + "]");
		}
		
		System.out.println("------------------------------------");
		System.out.println("<<< Imprimindo a lista2 >>>>");
		for(String nome: nomes2) {
			System.out.println("Nomes: [" + nome + "]");
		}
		
		System.out.println("<<< Imprimindo lista2 e suas posições >>>");
		for(int j = 0; j < nomes2.size(); j++) {
			System.out.println("Nome na posição " + j + "ª → [" + nomes2.get(j) + "]") ;
		}

	}

	public static void titulo() {
		System.out.println("--------------------------------------");
		System.out.println("          Coleções - List             ");
		System.out.println("--------------------------------------");
	}

}
