package NIOatualizado.DosFileAttribute;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class ClassDosFileAttributes {
	public static void main(String[] args) throws IOException {
		titulo();
		Path pathDirectori = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\DosFileAttribute\\'Pasta");
		if(Files.notExists(pathDirectori)) {
			Files.createDirectories(pathDirectori);
			System.out.println("Arquivo e Pasta criados com sucesso !!");
		}else {
			System.out.println("Arquivos e Pasta Ja existentes !!");
		}
		
		Path filePath = Paths.get(pathDirectori.toString(), "file.txt");
		Path filePath2 = Paths.get(pathDirectori.toString(), "Arquivo_teste2.txt");
		if(Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("Arquivo filePath Criado com Sucesso !!");
			
		}else {
			System.out.println("Arquivo Ja existente !!");
		}
		Files.setAttribute(filePath,"dos:hidden", true);
		Files.setAttribute(filePath,"dos:readonly", true);
		
		System.out.println(" ---- Utilizado DOSAttibuteView -----");
		if(Files.notExists(filePath2)) {
			Files.createFile(filePath2);
			System.out.println("Arquivo FilePath2 criado com sucesso !!");
		}else {
			System.out.println("Arquivo filsepath2 já existente !!!");
		}
		
		Path path2 = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\DosFileAttribute\\'Pasta\\Arquivo_teste2.txt");
		DosFileAttributes dosAttributes = Files.readAttributes(path2, DosFileAttributes.class);
		System.out.println("Verificando atttributos com DosFileAttibutes: \n");
		System.out.println("DosAttributes isHidden: [" + dosAttributes.isHidden() + "]");
		System.out.println("DosAttributes isReadOnly: [" + dosAttributes.isReadOnly() + "]");
		
		System.out.println(" Modificando com DosFileAttributesView: \n");
		
		DosFileAttributeView dosAttributesView = Files.getFileAttributeView(path2, DosFileAttributeView.class);
		dosAttributesView.setHidden(true);
		dosAttributesView.setReadOnly(true);
		
		System.out.println("the file is Hidden: [" + dosAttributesView.readAttributes().isHidden() + "]");
		System.out.println("the file is readOnly: [" + dosAttributesView.readAttributes().isReadOnly() + "]");
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------");
		System.out.println("  Class Utilities NIO DosFileAttribute  ");
		System.out.println("----------------------------------------");
	}

}
