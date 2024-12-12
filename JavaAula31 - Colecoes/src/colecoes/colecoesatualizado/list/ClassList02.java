package colecoes.colecoesatualizado.list;

import java.util.ArrayList;
import java.util.List;

import colecoes.colecoesatualizado.hashcode.Smartphone;

public class ClassList02 {
	public static void main(String[] args) {
		titulo();
		Smartphone celular1 = new Smartphone("14BAQ", "Samsung");
		Smartphone celular2 = new Smartphone("222222", "Pixel");
		Smartphone celular3 = new Smartphone("3333333", "Apple");
		Smartphone celular4 = new Smartphone("14B557", "ReadMin");
		Smartphone celular5 = new Smartphone("222225", "Pixel");
		Smartphone celular6 = new Smartphone("22335", "Pixel");

		System.out.println("<<< imprimindo A lista >>>");
		List<Smartphone> smartPhone = new ArrayList<>();
		smartPhone.add(celular1);
		smartPhone.add(celular2);
		smartPhone.add(celular3);
		smartPhone.add(celular4);
		smartPhone.add(celular5);
		smartPhone.add(0, celular6);

		for (Smartphone phone : smartPhone) {
			System.out.println(phone);
		}

		System.out.println("-----------------------");
		System.out.println("Métodos Utilizaveis: ");
		System.out.println("Existe na lista(Método Contains): " + smartPhone.contains(celular5));
		int indexSmartPhone5 = smartPhone.indexOf(celular5);
		System.out.println("Indice do smartphone(indexOf): " + indexSmartPhone5);
	}

	public static void titulo() {
		System.out.println("--------------------------------------");
		System.out.println("          Coleções - List             ");
		System.out.println("--------------------------------------");
	}

}
