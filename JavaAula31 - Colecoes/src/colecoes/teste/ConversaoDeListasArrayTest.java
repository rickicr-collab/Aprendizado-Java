package colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArrayTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exemplo 01");
		List <Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		Integer[] numerosArray = new Integer[numeros.size()];
		numeros.toArray(numerosArray);
		System.out.println("Imprimindo valores");
		System.out.println("Lista: " + numeros);
		System.out.println("Array: " + Arrays.toString(numerosArray));
		
		System.out.println("------------------------------------------------------");
		System.out.println("Exemplo 02");
		Integer[] numerosArray2 = new Integer[4];
		numerosArray2[0] = 10;
		numerosArray2[1] = 9;
		numerosArray2[2] = 8;
		numerosArray2[3] = 7;
		List <Integer> numeros2 = Arrays.asList(numerosArray2);
		List < Integer> numeros3 = new ArrayList<>();
		numeros3.addAll(Arrays.asList(numerosArray2));
		numeros2.set(0, 1);
		numeros3.add(25);
		numeros3.sort(null);
		System.out.println("Imprimindo Valores");
		System.out.println("Array original: " + Arrays.toString(numerosArray2));
		System.out.println("Lista Convertida: " + numeros2);
		System.out.println("Array incremental para adicionar valores: " + numeros3);
	}
	
	
	
	private static void tituloGerador() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("      Convertendo Listas em Arrays e vice - versa");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
