package genericsupdated.teste;

import java.util.List;

public class WildCards02 {
	public static void main(String[] args) {
		titulo();
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato>  gatos = List.of(new Gato(), new Gato());
		List<Animal> animais = List.of(new Gato(), new Cachorro());
		
		imprimirConsulta(animais);
		
	}

	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("   <<< Generics / WildCards >>>");
		System.out.println("------------------------------------");
	}

	public static void imprimirConsulta(List<Animal> list) {

		for (Animal animais : list) {
			animais.consulta();
		}
	}

}
