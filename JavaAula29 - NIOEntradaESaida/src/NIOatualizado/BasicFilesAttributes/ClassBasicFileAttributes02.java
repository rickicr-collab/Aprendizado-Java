package NIOatualizado.BasicFilesAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ClassBasicFileAttributes02 {
	public static void main(String[] args) throws IOException {
		titulo();
		Path path = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\BasicFilesAttributes\\'Pasta\\file.txt");
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("#### BasicAttibutes ####");
		System.out.println("CreationTime: [" + basicFileAttributes.creationTime().toString() + "]");
		System.out.println("LastModifield: [" + basicFileAttributes.lastModifiedTime().toString() + "]");
		System.out.println("LastAcessTime: [" + basicFileAttributes.lastAccessTime().toString() + "]");
		System.out.println("------------------------------");
		
		System.out.println("#### BasicAttributes View ####");
		BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		System.out.println("Read Attributes CreationTime: [" + basicFileAttributeView.readAttributes().creationTime() + "]");
		System.out.println("Read Attributes lastAccesTime: [" + basicFileAttributeView.readAttributes().lastAccessTime() + "]");
		System.out.println("Read Attributes lastmodifield: [" + basicFileAttributeView.readAttributes().lastModifiedTime() + "]");
		System.out.println("-------------------------------");
		
		System.out.println("#### Modificando attributos ###");
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		basicFileAttributeView.setTimes(basicFileAttributeView.readAttributes().lastModifiedTime(),newCreationTime , basicFileAttributeView.readAttributes().creationTime());
		System.out.println("Read Attributes lastCreationTime: [" + basicFileAttributeView.readAttributes().creationTime() + "]");
		System.out.println("Read Attributes lastModifield: [" + basicFileAttributeView.readAttributes().lastModifiedTime() + "]");
		System.out.println("Read Attributes lastAccesTime: [" + basicFileAttributeView.readAttributes().lastAccessTime() + "]");
		
		
		
	}
	
	public static void titulo() {
		System.out.println("------------------------------------------------------");
		System.out.println("  Class Utilities - NIO FileBasicAttributes parte 02  ");
		System.out.println("------------------------------------------------------");
	}


}
