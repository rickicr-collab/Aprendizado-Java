package NIOatualizado.PosixFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class ClassPosixFileAttributes {
	public static void main(String[] args) throws IOException {
		titulo();
		
		Path path = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\PosixFileAttributes\\'ricardo");
		
		if(Files.notExists(path)) {
			Files.createDirectory(path);
			System.out.println("pasta criada com sucesso !!!");
		}else {
			System.out.println("Pasta já existente !!!");
		}
		
		Path filePath = Paths.get(path.toString(),"file.txt");
		if(Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("Arquivo file.txt criado com sucesso !!!");
		}else {
			System.out.println("Arquivo já existente !!!");
		}
		
		System.out.println("---- Trabalhando com PosixFileAttributes ----");
		PosixFileAttributes pfa = Files.readAttributes(filePath, PosixFileAttributes.class);
		System.out.println("Permissões: " + pfa.permissions());
		PosixFileAttributeView fav = Files.getFileAttributeView(filePath, PosixFileAttributeView.class);
		Enum<PosixFilePermission> posixFilePermission = PosixFilePermission.valueOf("rw-rw-rw-");
		fav.setPermissions((Set<PosixFilePermission>) posixFilePermission);
		System.out.println(fav.readAttributes().permissions());
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------");
		System.out.println("  Class Utilities NIO DosFileAttribute  ");
		System.out.println("----------------------------------------");
	}

}
