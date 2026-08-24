package genericsupdated.teste;

import genericsupdated.classes.Barco;
import genericsupdated.classes.Carro;
import genericsupdated.service.BarcoRentavelService;
import genericsupdated.service.CarroRentavelService;

public class GenericsTest02 {
	public static void main(String[] args) {
		titulo();
		
		CarroRentavelService carroRentavel = new CarroRentavelService();
		Carro carro = carroRentavel.buscarCarroDisponivel();
		System.out.println("Retornando o Carro depois do aluguel....");
		carroRentavel.retornarCarroAlugado(carro);
		
		System.out.println("---------------------------------------------------------");
		BarcoRentavelService barcoRentavel = new BarcoRentavelService();
		Barco barco = barcoRentavel.buscarBarcoDisponivel();
		System.out.println("Retornando o Barco depois do aluguel....");
		barcoRentavel.retornarBarcoAlugado(barco);
		
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("   <<< Generics / WildCards >>>");
		System.out.println("------------------------------------");
	}

}
