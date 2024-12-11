package colecoes.colecoesatualizado.listforArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListForArrayClass {
	public static void main(String[] args) {
		titulo();
		System.out.println("<<< Convertendo de Lista para Array >>>");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		Integer[] listToArray = numeros.toArray(new Integer[numeros.size()]);
		System.out.println("Lista convertida (Array): " + Arrays.toString(listToArray));
		System.out.println("------------------------------------------");
		System.out.println("<<< Convertendo de Array Para lista >>>");
		Integer[] arrayToList = new Integer[3];
		arrayToList[0] = 1;
		arrayToList[1] = 2;
		arrayToList[2] = 3;
		
		List<Integer> arrayAsList = Arrays.asList(arrayToList);
		arrayAsList.set(0, 12);
		System.out.println("Conversão com método (As.List): " + Arrays.toString(arrayToList));
		System.out.println("Lista convertida utilizando as.List: " + arrayAsList);
		
		System.out.println("~~~~~~~~~~~~~~~~~~");
		List<Integer> numerosList = new ArrayList<>(Arrays.asList(arrayToList));
		numerosList.add(15);
		System.out.println("Array convertido para lista ( utilizando Contruto de ArrayList com uma coleção): " + numerosList);
		
		System.out.println("~~~~~~~~~~~~~~~~~~");
		List<String> string = Arrays.asList("1", "2", "3");
		List<String> string2 = List.of("1", "2", "3", "4");
		System.out.println("Utilizando o Arrays.asList(String): " + string);
		System.out.println("Utilizando o List.of(String): " + string2);
		
		
		
	}
	
	private static void titulo() {
		System.out.println("----------------------------------------------------------");
		System.out.println("  Coleções -  Conversão de Lista / Array e Array / Lista  ");
		System.out.println("----------------------------------------------------------");
	}
}
