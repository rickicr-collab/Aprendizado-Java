package colecoes.colecoesatualizado.list;

import java.util.ArrayList;
import java.util.List;

import colecoes.colecoesatualizado.hashcode.SmartPhone;

public class ClassList02 {
	public static void main(String[] args) {
		titulo();
		SmartPhone celular1 = new SmartPhone("14BAQ", "Samsung");
		SmartPhone celular2 = new SmartPhone("222222", "Pixel");
		SmartPhone celular3 = new SmartPhone("3333333", "Apple");
		SmartPhone celular4 = new SmartPhone("14B557", "ReadMin");
		SmartPhone celular5 = new SmartPhone("222225", "Pixel");
		SmartPhone celular6 = new SmartPhone("22335", "Pixel");

		System.out.println("<<< imprimindo A lista >>>");
		List<SmartPhone> smartPhone = new ArrayList<>();
		smartPhone.add(celular1);
		smartPhone.add(celular2);
		smartPhone.add(celular3);
		smartPhone.add(celular4);
		smartPhone.add(celular5);
		smartPhone.add(0, celular6);

		for (SmartPhone phone : smartPhone) {
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
