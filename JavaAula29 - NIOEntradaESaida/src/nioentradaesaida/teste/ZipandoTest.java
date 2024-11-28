package nioentradaesaida.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
 * COMENTÁRIOS SOBRE ZIPAR ARQUIVOS NO JAVA:
 * É POSSIVEL COMPRIMIR OU ZIPAR ARQUIVOS NO JAVA ASSIM COMO EM QUALQUER 
 * LINGUAGEM DE PROGRAMAÇÃO MAIS A CLASSE NO PACOTE NEW I/O NÃO É MUITO VERSATIL 
 * E CONSOME MAIS MEMORIA NO PROCESSO ENTÃO É FACTIVEL UTILIZAR O MÉTODO DENTRO 
 * DA CLASSE I/O PARA RESOLVER ESSE CASO.
 * 
 * UTILIZANDO O PACOTE JAVA.UTIL.ZIP
 * 
 * 
 * 
 * 
 */

public class ZipandoTest {
	public static void main(String[] args) {
		System.out.println("<<<<< Criando arquivos zip no java >>>>> ");
		System.out.println("Utilizando a classe ZipOutputStream");
		Path dirZip = Paths.get("pasta/sobrepasta");
		Path dirFiles = Paths.get("pasta/sobrepasta/sobrepasta");
		Path filesZip = dirZip.resolve("arquivo.zip");
		try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(filesZip.toFile()));
			DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
			for(Path path: stream) {
				System.out.println("Nome do arquivo: " + path.getFileName());
				System.out.println("Arquivos zipados com sucesso!");
				ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
				zip.putNextEntry(zipEntry);
				FileInputStream fileInput = new FileInputStream(path.toFile());
				byte[] buff = new byte[2048];
				int bytesRead;
				while((bytesRead = fileInput.read(buff)) > 0) {
					zip.write(buff, 0, bytesRead);
				}
				zip.closeEntry();
				fileInput.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	

}
