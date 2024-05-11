package colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import colecoes.classe.Produto;

public class BinarySearchTest {

	public static void main(String[] args) {
		tituloGerador();
		List <Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		
		Collections.sort(numeros);
		System.out.println("-------------------------------------");
		System.out.println(" <<<<<< Lista Ordenada numeros >>>>>>");
		for(Integer num: numeros) {
			System.out.println("Numeros: " + num);
		}
		System.out.println("####################################");
		System.out.println("--------- Realizando Busca ---------");
		System.out.println("Posição da Busca: " + Collections.binarySearch(numeros, 1));
		System.out.println("Numero buscado: " + numeros.get(Collections.binarySearch(numeros, 4)));
		
		
		System.out.println("-----------------------------------------------------------");
		tituloGerador2();
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto1 = new Produto("714", " Notebook Lenovo", 2500.0, 0);
		Produto produto2 = new Produto("415", " Tevevisão LG g4200", 3500.0, 10);
		Produto produto3 = new Produto("116", " Celular Galaxy S23", 1500.0, 5);
		Produto produto4 = new Produto("217", " Fogão Brastemp", 1587.9, 3);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		Collections.sort(produtos, new ProdutoNomeComparator());
		Produto produto5 = new Produto("000", " Antena", 50, 5);
		System.out.println("---------------------------------------------------------");
		System.out.println("<<<<<< Lista ordenada produtos >>>>>>");
		for(Produto prod: produtos) {
			System.out.println("Produtos: " + prod);
		}
		
		System.out.println("##################################");
		System.out.println("--------- Realizando Busca Binaria --------------");
		System.out.println("Resultado da Busca: " + Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));
		
		
		
		System.out.println("---------------------------------------------------------");
		System.out.println("<<<<<<< Trabalhando com Arrays >>>>>>>");
		System.out.println("--------- Realizando Busca Binaria --------------");
		Integer[] arrayInteger = new Integer[4];
		arrayInteger[0] = 2;
		arrayInteger[1] = 0;
		arrayInteger[2] = 4;
		arrayInteger[3] = 3;
		Arrays.sort(arrayInteger);
		System.out.println("Resultado da Busca: " + Arrays.binarySearch(arrayInteger, 1));
		

	}
	
	
	
	private static void tituloGerador() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Trabalhando com Buscas Binarias em Listas e Arrays");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	private static void tituloGerador2() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Trabalhando com Buscas Binarias usando Classe Produto");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
