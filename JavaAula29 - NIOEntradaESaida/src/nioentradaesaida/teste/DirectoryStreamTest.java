package nioentradaesaida.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * COMENTÁRIOS SOBRE INTERFACE DIRECTORYSTREAM:
 * 
 * É POSSIVEL SE TRABALHAR COM A INTERFACE PARA VERIFICAR DIRETORIOS E REALIZAR ALTERACOES 
 * NOS MESMOS REALIZANDO OPERAÇÕES DO TIPO ARRAY REALIZANDO A BUSCA COM LACO FOR.
 * 
 * 
 */

public class DirectoryStreamTest {

	public static void main(String[] args) {
		Path dir = Paths.get("C:\\Users\\Ricardo\\eclipse-workspace\\JavaAula29 - NIOEntradaESaida\\pasta\\sobrepasta\\sobrepasta");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			for(Path path: stream) {
				System.out.println("nome do arquivo: " + path.getFileName());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
