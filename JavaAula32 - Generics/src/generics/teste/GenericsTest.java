package generics.teste;

import java.util.ArrayList;
import java.util.List;


public class GenericsTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<<< Exemplo com java versão 1.4 >>>> ");
		List<String> lista = new ArrayList<String>();
		lista.add("Ricardo");
		lista.add("Marcela");
		lista.add("[Curso DevDojo]");
		
		
		for(String obj: lista) { // INSTANCIANDO OS OBEJTOS VARIADOS DENTRO DA LISTA
			System.out.println("Lista: " + obj);
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.println("<<< Utilizando métodos e gerando uma exceção adicionando tipos diferentes >>>");
		add(lista, 1500L);
		for(String str: lista) {
			System.out.println("Lista: " + str);
		}
		
		

	}
	
	
	private static void add(List lista, Long l) {
		lista.add(l);
	}
	
	private static void tituloGerador() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("               Introdução a Generics ");
		System.out.println("---------------------------------------------------------------");
	}

}
