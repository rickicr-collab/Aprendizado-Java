package stringatualizado.test;

public class StringTest02 {
    public static void main(String[] args) {
	tituloGerador();
	
	String nome = "   Ricardo     ";
	String numeros = "012345";
	System.out.println("Retornando um char/caractere baseado no indice: " + nome.charAt(1));
	System.out.println("Retornando o tamanho da String dentro do pool da String: " + nome.length());
	System.out.println("Retornando a troca de caracteres por novos caracteres dentro da string: " + nome.replace("c", "m"));
	System.out.println("Retornando a String com caracteres em Maiusculo: " + nome.toUpperCase());
	System.out.println("Retornando a String com caracteres em minusculos: " + nome.toLowerCase());
	System.out.println("------ trabalhando com SubStrigns -------");
	System.out.println("Retornando valores com intervalos de inicio e fim: " + numeros.substring(1));
	System.out.println("Retornando a String retirando os valores em brancos existentes tanto antes como depois: " + nome.trim());
	
	
	
    }
    
    public static void tituloGerador() {
   	System.out.println("-------------------------------------------------------");
   	System.out.println("               Metodos usandos  com Strings            ");
   	System.out.println("-------------------------------------------------------");
       }


}
