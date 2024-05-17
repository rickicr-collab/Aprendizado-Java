package generics.teste;


import java.util.ArrayList;
import java.util.List;

import generics.classes.Carro;
import generics.classes.Computador;


public class ClassGenericTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<< Exemplo 01 - Lista Carros >>> ");
		System.out.println("Aluguel");
		List<Carro> carrosDisponiveis = new ArrayList<>();
		carrosDisponiveis.add(new Carro("Ferrari"));
		carrosDisponiveis.add(new Carro("Bmw"));
		carrosDisponiveis.add(new Carro("Toyota"));
		
		ObjetosAlugaveis<Carro> carroAlugado = new ObjetosAlugaveis<>(carrosDisponiveis);
		Carro c = carroAlugado.getObjetoDisponivel();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Devolução");
		carroAlugado.devolucaoObjeto(c);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("<<< Exemplo 02 - Lista Computadores >>>");
		System.out.println("Aluguel");
		List<Computador> computadorDisponivel = new ArrayList<Computador>();
		computadorDisponivel.add(new Computador("Lenovo"));
		computadorDisponivel.add(new Computador("Dell"));
		computadorDisponivel.add(new Computador("Apple Macbok"));
		ObjetosAlugaveis<Computador> computadorAlugado = new ObjetosAlugaveis<Computador>(computadorDisponivel);
		Computador comp = computadorAlugado.getObjetoDisponivel();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Devolução");
		computadorAlugado.devolucaoObjeto(comp);

	}
	
	public static void tituloGerador() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("               Trabalhando com Classes Genericas                ");
		System.out.println("----------------------------------------------------------------");
	}

}






class ObjetosAlugaveis <T>{
	private List<T> objetosDisponiveis;
	public ObjetosAlugaveis(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
		
	}
	
	//MÉTODO ALUGAR
	public T getObjetoDisponivel() {
		T obj = objetosDisponiveis.remove(0);
		System.out.println("Objeto Alugado: " + obj);
		for(T o: objetosDisponiveis) {
			System.out.println("Objetos Disponveis: " + o);
		}
		System.out.println("Utilizando o Objeto por 1 Mês");
		return  obj;
	}
	// METODO DEVOLVER
	public void devolucaoObjeto(T o) {
		System.out.println("Devolvendo Objeto Alugado: " + o);
		objetosDisponiveis.add(o);
		System.out.println("Devolução realizada com sucesso!");
		for(T obj: objetosDisponiveis) {
			System.out.println("Objeto Disponiveis: " + obj);
		}
	}
}

class DoisAtributos<T, X>{
	T um;
	X dois;
	
	
	public DoisAtributos(T um, X dois) {
		this.um = um;
		this.dois = dois;
	}


	public T getUm() {
		return um;
	}


	public X getDois() {
		return dois;
	}


	public void setUm(T um) {
		this.um = um;
	}


	public void setDois(X dois) {
		this.dois = dois;
	}
	
	
	
}
