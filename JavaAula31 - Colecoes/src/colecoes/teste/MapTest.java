package colecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exemplo - 01 Trabalhando com HashMap");
		Map<String,String> map = new HashMap<>();
		map.put("Teklado","Teclado");
		map.put("Mouze", "Mouse");
		map.put("Vc", "Voce");
		map.put("Vc", "Voce2");
		map.put("Meza", "Mesa");
		for(String key: map.values()) {
			System.out.println("Valores: " + key);
		}
		System.out.println("------------------------------------------------");
		System.out.println("<<<Trabalhando com ambos valores usando função Map.Entry>>>");
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("[Chaves: " + entry.getKey() + " " +"/ Valores: " +  entry.getValue() + "]");
			
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Exemplo - 02 Trabalhando com LinkedHashMap");
		Map<String,String> map2 = new LinkedHashMap<>();
		map2.put("Teklado","Teclado");
		map2.put("Mouze", "Mouse");
		map2.put("Vc", "Voce");
		map2.put("Vc", "Voce2");
		map2.put("Meza", "Mesa");
		for(Map.Entry<String, String> entry2: map2.entrySet()) {
			System.out.println("[Chaves: " + entry2.getKey() + " " + "/ Valores: " + entry2.getValue() + "]");
		}
		
		

	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Trabalhando com Map utilizando HashMap / LinkedHashMap (Parte 01)");
		System.out.println("-----------------------------------------------------------------");
	}

}
