package runtimeexceptions.teste;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
	tituloGerador();
	extracted();

    }

    private static void extracted() {
	try {
	    String erro = "Erro em tempo de execução!!!";
	    System.out.println("Abrindo o arquivo!");
	    System.out.println("Escrevendo no arquivo!");
	    throw new RuntimeException(erro);
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    System.out.println("fechando o recurso liberado pelo SO!");
	}
    }

    public static void tituloGerador() {
	System.out.println("---------------------------------------------");
	System.out.println("        Exceptions - Bloco Finally           ");
	System.out.println("---------------------------------------------");
    }

}
