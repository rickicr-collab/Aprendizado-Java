package generics.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
	public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {
	
	public void consulta() {
		System.out.println("Consultando Cachorro!!! ");
	}

	
	public int compareTo(Object o) {
		return 0;
	}
	
}

class Gato extends Animal{
	public void consulta() {
		System.out.println("Consultando Gato!!!!");
	}
}


public class WildCardTest {
	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<<< Exemplo 01 -  com Arrays de Classes externas");
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
		consultarAnimais(gatos);
		consultarAnimais(cachorros);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("<<<< Exemplo 02 - Trabalhando com Lista / adicionado itens  >>>>");
		List<Cachorro> listaCachorros = new ArrayList<>();
		List<Gato> listaGatos = new ArrayList<>();
		List<Animal> listaAnimais = new ArrayList<>();
		listaCachorros.add(new Cachorro());
		listaGatos.add(new Gato());
		consultarAnimaisLista(listaAnimais);
		
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("<<<< Exemplo 03 - Trabalhando com Caractere Coringa / não adicionando itens");
		consultarAnimaisLista2(listaCachorros);
		consultarAnimaisLista2(listaGatos);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("<<<< Exemplo 04 - trabalhando com Caracter coringa / adicionando itens e ordenando ");
		consultarAnimaisLista2(listaCachorros);
		ordenarLista(listaCachorros);
		
		
	}
	
	public static void consultarAnimais(Animal [] animais) {
		for(Animal animal: animais) {
			animal.consulta();
		}
		
	}
	
	public static void consultarAnimaisLista(List<Animal> animais) {
		for(Animal animal: animais) {
			animal.consulta();
		}
		System.out.println("Cachorro: " + animais.add(new Cachorro()));
		System.out.println("Gato: " + animais.add(new Gato()));
		System.out.println("Objetos adicionados com sucesso!!!");
	}
	
	public static void consultarAnimaisLista2(List<? extends Animal> animais) {
		for(Animal animal: animais) {
			animal.consulta();
		}
	}
	
	public static void consultarCachorros(List<? super Cachorro> listaCachorros) {
		Cachorro c1 = new Cachorro();
		Object c2 = new Cachorro();
		Animal c = new Cachorro();
		listaCachorros.add(new Cachorro());
		
	}
	
	public static void ordenarLista(List<? extends Comparable> lista) {
		Collections.sort(lista);
	}
	

	private static void tituloGerador() {
		System.out.println("--------------------------------------------------------");
		System.out.println("        Generics - Wildcard caractere coringa");
		System.out.println("--------------------------------------------------------");
	}
}
