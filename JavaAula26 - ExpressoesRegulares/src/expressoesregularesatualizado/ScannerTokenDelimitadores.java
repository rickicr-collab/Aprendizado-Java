package expressoesregularesatualizado;

import java.util.Scanner;

public class ScannerTokenDelimitadores {
	public static void main(String[] args) {
		titulo();
		System.out.println("############ Exemplo 01 ##################");
		String texto = "Levi, Eren, Mikasa,true,200";
		String[] nomes = texto.split(",");
		for (String nome : nomes) {
			System.out.println("[" + nome.trim() + "]");
		}

		System.out.println("############# Exemplo 02 #################");
		Scanner scanner = new Scanner(texto);
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				System.out.println("[" + "Int: " + i + "]");
			} else if (scanner.hasNextBoolean()) {
				boolean b = scanner.nextBoolean();
				System.out.println("[" + "Boolean: " + b + "]");
			} else {
				System.out.println("[" + scanner.next().trim() + "]");
			}

		}

	}

	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("          Expressões Regulares           ");
		System.out.println("-----------------------------------------");
	}
}
