package expressoesregulares.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpressoesregularesTest {

	public static void main(String[] args) {
		
		String regex = "0[xX][0-9a-fA-F]";
	    String texto = "12 0x 0x 0xFFAB 0x10G 0x1";
		String regex1 = "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto1 = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.br, teste@mail.com.br";
		String regex2 = "\\d{2}/\\d{2}/\\d{2,4}";
		String texto2 = "05/10/2010 05/05/2015 1/1/01 01/05/95";
		String regex3 = "proj([^,])+";
		String texto3 = "proj1.pkp, proj1.java, proj1.class, proj1final.java, proj2.pkp, proj3.java, diagrama, texto, foto";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(texto1);
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(texto2);
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(texto3);
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("<<<<< Exemplo 01 - TEXTO STRING >>>>>");
		System.out.println("texto:  " + texto);
		System.out.println("texto - tamanho: " + texto.length());
		System.out.println("Expressão - Buscada: " + matcher.pattern());
		System.out.println("Posições encontradas: ");
		while(matcher.find()) {
			System.out.println("[Posição: " + matcher.start() + " " + "Valor Encontrado: " + matcher.group() + "]");
		}
		System.out.println("-----------------------------------------------");
		System.out.println("<<<<< Exemplo 02 - EXPRESSÕES EMAIL >>>>> ");
		System.out.println("texto:  " + texto1);
		System.out.println("texto - tamanho: " + texto1.length());
		System.out.println("Expressão - Buscada: " + matcher1.pattern());
		System.out.println("Posições encontradas: ");
		
		while(matcher1.find()) {
			System.out.println("Posição: " + matcher1.start() + " " + "Valor encontrado: " + matcher1.group());
		}
		System.out.println("<<<< Utilizando o método matchs >>>>");
		System.out.println("Email Válido: " + "#@!abrao@mail.br".matches(regex1));
		
		System.out.println("------------------------------------------------");
		System.out.println("<<<< exemplo 03 - DATA >>>> ");
		System.out.println("texto:  " + texto2);
		System.out.println("texto - tamanho: " + texto2.length());
		System.out.println("Expressão - Buscada: " + matcher2.pattern());
		System.out.println("Posições encontradas: ");
		while(matcher2.find()) {
			System.out.println("Posição: " + matcher2.start() + " " + "Valor encontrado: " + matcher2.group());
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("<<<<< Trabalhando com a negação de Expressões Regulares >>>>> ");
		System.out.println("texto:  " + texto3);
		System.out.println("texto - tamanho: " + texto3.length());
		System.out.println("Expressão - Buscada: " + matcher3.pattern());
		System.out.println("Posições encontradas: ");
		while(matcher3.find()) {
			System.out.println("Posição: " + matcher3.start() + " " + "Valor encontrado: " + matcher3.group());
		}
		
		
		
	}

}
