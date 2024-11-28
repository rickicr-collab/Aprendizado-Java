package NIOatualizado.SimpleFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path>{

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		// se voce deseja imprimir arquivos de um tipo especifico de extensão
		if(file.getFileName().toString().endsWith(".java")) {
			System.out.println("Files in the Paths: " + file.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}
	
}

public class ClassNIOSimpleFileVisitor {
	public static void main(String[] args) throws IOException {
		titulo();
		System.out.println("--Fazendo visita aos arquivos da pasta SRC da classe NIO--\n");
		Path root = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src");
		
		Files.walkFileTree(root, new ListJavaFiles());
		
	}
	
	public static void titulo() {
		System.out.println("---------------------------------------");
		System.out.println(" Class Utilities NIO SimpleFileVisitor ");
		System.out.println("---------------------------------------");
	}

}
