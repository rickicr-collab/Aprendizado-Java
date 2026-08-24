package genericsupdated.service;

import java.util.ArrayList;
import java.util.List;

import genericsupdated.classes.Barco;

public class BarcoRentavelService {
	
	private List<Barco> barcoLista = new ArrayList<>(List.of(new Barco("Jangada"), new Barco("Iate")));
	
	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco disponivel....");
		Barco barco = barcoLista.remove(0);
		System.out.println("Alugando Barco: " + barco);
		System.out.println("Barcos disponiveis: " + barcoLista);
		return barco;
	}
	
	public void retornarBarcoAlugado(Barco barco) {
		System.out.println("Devolvendo Barco: " + barco);
		barcoLista.add(barco);
		System.out.println("Barcos Disoniveis: " + barcoLista);
		
	}

}
