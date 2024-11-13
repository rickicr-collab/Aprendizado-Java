package expressoesregularesatualizado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher04 {
	public static void main(String[] args) {
		titulo();
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		String texto = "12 0x 0X 0xFFABC 0x109 0x1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto : " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("regex:  " + regex);
		System.out.println("Posições encontradas: ");
		while(matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
	}

	public static void titulo() {
		System.out.println("---------------------------------");
		System.out.println("       Expressões Regulares      ");
		System.out.println("---------------------------------");
	}
}
