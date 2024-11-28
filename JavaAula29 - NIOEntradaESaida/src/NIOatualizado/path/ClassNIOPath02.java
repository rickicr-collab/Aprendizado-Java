package NIOatualizado.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ClassNIOPath02 {
	public static void main(String[] args) throws IOException {
		titulo();
		Path pastaPath = Paths.get(
				"C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\path\\'pasta01");
		if (Files.notExists(pastaPath)) {
			Files.createDirectory(pastaPath);
			System.out.println("Exemplo 01 - pasta criada com sucesso");
		} else {
			System.out.println("Pasta já existe!!");
		}

		Path subPastaPath = Paths.get(
				"C:\\Users\\Ricardo\\Desktop\\\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\path\\'pasta\\subpasta");
		if (Files.notExists(subPastaPath)) {
			Files.createDirectories(subPastaPath);
			System.out.println("Exemplo 02 - Pasta criada com sucesso");
		} else {
			System.out.println("Pasta já existe !!");
		}
		Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
		if (Files.notExists(filePath)) {
			Path fileCreated = Files.createFile(filePath);
			System.out.println("Exemplo 03 - Arquivo criado na pasta com sucesso !");
		} else {
			System.out.println("Arquivo já existe!");
		}
		
		Path source = filePath;
		Path target = Paths.get(filePath.getParent().toString(),"file_renomeado.txt");
		System.out.println("Arquivo renomeado e copiado!!!");
		Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
	}

	public static void titulo() {
		System.out.println("--------------------------------------");
		System.out.println("      Class Utilities - NIO Path      ");
		System.out.println("--------------------------------------");
	}

}
