package generics.teste;

import java.util.ArrayList;
import java.util.List;

import generics.classes.Carro;

public class MethodsGenericsTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Método generico criando um array - sem Retorno");
		criarArray(new Carro("Corolla"));
		System.out.println("----------------------------------------------");
		System.out.println("Método criando um Array - Retorno com uma Lista");
		List<Carro> carroList = criarArrayRetorno(new Carro("Maseratti"));
		carroList.add(new Carro("Palio"));
		carroList.add(new Carro("Honda Civic"));
		for(Carro list: carroList) {
			System.out.println("Carros: " + list.getNome());
		}

	}
	
	private static void tituloGerador() {
		System.out.println("-------------------------------------------------");
		System.out.println("       Trabalhando com Métodos Genericos          ");
		System.out.println("-------------------------------------------------");
	}
	public static <T> void criarArray(T t) {
		System.out.println("<<<< Metodo Generico - Criar Array >>>>");
		List<T> lista = new ArrayList<>();
		lista.add(t);
		System.out.println("Itens: " + t);
	}
	
	public static <T> List<T> criarArrayRetorno(T t){
		System.out.println("<<<< Método Generico - Criar Array / Retorno List >>>>");
		List<T> lista = new ArrayList<>();
		lista.add(t);
		return lista;
	}
	
	
	
	
	

}
