package colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		tituloApresentador();
		System.out.println("Lista - 01 (String)");
		List <String> nomes = new ArrayList<>();
		nomes.add("Ricardo Cunha");
		nomes.add("Priscila Silva");
		nomes.add("katerine Pierce");
		nomes.add("Elizabeth Swan");
		nomes.add(0,"Anna Vieira");
		Collections.sort(nomes);
		for(String n: nomes) {
			System.out.println("Nomes: " + n);
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Lista - 02 (Numerica)");
		List <Double> numeros = new ArrayList<Double>();
		numeros.add(2.5);
		numeros.add(3.9);
		numeros.add(5.2);
		numeros.add(5.7);
		numeros.add(1.4);
		numeros.add(12.5);
		
		Collections.sort(numeros);
		for(Double num: numeros) {
			System.out.println("NUmeros: " + num);
		}
		
		

	}
	
	private static void tituloApresentador() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Trabalhando com ArrayList de Objetos / Ordenando as listas ");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("------------------------------------------------------------");
	}

}
