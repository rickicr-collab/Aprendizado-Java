package Variaveis.atualizado;

public class TiposPrimitivos {
	public static void main (String[] args) {
		tituloGerador();
		int age = 10;
		double salarioDouble = 2000;
		float salarioFloat = 2500.50f;
		byte idadeByte = 10;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = 87;
		char caractereUnicode = '\u0048';
		long  numeroGrande = 100000;
		
				
		System.out.println("Idade: " + age);
		System.out.println("Salario double: " + salarioDouble);
		System.out.println("Salario Float: " + salarioFloat);
		System.out.println("Idade Byte: " + idadeByte);
		System.out.println("Idade short: " + idadeShort);
		System.out.println("Boolean verdadeiro: " + verdadeiro);
		System.out.println("Boolean falso: " + falso);
		System.out.println("Caractere char: " + caractere);
		System.out.println("Numero Long: " + numeroGrande);
		System.out.println("Caractere Uniccode: " + caractereUnicode);
	
		System.out.println("-------------------------------------");
		System.out.println("<<<< Classe String >>>>");
		String nome = "Ricardo Rosendo";
		System.out.println("Classe String: " + nome);
		
	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------------");
		System.out.println("             Trabalhanddo com variaveis                 ");
		System.out.println("--------------------------------------------------------");
		System.out.println("<<<<< Tipos Primitivos >>>>>");
	}

}
