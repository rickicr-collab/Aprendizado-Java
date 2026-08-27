package lambdas.teste;

import java.util.List;
import java.util.function.Consumer;


public class LambdaTest01 {
	public static void main(String[] args) {
		titulo();
		List<String> nomes = List.of("Ricardo", "Rafael","Camila", "Priscila");
		List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
		printList(nomes, nome -> System.out.print("[ " + nome.toLowerCase()  + " ]"));
		printList(numeros, num -> System.out.println(num));
	
	}
	public static <T> void printList(List<T> list, Consumer<T> consumer){
		for (T e : list) {
			consumer.accept(e);
		}
	}
	public static void titulo() {
		System.out.println("----------------------------------------");
		System.out.println("     <<<< Lambdas / Consummer >>>>      ");
		System.out.println("----------------------------------------");
	}

}
