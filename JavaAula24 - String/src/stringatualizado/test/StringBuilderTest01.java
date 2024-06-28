package stringatualizado.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
	tituloGerador();
	String nome = "Ricardo";
	nome = nome.concat(" Cunha");
	System.out.println("Nome realizando concatenação: " + nome);

	System.out.println("---------------------");
	StringBuilder sb = new StringBuilder(nome);
	sb.append(" Rosendo");
	sb.reverse();
	sb.reverse();
	System.out.println("String Builder: " + sb);

    }

    public static void tituloGerador() {
	System.out.println("----------------------------------------------------");
	System.out.println("        Aprendendo sobre String Builder             ");
	System.out.println("----------------------------------------------------");
    }

}
