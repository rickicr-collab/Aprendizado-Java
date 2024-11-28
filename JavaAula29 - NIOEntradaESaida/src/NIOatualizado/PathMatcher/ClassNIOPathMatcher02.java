package NIOatualizado.PathMatcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


class FindAllJavaOrClass extends SimpleFileVisitor<Path>{
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{test*}.{java,class}");
	// tambem é possivel utilizar a espressão na busca do glob a expressão teste sem os caracteres chaves = *test*
	

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(matcher.matches(file)) {
			System.out.println(file.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}
	
	
}

public class ClassNIOPathMatcher02 {
	public static void main(String[] args) throws IOException {
		titulo();
		Path path = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src");
		Files.walkFileTree(path, new FindAllJavaOrClass());
		
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------------");
		System.out.println("        Class Utilities NIO PathMatcher       ");
		System.out.println("----------------------------------------------");
		System.out.println("Exercicio: -- Todos os arquivos encontrados --");
	}
	
	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println("Path: " + path + " - " + glob + ": [" + matcher.matches(path) + "]");
	}

}
