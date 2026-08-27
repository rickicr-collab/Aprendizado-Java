package lambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
	
	
	public static void main(String[] args) {
		titulo();
		
		List<String> nomes = List.of("Natsu", "Allucard");
		map(nomes, nome -> nome.toUpperCase());
		List<Integer> valor = map(nomes, nome -> nome.length());
		System.out.println(valor);
		
	}
	
	private static <T, R> List<R> map(List<T> list, Function<T, R>  function){
		List<R> result = new ArrayList<>();
		for (T e: list) {
			R r = function.apply(e);
			result.add(r);
		}
		System.out.println("Lista: " + result);
		return result;
	}
	
	
	public static void titulo() {
		System.out.println("----------------------------------------");
		System.out.println("     <<<< Lambdas / Function >>>>      ");
		System.out.println("----------------------------------------");
	}

}
