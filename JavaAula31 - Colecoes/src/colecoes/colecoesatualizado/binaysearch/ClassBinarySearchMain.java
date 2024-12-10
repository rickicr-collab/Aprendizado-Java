package colecoes.colecoesatualizado.binaysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ClassBinarySearchMain {
	public static void main(String[] args) {
		titulo();
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		System.out.println("Lista numeros: " + numeros);
		
		// retorno para numeros não existentes: (-(ponto de inserção)-1)
		Collections.sort(numeros);
		System.out.println("Lista Ordenada: " + numeros);
		System.out.println("Binary search: " + Collections.binarySearch(numeros, 1));
	}
	
	private static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("      Coleções - Binary Search      ");
		System.out.println("------------------------------------");
	}

}
