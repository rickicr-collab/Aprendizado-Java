package genericsupdated.service;

import java.util.List;

public class RentalService<T> {

	private List<T> objetosDisponiveis;

	public RentalService(List<T> objetosDisponiveis) {
		super();
		this.objetosDisponiveis = objetosDisponiveis;
	}

	public T ListaRentavelDisponivel() {
		System.out.println("Buscando objeto disponivel...." + objetosDisponiveis);
		T t = objetosDisponiveis.remove(0);
		System.out.println("Alugando objeto..." + t);
		System.out.println("Objetos disponiveis: " + objetosDisponiveis);
		return t;
	}

	public void retornarAluguelRentavel(T t) {
		System.out.println("Devolvendo Objeto Alugado: " + t);
		objetosDisponiveis.add(t);
		System.out.println("Objetos Disoniveis: " + objetosDisponiveis);

	}

}
