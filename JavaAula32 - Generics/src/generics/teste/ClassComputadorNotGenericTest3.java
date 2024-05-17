package generics.teste;

import java.util.ArrayList;
import java.util.List;

import generics.classes.Computador;

public class ClassComputadorNotGenericTest3 {

	public static void main(String[] args) {
		System.out.println("------------------------------------------");
		System.out.println("    Trabalhando com Classes Não Genericas     ");
		System.out.println("------------------------------------------");
		System.out.println(" <<<<< Aluguel >>>>> ");
		ComputadorAlugavel compAlugavel = new ComputadorAlugavel();
		Computador compAlugado = compAlugavel.getComputadorAlugado();
		System.out.println("------------------------------------------");
		System.out.println(" <<<< Devolução >>>> ");
		compAlugavel.devoluçãoComputador(compAlugado);

	}

}

class ComputadorAlugavel{
	List<Computador> computadorDisponivel = new ArrayList<>();
	{
		computadorDisponivel.add(new Computador("Lenovo"));
		computadorDisponivel.add(new Computador("Dell"));
		computadorDisponivel.add(new Computador("MacBook"));
		
	}
	
	
	
	
	public Computador getComputadorAlugado() {
		Computador comp = computadorDisponivel.remove(0);
		System.out.println("Computador Alugado: " + comp);
		for(Computador c: computadorDisponivel) {
			System.out.println("Diponiveis: " + c.getNome());
		}
		System.out.println("Aluguel tempo 1 Mês");
		return comp;
	}
	
	public void devoluçãoComputador(Computador comp) {
		computadorDisponivel.add(comp);
		System.out.println("Computador Devolvido: " + comp);
		System.out.println("Devolução realizada com sucesso!");
		for(Computador c: computadorDisponivel) {
			System.out.println("Computadores Disponiveis: " + c.getNome());
		}
	}
	
	
}