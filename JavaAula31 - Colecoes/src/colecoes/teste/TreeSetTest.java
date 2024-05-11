package colecoes.teste;


import java.util.NavigableSet;
import java.util.TreeSet;
import colecoes.classe.Produto;



public class TreeSetTest {

	public static void main(String[] args) {
		tituloGerador();
		Produto produto1 = new Produto("714", " Notebook Lenovo", 2500.0, 10);
		Produto produto2 = new Produto("415", " Tevevisão LG g4200", 3500.0, 10);
		Produto produto3 = new Produto("116", " Celular Galaxy S23", 1500.0, 1);
		Produto produto4 = new Produto("217", " Fogão Brastemp", 1587.9, 1);
		Produto produto5 = new Produto("999", " Guarda- Roupa solteiro", 1850.0, 10);
		NavigableSet<Produto> produtoNavigableSet = new TreeSet<Produto>();
		produtoNavigableSet.add(produto1);
		produtoNavigableSet.add(produto2);
		produtoNavigableSet.add(produto3);
		produtoNavigableSet.add(produto4);
		produtoNavigableSet.add(produto5);
		produtoNavigableSet.hashCode();
		for(Produto p: produtoNavigableSet.descendingSet()) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Métodos utilizaveis");
		System.out.println("Método Lower: " + produtoNavigableSet.lower(produto5));
		System.out.println("Método ceiling: " + produtoNavigableSet.ceiling(produto5));
		System.out.println("Metodo Higher: " + produtoNavigableSet.higher(produto5));
		System.out.println("Método floor: " + produtoNavigableSet.floor(produto5));
		System.out.println("Quantidade original: " + produtoNavigableSet.size());
		System.out.println("Método Pullfirst: " + produtoNavigableSet.pollFirst());
		System.out.println("Metodo Polllast: " + produtoNavigableSet.pollLast());
		System.out.println("Quantidade Atual: " + produtoNavigableSet.size());
		
		
		

	}
	
	private static void tituloGerador() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Trabalhando com Coleções - Metodos Sets ( NavigableSet / TreeSet");
		System.out.println("----------------------------------------------------------------");
	}


}
