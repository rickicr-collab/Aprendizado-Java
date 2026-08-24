package genericsupdated.teste;

import java.util.ArrayList;
import java.util.List;

import genericsupdated.classes.Barco;
import genericsupdated.classes.Carro;
import genericsupdated.service.RentalService;

public class GenericsTest03 {
	public static void main(String[] args) {
		titulo();
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Ferrari")));
		List<Barco> barcoLista = new ArrayList<>(List.of(new Barco("Jangada"), new Barco("Iate")));
		RentalService<Carro> rService = new RentalService<>(carrosDisponiveis);
		Carro carroParaAlugar = rService.ListaRentavelDisponivel();
		rService.retornarAluguelRentavel(carroParaAlugar);
		
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("   <<< Generics / WildCards >>>");
		System.out.println("------------------------------------");
	}

}
