package expressoesregularesatualizado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher05 {
	public static void main(String[] args) {
		titulo();
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto = "takamyia@hotmail.com, jotaru@gmail.com, #@!zoro@mail.br, teste@gmail.com sakura@mail, teste@gmail.com.br ";
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
		System.out.println("Email válido: " + "#@!zoro@mail.br".matches(regex));
		System.out.println(texto.split(",")[0].trim());
	}
	
	
	

	public static void titulo() {
		System.out.println("---------------------------------");
		System.out.println("       Expressões Regulares      ");
		System.out.println("---------------------------------");
	}
}
