package genericsupdated.teste;

import java.util.List;

public class WildCards03 {
	public static void main(String[] args) {
		titulo();
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		List<Animal> animais = List.of(new Gato(), new Cachorro());

		imprimirConsulta(cachorros);
		imprimirConsulta(gatos);
		imprimirConsultaEspecializada(animais);
	}

	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("   <<< Generics / WildCards >>>");
		System.out.println("------------------------------------");
	}

	public static void imprimirConsulta(List<? extends Animal> list) {
		for (Animal animais : list) {
			animais.consulta();
		}
	}

	public static void imprimirConsultaEspecializada(List<? super Animal> animal) {
		for (Object object : animal) {
			if(object instanceof Animal) {
				((Animal) object).consulta();
			}
		}
	}

}
