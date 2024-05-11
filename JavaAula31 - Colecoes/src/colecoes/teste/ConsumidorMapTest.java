package colecoes.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import colecoes.classe.Consumidor;
import colecoes.classe.Produto;

public class ConsumidorMapTest {

	public static void main(String[] args) {
		tituloGerador();
		Consumidor consumidor1 = new Consumidor("Ricardo Rosendo", "05113");
		Consumidor consumidor2 = new Consumidor("DevDojo", "321");
		Produto produto1 = new Produto("714", " Notebook Lenovo", 2500.0, 0);
		Produto produto2 = new Produto("415", " Tevevisão LG g4200", 3500.0, 10);
		Produto produto3 = new Produto("116", " Celular Galaxy S23", 1500.0, 5);
		Produto produto4 = new Produto("217", " Fogão Brastemp", 1587.9, 3);
		System.out.println("Exemplo 01 - Trabalhando com apenas um unico valor");
		Map<Consumidor, Produto> map = new HashMap<>();
		map.put(consumidor1, produto4);
		map.put(consumidor2, produto3);
		for(Map.Entry<Consumidor, Produto> entry: map.entrySet()) {
			System.out.println("[" + entry.getKey().getNome() + " : " + entry.getValue().getNome() + "]");
		}
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Exemplo 02 - Trabalhando com mais de um valor");
		Map<Consumidor, List<Produto>> map2 = new HashMap<>();
		List<Produto> listaProduto1 = new ArrayList<>(); 
		List<Produto> listaProduto2 = new ArrayList<Produto>();
		listaProduto1.add(produto1);
		listaProduto1.add(produto2);
		listaProduto2.add(produto3);
		listaProduto2.add(produto4);
		map2.put(consumidor1, listaProduto1);
		map2.put(consumidor2, listaProduto2);
		for(Map.Entry<Consumidor, List<Produto>> entry2: map2.entrySet()) {
			System.out.println(entry2.getKey().getNome());
			for(Produto prod: entry2.getValue()) {
				System.out.println("*" + prod.getNome() + " [Preço: " + prod.getPreco() + "]");
			}
		}
		
	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Trabalhando com Map utilizando HashMap / LinkedHashMap (Parte 02)");
		System.out.println("------------------------------------------------------------------");
	}


}
