package colecoes.teste;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import colecoes.classe.Produto;

public class IteratorTest {

	public static void main(String[] args) {
		tituloGerador();
		List<Produto> produtos = new LinkedList<Produto>();
		Produto produto1 = new Produto("714", " Notebook Lenovo", 2500.0, 10);
		Produto produto2 = new Produto("415", " Tevevisão LG g4200", 3500.0, 10);
		Produto produto3 = new Produto("116", " Celular Galaxy S23", 1500.0, 0);
		Produto produto4 = new Produto("217", " Fogão Brastemp", 1587.9, 0);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		System.out.println("<<<<< Utilizando os Métodos ArraysList / LinkedList >>>>>");
		System.out.println("Tamanho original: " + produtos.size());
		for(Produto prod: produtos) {
			if(prod.getQuantidade() == 0) {
				System.out.println(prod);
				produtos.remove(prod);
				
			}
		}
		System.out.println("Tamanho apos a remoção: " + produtos.size());
		System.out.println("Fim do Programa...");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("<<<<< Utilizando o método iterator >>>>>");
		Iterator <Produto> produtoIterator = produtos.iterator();
		while(produtoIterator.hasNext()) {
			if(produtoIterator.next().getQuantidade() == 0) {
				produtoIterator.remove();
			}
		}
		System.out.println("Tamanho apos remoção do método iterator: " + produtos.size());

	}
	
	private static void tituloGerador() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("     Removendo itens de uma Lista usando iterator");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
