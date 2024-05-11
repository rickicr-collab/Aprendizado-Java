package colecoes.teste;

import java.util.Map;
import colecoes.classe.Consumidor;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<<< Exemplo 01 - (Classe Wrapper String) >>>>");
		NavigableMap<String , String> map = new TreeMap<>();
		map.put("A", "Letra A");
		map.put("B", "Letra B");
		map.put("C", "Letra C");
		map.put("D", "Letra D");
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("[Chaves: " + entry.getKey() + " " + "/ Valores: " + entry.getValue() + "]");
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Métodos Uteis (HesdMap): " + map.headMap("D", true));
		System.out.println("Métodos uteis (Higher): " + map.higherKey("C"));
		System.out.println("Métodos uteis (Descending): " + map.descendingMap());
		
		System.out.println("----------------------------------------------------");
		System.out.println("<<<< Exemplo - 02 (Usando Class Wrapper Integer) >>>>");
		Consumidor consumidor1 = new Consumidor("Ricardo Rosendo", "05113");
		Consumidor consumidor2 = new Consumidor("DevDojo", "321");
		NavigableMap<Integer, Consumidor> map2 = new TreeMap<>();
		map2.put(01, consumidor1);
		map2.put(02, consumidor2);
		for(Map.Entry<Integer,Consumidor> entry2: map2.entrySet()) {
			System.out.println("[Chaves: " + entry2.getKey() + " " + "/ Valores: " + entry2.getValue() + "]");
		}
		
		

	}
	
	private static void tituloGerador() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Trabalhando com Coleções utilizando NavigableMap / TreeMap");
		System.out.println("------------------------------------------------------------------");
	}

}
