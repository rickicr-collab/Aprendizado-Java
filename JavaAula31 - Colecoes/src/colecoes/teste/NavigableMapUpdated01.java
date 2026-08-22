package colecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import colecoes.classe.Leitor;

public class NavigableMapUpdated01 {
	public static void main(String[] args) {
		titulo();
		NavigableMap<String, Leitor> map = new TreeMap<>();
		Leitor leitor1 = new Leitor("Ricardo");
		Leitor leitor2 = new Leitor("Priscila");
		Leitor leitor3 = new Leitor("Marcelo");
		Leitor leitor4 = new Leitor("Bruno");
		map.put("A", leitor1);
		map.put("B", leitor2);
		map.put("C", leitor3);
		map.put("D", leitor4);
		

		
		System.out.println("------------------- <<< Visualizando o NavigableMap >>> ----------------------");
		for(Map.Entry<String, Leitor> entry: map.entrySet()) {
			System.out.println("[" + entry.getKey() + " - " + entry.getValue() + " ]");
		}
		
		System.out.println("--------------- Metodos NavigableMap---------------------");
		System.out.println("Metodo headMap: " + map.headMap("D")); // mostra os valores existentes antes de D.
		System.out.println("Metodo lowerKey: " + map.lowerKey("B"));// mostra os chaves masi baixa proxima da declarada.
		System.out.println("Metodo floorKey: " + map.floorKey("C"));
		System.out.println("Metodo ceilingkey: " + map.ceilingKey("D"));
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------------------");
		System.out.println("       <<< Collections -  NavigableMap >>>          ");
		System.out.println("-----------------------------------------------------");
	}

}
