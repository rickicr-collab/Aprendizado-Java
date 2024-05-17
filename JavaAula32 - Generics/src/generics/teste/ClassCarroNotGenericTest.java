package generics.teste;

import java.util.ArrayList;
import java.util.List;

import generics.classes.Carro;

public class ClassCarroNotGenericTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<< Exemplo 01 - Retirando item da Lista >>>");
		CarroAlugavel carroAlugavel = new CarroAlugavel();
		Carro carroAlugado = carroAlugavel.getCarroDisponivel();
		System.out.println("--------------------------------------------------------------");
		System.out.println("<<< Exemplo 02 - Devolvendo item da Lista >>>");
		carroAlugavel.devolverCarro(carroAlugado);
		
		
	}
		
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("         Trabalhando com Classes Não Genericas                    ");
		System.out.println("--------------------------------------------------------------");
	}

}

class CarroAlugavel{
	private List<Carro> carrosDisponiveis = new ArrayList<>();
	
	{
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("Corolla"));
		carrosDisponiveis.add(new Carro("Bmw"));
	}
	
	//MÉTODO ALUGAR
	public Carro getCarroDisponivel() {
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Carro Alugado: " + c);
		for(Carro car: carrosDisponiveis) {
			System.out.println("Carros Disponveis: " + car.getNome());
		}
		System.out.println("Utilizando o Carro por 1 Mês");
		return  c;
	}
	
	public void devolverCarro(Carro c) {
		System.out.println("Devolvendo carro Alugado: " + c);
		carrosDisponiveis.add(c);
		for(Carro car: carrosDisponiveis) {
			System.out.println("Carros Disponiveis: " + car.getNome());
		}
	}
	
}
