package genericsupdated.teste;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
	public static void main(String[] args) {
		titulo();
		List<String> lista = new ArrayList<>();
		lista.add("[Midoryia]");
		lista.add("[Hiei]");
		lista.add("[naruto]");

		
		for(String value: lista) {
			System.out.println(value);
		}
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("        <<< Generics >>>");
		System.out.println("------------------------------------");
	}

}
