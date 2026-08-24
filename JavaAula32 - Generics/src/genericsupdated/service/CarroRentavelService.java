package genericsupdated.service;

import java.util.ArrayList;
import java.util.List;

import genericsupdated.classes.Carro;

public class CarroRentavelService {
	
	private List<Carro> listaCarros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Ferrari")));
	
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro disponivel....");
		Carro carro = listaCarros.remove(0);
		System.out.println("Alugando carro: " + carro);
		System.out.println("Carro disponiveis: " + listaCarros);
		return carro;
	}
	
	public void retornarCarroAlugado(Carro carro) {
		System.out.println("Devolvendo Carro: " + carro);
		listaCarros.add(carro);
		System.out.println("Carros Disoniveis: " + listaCarros);
		
	}

}
