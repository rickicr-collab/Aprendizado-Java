package optional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
	public static void main(String[] args) {
		titulo();
		Optional<String> nome = findName("Willian");
		
		Optional<String> o1 = Optional.of("Aha Uhu o DevDojo é nosso!");
		Optional<String> o2 = Optional.ofNullable(null);
		Optional<String> o4 = Optional.empty();
		Optional<String> o3 = findName("Ricardo");
		Optional<String> o5 = (findName("DevDojo"));
		String empty = o5.orElse("empty");
		
		System.out.println("Optional comun: " + o1);
		System.out.println("Optional com valor nulo: " + o2);
		System.out.println("Optional do método criado: " + o3);
		System.out.println("Optional vazil/Empty: " + o4);
		System.out.println("Utilizando a função orElse() : " + empty);
		System.out.println("Confirmando o uso do Optional com metodo corrigido: " + nome);
		
		
		
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------");
		System.out.println("       <<<   Optional  >>>         ");
		System.out.println("-----------------------------------");
	}
	
	private static Optional<String> findName(String name) {
		List<String> nomes = List.of("Ricardo","DevDojo", "Willian");
		int i = nomes.indexOf(name);
		if(i != -1) {
			return Optional.of(nomes.get(i));
		}
		return Optional.empty();
	}

}
