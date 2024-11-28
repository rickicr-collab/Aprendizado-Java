package NIOatualizado.BasicFilesAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ClassNIOFIleBasicAttributes {
	public static void main(String[] args) throws IOException {
		titulo();
		File file = new File(
				"C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\BasicFilesAttributes\\arquivo.txt");
		LocalDateTime date = LocalDateTime.now().minusDays(10);
		boolean isCreated = file.createNewFile();
		System.out.println("Arquivi criado? " + isCreated);
		boolean lastModifield = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
		System.out.println("Ultima modificação: [" + lastModifield +  "]");
		
		System.out.println("-------------------------------");
		System.out.println("Utilizando pacote New IO");
		
		Path path = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\BasicFilesAttributes\\'Pasta");
		Path filesPath = Paths.get(path.toString(), "file.txt");
		if(Files.notExists(path)) {
			Files.createDirectories(path);
			System.out.println("pasta criado com sucesso!!!");
			Files.createFile(filesPath);
			System.out.println("Arquivo criado com sucesso !!!");
		}else {
			System.out.println("Pasta e arquivos já existentes!\n");
		}
		FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
		Files.setLastModifiedTime(filesPath, fileTime);
		System.out.println("File is Writeable: [" + Files.isWritable(filesPath) + "]");
		System.out.println("File is Readable: [" + Files.isReadable(filesPath) + "]");
		System.out.println("File is Executable: [" + Files.isExecutable(filesPath) + "]");
		
		
	}

	public static void titulo() {
		System.out.println("---------------------------------------------");
		System.out.println("   Class Utilities - NIO FileBasicAttributes ");
		System.out.println("---------------------------------------------");
	}

}
