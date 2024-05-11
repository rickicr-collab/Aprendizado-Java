package colecoes.teste;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import colecoes.classe.Produto;

public class SetTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exemplo 01 - Usando Método HashSet");
		Produto produto1 = new Produto("714", " Notebook Lenovo", 2500.0, 10);
		Produto produto2 = new Produto("415", " Tevevisão LG g4200", 3500.0, 10);
		Produto produto3 = new Produto("116", " Celular Galaxy S23", 1500.0, 0);
		Produto produto4 = new Produto("217", " Fogão Brastemp", 1587.9, 0);
		Produto produto5 = new Produto("999", " Guarda- Roupa solteiro", 1850.0, 10);
		Set <Produto> produtoSet = new HashSet<Produto>();
		produtoSet.add(produto1);
		produtoSet.add(produto2);
		produtoSet.add(produto3);
		produtoSet.add(produto4);
		produtoSet.add(produto5);
		for(Produto prod: produtoSet) {
			System.out.println(prod);
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Exemplo 02 - Usando Método LinkedHashSet");
		Set <Produto> produtoSet2 = new LinkedHashSet<Produto>();
		produtoSet2.add(produto1);
		produtoSet2.add(produto2);
		produtoSet2.add(produto3);
		produtoSet2.add(produto4);
		produtoSet2.add(produto5);
		for(Produto prod: produtoSet2) {
			System.out.println(prod);
		}
		
	}
	
	
	
	
	
	
	
	
	private static void tituloGerador() {
		System.out.println("-----------------------------------------------");
		System.out.println("   Trabalhando com Coleções - Metodos Sets");
		System.out.println("-----------------------------------------------");
	}

}
