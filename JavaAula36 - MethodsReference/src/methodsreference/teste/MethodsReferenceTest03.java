package methodsreference.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodsReferenceTest03 {
	public static void main(String[] args) {
		titulo();
		
		List<String> nomes = new ArrayList<>(List.of("Ricardo", "Priscila", "Bruno", "Marcela"));
		nomes.sort(String::compareTo);
		System.out.println(nomes);
		System.out.println("------------------------------");
		Function<String, Integer> numStringToInterger = Integer::parseInt;
		System.out.println("Resultado Utilizando Interface Funcion: " + numStringToInterger.apply("100"));
		System.out.println("------------------------------");
		
		BiPredicate<List<String>, String> searchName = List::contains;
		System.out.println("Resultado Utilizando Inteface BiPredicate: " + searchName.test(nomes, "Ricardo"));
		
	}
	
	public static void titulo() {
		System.out.println("--------------------------------------------------");
		System.out.println("<<< Methods Reference / Classe/non static >>>     ");
		System.out.println("--------------------------------------------------");
	}

}
