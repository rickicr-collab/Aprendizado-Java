package expressoesregularesatualizado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher02 {
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
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
		System.out.println("---------------------------------");
		String texto2 = "abaabaa";
		Pattern pattern2 = Pattern.compile(regex);
		Matcher matcher2 = pattern2.matcher(texto2);
		System.out.println("Texto : " + texto2);
		System.out.println("Indice: 0123456789");
		System.out.println("Regex:  " + regex);
		System.out.println("Posições encontradas: ");
		while(matcher2.find()) {
			System.out.print(matcher2.start() + " " + matcher2.group() + "\n");
		}

		System.out.println("---------------------------------");
		String regex3 = "\\d";
		String texto3 = "hsakhskba2bkdb2ukd2k";
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(texto3);
		System.out.println("Texto : " + texto3);
		System.out.println("Indice: 0123456789");
		System.out.println("regex:  " + regex3);
		System.out.println("Posições encontradas: ");
		while(matcher3.find()) {
			System.out.print(matcher3.start() + " " + matcher3.group() + "\n");
		}
		
	}
	
	public static void titulo() {
		System.out.println("---------------------------------");
		System.out.println("       Expressões Regulares      ");
		System.out.println("---------------------------------");
	}

}
