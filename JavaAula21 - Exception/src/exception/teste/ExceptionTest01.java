package exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {
	tituloGerador();
	criarNovoArquivo();

    }

    private static void tituloGerador() {
	System.out.println("---------------------------------------------");
	System.out.println("          Excptions - tipo Checked           ");
	System.out.println("---------------------------------------------");
    }

    public static void criarNovoArquivo() {
	File arquivo = new File("C:\\Users\\Ricardo\\git\\Aprendizado-Java\\JavaAula21 - Exception\\src\\arquivo\\texto.txt");
	try {
	    boolean isCriado = arquivo.createNewFile();
	    System.out.println("Arquivo Criado? " + isCriado);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
