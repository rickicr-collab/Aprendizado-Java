package expressoesregularesatualizado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher01 {
	public static void main(String[] args) {
		titulo();
		String regex = "ab";
		String texto = "abaababab";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto : " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("regex:  " + regex);
		System.out.println("Posições encontradas: ");
		while(matcher.find()) {
			System.out.print(matcher.start() + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		String texto2 = "abaabaa";
		Pattern pattern2 = Pattern.compile(regex);
		Matcher matcher2 = pattern2.matcher(texto2);
		System.out.println("Texto : " + texto2);
		System.out.println("Indice: 0123456789");
		System.out.println("Regex:  " + regex);
		System.out.println("Posições encontradas: ");
		while(matcher2.find()) {
			System.out.print(matcher2.start() + " ");
		}
		
	}
	
	public static void titulo() {
		System.out.println("---------------------------------");
		System.out.println("       Expressões Regulares      ");
		System.out.println("---------------------------------");
	}

}
