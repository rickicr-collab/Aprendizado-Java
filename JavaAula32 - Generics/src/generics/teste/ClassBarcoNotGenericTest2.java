package generics.teste;

import java.util.ArrayList;
import java.util.List;

import generics.classes.Barco;

public class ClassBarcoNotGenericTest2 {

	public static void main(String[] args) {
		System.out.println("------------------------------------------");
		System.out.println("    Trabalhando com Classes Não Genericas     ");
		System.out.println("------------------------------------------");
		System.out.println(" <<<<< Aluguel >>>>> ");
		BarcoAlugavel bAlugavel = new BarcoAlugavel();
		Barco bAlugado = bAlugavel.getBarcoAlugado();
		System.out.println("------------------------------------------");
		System.out.println(" <<<< Devolução >>>> ");
		bAlugavel.devolverBarco(bAlugado);
		

	}

}

class BarcoAlugavel{
	List<Barco> barcosDisponiveis = new ArrayList<>();
	{
		barcosDisponiveis.add(new Barco("Lancha"));
		barcosDisponiveis.add(new Barco("Canoa"));
		barcosDisponiveis.add(new Barco("Navio"));
	}
	
	
	public Barco getBarcoAlugado() {
		Barco b = barcosDisponiveis.remove(0);
		System.out.println("Barco Alugado" + b);
		for(Barco barco: barcosDisponiveis) {
			System.out.println("Barcos Disponiveis: " + barco.getNome());
		}
		System.out.println("Aluguel do Barco durante 1 Mês");
		return b;
	}
	
	public void devolverBarco(Barco b) {
		barcosDisponiveis.add(b);
		System.out.println("Barcos Devolvidos: " + b);
		for(Barco barco: barcosDisponiveis) {
			System.out.println("Barcos Disponiveis: " + barco.getNome());
		}
		System.out.println("Devolução realizada com sucesso!");
	}
}
