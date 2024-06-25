package exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
	criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
	try {
	    File arquivo = new File(
		    "C:\\Users\\Ricardo\\git\\Aprendizado-Java\\JavaAula21 - Exception\\src\\arquivo\\texto.txt");
	    boolean isCriado = arquivo.createNewFile();
	    System.out.println("Arquivo Criado? " + isCriado);
	} catch (IOException e) {
	    e.printStackTrace();
	    throw e;
	}

    }

}
