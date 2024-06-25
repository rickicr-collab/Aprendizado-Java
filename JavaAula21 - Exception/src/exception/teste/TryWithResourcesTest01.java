package exception.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import checkedexception.classes.Leitor1;
import checkedexception.classes.Leitor2;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {
	lerArquivo();
	lerArquivo2();

    }

    public static void lerArquivo() {
	System.out.println("-----------------------------------------------------------");
	System.out.println("Forma mais eficiente usando o método try - with - resource ");
	System.out.println("-----------------------------------------------------------");
	try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

	} catch (IOException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    public static void lerArquivo2() {
	System.out.println("------------------------------------");
	System.out.println("Forma mais basica do método try");
	System.out.println("------------------------------------");
	Reader reader = null;
	try {
	    reader = new FileReader(new File("C:\\Users\\Ricardo\\git\\Aprendizado-Java\\JavaAula21 - Exception\\src\\arquivo\\texto.txt"));
	    System.out.println("Arquivo aberto !!! ");
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} finally {
	    try {
		if (reader != null) {
		    reader.close();
		}
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
    }

}
