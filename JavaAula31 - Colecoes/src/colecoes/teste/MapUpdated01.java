package colecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapUpdated01 {
	public static void main(String[] args) {
		titulo();
		Map<Integer, String> colecaoMap = new HashMap<>();
		colecaoMap.put(1,"teclado");
		colecaoMap.put(2, "Mouse");
		colecaoMap.put(3, "Monitor");
		colecaoMap.put(4, "Estabilizador");
		colecaoMap.put(5, "Gabinete");
		colecaoMap.putIfAbsent(6, "Gabinete2");
		
		System.out.println("------ <<< Visualizando Um Map >>> --------");
		System.out.println("Lista Map : " + colecaoMap);
		
		System.out.println("------ <<< Visualização atravez de Interação >>> ------");
		for(Integer key: colecaoMap.keySet()) {
			System.out.println("Chave: " + key);
		}
		
		for(String value: colecaoMap.values()) {
			System.out.println("Values: " + value);
		}
		
		System.out.println("------ <<< Visualização atravez de Iteração >>> ------");
		System.out.println("Pegando o valor atravez da chave");
		
		for(Integer key: colecaoMap.keySet()) {
			System.out.println("[Chave]: " + key +  " / " + "[Valor]: " +  colecaoMap.get(key));
		}
		
		System.out.println("------- <<< Visualização atravez da Iteração >>> -----");
		System.out.println("Pegando todos os valores utilizando lambda");
		colecaoMap.forEach((chave, valor) -> System.out.println("[Chave: " + chave + " / " + "Valor: " + valor + "]"));
		
		
		
		/* Obs: como o Map não permiti valores diferentes com a mesma chave ele sobreescreve o primeiro valor com o novo 
		mas o método putItAbsent() - permiti modificar o valor se não existir uma chave igual existente.*/
		
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("       <<< Coleçao MAP >>>          ");
		System.out.println("------------------------------------");
	}

}
