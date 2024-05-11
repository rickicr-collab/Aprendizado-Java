package colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import colecoes.classe.Celular;

public class ListCelularTest {
	

	public static void main(String[] args) {
		tituloApresentador();
		Celular celular = new Celular("Xiaomi", "123456");
		Celular celular2 = new Celular("Iphone 6s", "981821");
		Celular celular3 = new Celular("Sony Xperia", "019212");
		Celular celular4 = new Celular("Samsung Galaxy S9", "123456");
		Celular celular5 = new Celular("Samsung Galaxy S7", "1234567");
		List <Celular> celularList = new ArrayList<>();
		
		celularList.add(celular);
		celularList.add(celular2);
		celularList.add(celular3);
		celularList.add(celular4);
		celularList.add(celular5);
		for(Celular cel: celularList) {
			System.out.println(cel);
		}
		System.out.println("----------------------------------------");
		System.out.println("Métodos de busca em ArrayList de Objetos");		
		System.out.println("Os IMEIS são iguais? " + celular4.equals(celular5));
		System.out.println("O celular existe na lista? "+ celularList.contains(celular4));
		
	}
	
	private static void tituloApresentador() {
		System.out.println("<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>");
		System.out.println("Trabalhando com ArrayList de Objetos ");
		System.out.println("<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>");
		System.out.println("----------------------------------------");
	}

}
