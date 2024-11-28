package NIOatualizado.ZipOutPutStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ClassNIOZipoutPutStream {
	public static void main(String[] args) throws IOException {
		titulo();
		
		Path pastas = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\ZipOutPutStream\\'pasta\\'subpasta");
		Path arquivo = Paths.get(pastas.toString(), "arquivo.txt");
		
		if(Files.notExists(pastas)) {
			Files.createDirectories(pastas);
			System.out.println("Pastas criadas com sucesso !!");
		}else {
			System.out.println("pasta já existente");
		}
		
		if(Files.notExists(arquivo)) {
			Files.createFile(arquivo);
			System.out.println("Arquivo txt criado com sucesso!");
		}else {
			System.out.println("Arquivo já existente!");
		}
		
		System.out.println("Zipando Arquivos: ");
		Path arquivoZip = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\ZipOutPutStream\\arquivo.zip");
		Path arquivosParaZipar = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\ZipOutPutStream\\'pasta\\'subpasta");
		zip(arquivoZip, arquivosParaZipar);
		
		
		
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------------");
		System.out.println("    Class Utilities NIO ZipOutputStream       ");
		System.out.println("----------------------------------------------");
		
	}
	
	private static void zip(Path arquivoZip, Path arquivosParaZipar) {
		try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
				DirectoryStream<Path> directorystream = Files.newDirectoryStream(arquivosParaZipar)) {
			for(Path file: directorystream) {
				System.out.println("Arquivos Zipados: " + file.getFileName());
				ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
				zipStream.putNextEntry(zipEntry);
				Files.copy(file, zipStream);
				zipStream.closeEntry();
			}
		} catch (IOException e) {
			System.out.println("Exceção gerada : [" + e + "]");
		}
	}

}
