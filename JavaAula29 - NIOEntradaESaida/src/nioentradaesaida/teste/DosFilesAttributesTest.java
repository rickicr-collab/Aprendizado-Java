package nioentradaesaida.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/*
 * COMENTÁRIOS SOBRE A INTERFACE DOSFILEATTRIBUTES:
 * 
 * OBS: NO PARAMENTRO DE STRING ATTRIBUTES DA FUNÇÃO SETATTRIBUTES DA CLASSE FILES 
 * DEVIDO AO JAVA SER CAMEL CASE E CASE SENSITIVE OS PARAMENTROS DENTRO SSTRRING 
 * DEVEM SER TODOS MINUSCULOS CASO SERA INSERIDO UM CARACTERE EM MAIUSCULO O JAVA 
 * IRÁ IGNORA-LO EM SUA EXECUÇÃO E IRÁ E PODE OCASIONAR UM ERRO DE EXECUÇÃO.
 * 
 * OBS1: USANDO A INTERFACE DOSFILEATTRIBUTESVIEW É POSSIVEL UTILIZANDO UM MÉTODO SET 
 * PARA CADA ATRIBUTO QUE SE DESEJA VERIFICAR INFORMAÇÕES DE FOMAR MAIS PRÁTICA 
 * 
 * 
 */

public class DosFilesAttributesTest {

	public static void main(String[] args) {
		System.out.println("<<<<< Trabalhando com a interface DOSFILES ATTRIBUTEs >>>>> ");
		System.out.println("Exemplo 01");
		Path path = Paths.get("C:\\Users\\Ricardo\\eclipse-workspace\\JavaAula29 - NIOEntradaESaida\\arquivo\\teste.txt");
		try {
			Files.createFile(path);
			Files.setAttribute(path,"dos:hidden" , true);
			Files.setAttribute(path,"dos:readonly" , true);
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println("Este é um arquivo oculto: " + dos.isHidden());
			System.out.println("Este é um arquivo: " + dos.isArchive());
			System.out.println("Este é um arquivo de leitura: " + dos.isReadOnly());
			System.out.println("Este é um arquivo regular: " + dos.isRegularFile());
			DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
			dosView.setHidden(false);
			dosView.setReadOnly(false);
			System.out.println("Exemplo 02");
			dos = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println("Este é um arquivo oculto: " + dos.isHidden());
			System.out.println("Este é um arquivo: " + dos.isArchive());
			System.out.println("Este é um arquivo de leitura: " + dos.isReadOnly());
			System.out.println("Este é um arquivo regular: " + dos.isRegularFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
