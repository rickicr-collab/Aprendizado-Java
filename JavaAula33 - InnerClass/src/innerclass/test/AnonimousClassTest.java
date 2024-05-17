package innerclass.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import innerclass.classes.Carro;

class Animal{
	public void andar() {
		System.out.println("O Animal está Andando!");
	}
	
	public void correr() {
		System.out.println("O Animal está correndo!");
	}
}

public class AnonimousClassTest {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<< Exemplos de Classes Anonimas >>>");
		Animal a = new Animal() {
			public void andar() {
				System.out.println("Andando Anonimamente!");
			}
		};
		Animal b = new Animal() {
			public void correr() {
				System.out.println("Correndo Anonimamete!");
			}
		};
		a.andar();
		b.correr();
		List<Carro> carroList = new ArrayList<>();
		carroList.add(new Carro("BmW"));
		carroList.add(new Carro("Ferrari"));
		carroList.add(new Carro("Agira Coiniseg"));
		Collections.sort(carroList, new Comparator<Carro>() {
			@Override
			public int compare(Carro o1, Carro o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		System.out.println("Lista Ordenada: " + carroList);
		

	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------------------");
		System.out.println("    <<<< Trabalhando com Classes Anonimas >>>         ");
		System.out.println("------------------------------------------------------");
	}

}



