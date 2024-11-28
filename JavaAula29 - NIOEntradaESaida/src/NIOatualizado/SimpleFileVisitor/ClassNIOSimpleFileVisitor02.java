package NIOatualizado.SimpleFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Files visit: (" + file.getFileName() + ")");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("File Pre-Visit: [" + dir.getFileName() + "]");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return super.visitFileFailed(file, exc);
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Pos-visit: [" + dir.getFileName() + "]");
		return FileVisitResult.CONTINUE;
	}

}

public class ClassNIOSimpleFileVisitor02 {
	public static void main(String[] args) throws IOException {
		titulo();
		System.out.println(" ## Mostrando todos os arquivos na Pasta do projeto ##");
		Path root = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\SimpleFileVisitor");
		Files.walkFileTree(root, new ListAllFiles());

	}

	public static void titulo() {
		System.out.println("-----------------------------------------------");
		System.out.println(" Class Utilities NIO SimpleFileVisitor-part 02 ");
		System.out.println("-----------------------------------------------");
	}

}
