package runtimeexceptions.teste;

import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
	tituloGerador();
	try {
	    throw new RuntimeException();
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("Dentro do ArrayIndexOutOfBoundException");
	} catch (IndexOutOfBoundsException e) {
	    System.out.println("Dentro do IndexOutOfBoundException");
	} catch (IllegalArgumentException e) {
	    System.out.println("Dentro do IllegalArgumentException");
	} catch (RuntimeException e) {
	    System.out.println("Dentro do RuntimeException");
	}
	
	

	try {
	    talvezLanceException();
	} catch (FileAlreadyExistsException | SQLException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e = new RuntimeException();
	    e.printStackTrace();
	}

    }

    public static void tituloGerador() {
	System.out.println("---------------------------------------------");
	System.out.println("        Exceptions - Multiplas exceções      ");
	System.out.println("---------------------------------------------");
    }

    private static void talvezLanceException() throws SQLException, FileAlreadyExistsException {
	System.out.println("Dentro do Talvez Lance Exception");

    }

}
