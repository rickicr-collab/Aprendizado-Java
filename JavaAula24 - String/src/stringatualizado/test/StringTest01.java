package stringatualizado.test;

public class StringTest01 {
    public static void main(String[] args) {
	tituloGerador();
	String nome = "Ricardo";
	String nome2 = "Ricardo";
	
	String nomeComplemento = " Cunha";
	nome = nome.concat(nomeComplemento);
	System.out.println("String realizando a concatenação: " + nome);
	System.out.println("Comparado Strings usando métodos equals: " + nome.equals(nome2));
	
	System.out.println("-------------------------------------");
	String nome3 = new String("Ricardo");
	System.out.println("Comparando Strings com objetos: " + (nome2 == nome3));
	System.out.println("Comparando String com Objetos com o valor original do pool de Strings: " + (nome2 == nome3.intern()));
	System.out.println("Pegando valor original do pool das Strings: " + nome3.intern());
	
    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------------------------");
	System.out.println("               Introdução com Strings                  ");
	System.out.println("-------------------------------------------------------");
    }

}
