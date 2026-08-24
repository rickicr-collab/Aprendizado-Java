package genericsupdated.teste;

import java.util.ArrayList;
import java.util.List;

import genericsupdated.classes.Barco;

public class MethodsGenericTest01 {
	public static void main(String[] args) {
		titulo();
		criarArrayComObjeto(new Barco("Iate"));
		
		
	}
	
	private static <T> void criarArrayComObjeto(T t) {
		List<T> list = new ArrayList<>();
		list.add(t);
		System.out.println(list);
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("   <<< Generics / Methods >>>");
		System.out.println("------------------------------------");
	}

}

