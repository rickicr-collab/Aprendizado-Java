package NIOatualizado.DirectoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassNIODirectoryStream {
	public static void main(String[] args) throws IOException {
		titulo();
		Path dir = Paths.get(
				"C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\DirectoryStream\\'home\\'ricardo");
		if (Files.notExists(dir)) {
			Files.createDirectories(dir);
			System.out.println("Pastas e subpastas criadas com sucesso !!!");
		} else {
			System.out.println("Pastas já existentes !");
		}

		Path filePath = Paths.get(dir.toString(), "Arquivo_teste.txt");
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("Arquivo criado com sucesso !!!");
		} else {
			System.out.println("Arquivo já existente !!");
		}
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			for(Path path: stream) {
				System.out.println("arquivos: " + path.getFileName());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("   Class Utilities NIO DirectoryStream   ");
		System.out.println("-----------------------------------------");
	}

}
