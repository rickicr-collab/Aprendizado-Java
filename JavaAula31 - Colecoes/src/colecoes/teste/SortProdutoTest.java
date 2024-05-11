package colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import colecoes.classe.Produto;

class ProdutoNomeComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}

public class SortProdutoTest {

	public static void main(String[] args) {
		tituloApresentador();
		System.out.println("<<<< Lista Produto >>>>");
		List<Produto> produtos = new ArrayList<Produto>();
		Produto[] produtosArray = new Produto[4];		
		
		Produto produto1 = new Produto("714", " Notebook Lenovo", 2500.0, 15);
		Produto produto2 = new Produto("415", " Tevevisão LG g4200", 3500.0, 10);
		Produto produto3 = new Produto("116", " Celular Galaxy S23", 1500.0, 5);
		Produto produto4 = new Produto("217", " Fogão Brastemp", 1587.9, 3);
		produtosArray[0] = produto1;
		produtosArray[1] = produto2;
		produtosArray[2] = produto3;
		produtosArray[3] = produto4;
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		for(Produto p: produtos) {
			System.out.println(p);
		}
		System.out.println("------------------------------------------------------");
		System.out.println("<<<<< Lista produto Ordenada >>>>>");
		Collections.sort(produtos);
		for(Produto prod: produtos) {
			System.out.println(prod);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("<<<<< Array produtosArray  >>>>>>");
		System.out.println("Imprimindo valores do Array");
		System.out.println(Arrays.toString(produtosArray));
		System.out.println("------------------------------------------------------");
		System.out.println("<<<<< Array produtoArray Ordenado >>>>>");
		Arrays.sort(produtosArray, new ProdutoNomeComparator());
		for(Produto prod: produtosArray) {
			System.out.println(prod);
		}
		
		

	}
	
	private static void tituloApresentador() {
		System.out.println("------------------------------------------------------");
		System.out.println("Trabalhando com Listas ordenadas usando Classe Produto");
		System.out.println("------------------------------------------------------");
	}

}
