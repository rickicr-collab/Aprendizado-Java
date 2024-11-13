package expressoesregularesatualizado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher03 {
	public static void main(String[] args) {
		titulo();
		String regex = "[aA-cB]";
		String texto = "cafeBABE";
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
		
		String regex2 = "0[xX][0-9a-fA-F]";
		String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(texto2);
		System.out.println("Texto : " + texto2);
		System.out.println("Indice: 0123456789");
		System.out.println("regex:  " + regex2);
		System.out.println("Posições encontradas: ");
		while(matcher2.find()) {
			System.out.print(matcher2.start() + " " + matcher2.group() + "\n");
		}
		
	}
	
	public static void titulo() {
		System.out.println("---------------------------------");
		System.out.println("       Expressões Regulares      ");
		System.out.println("---------------------------------");
	}

}
