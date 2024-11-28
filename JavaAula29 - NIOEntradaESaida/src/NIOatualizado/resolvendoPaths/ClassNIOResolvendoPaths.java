package NIOatualizado.resolvendoPaths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassNIOResolvendoPaths {

	public static void main(String[] args) throws IOException {
		titulo();
		Path dir = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\resolvendoPaths\\'home");
		Path arquivo = Paths.get("'dev\\arquivo.txt");
		Path resolve = dir.resolve(arquivo);
		if(Files.notExists(dir)) {
			Files.createDirectories(dir);
			System.out.println("Pasta criada com Sucesso !!!");
		}else {
			System.out.println("Pasta existente !!!");
		}
		
		System.out.println("O caminho ésta resolvido: " + resolve);

	}
	
	public static void titulo() {
		System.out.println("------------------------------------------");
		System.out.println("  Class Utilities - NIO Resolvendo PAths  ");
		System.out.println("------------------------------------------");
	}

}
