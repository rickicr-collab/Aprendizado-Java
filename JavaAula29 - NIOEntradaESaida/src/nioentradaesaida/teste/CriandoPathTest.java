package nioentradaesaida.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class CriandoPathTest {

	public static void main(String[] args) {
	    System.out.println("<<<<< trabalhando com classe Path >>>>> ");
		Path p2 = Paths.get("C:\\Users\\Ricardo\\git\\Aprendizado-Java\\JavaAula28 - IOEntradaESaida\\new_folder", "arquivoteste.txt");
		Path p3 = Paths.get("C:","Users\\Ricardo\\git\\Aprendizado-Java\\JavaAula28 - IOEntradaESaida\\new_folder","arquivoteste.txt");
		Path p4 = Paths.get("C:","Users","Ricardo","git","Aprendizado-Java","JavaAula28 - IOEntradaESaida","new_folder\\","arquivoteste.txt");
		
		System.out.println(p4.toAbsolutePath());
		File file = p3.toFile();
		Path path = file.toPath();
		System.out.println("------------------------------------------");
		System.out.println("<<<< Trabalhando com classe Path - diretorios >>>> ");
		Path path1 = Paths.get("arquivo");
		Path path2 = Paths.get("pasta\\sobrepasta\\sobrepasta\\");
		try {
			if(Files.notExists(path2.getParent()) || Files.notExists(path1)) {
				Files.createDirectory(path1);
				Files.createDirectories(path2.getParent());
				System.out.println("Diretorios criados  Criados!");
			}else {
				throw new FileAlreadyExistsException("folders already exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------------");
		System.out.println("<<<< trabalhando com classe Path - criando arquivos>>>> ");
		Path arquivo = Paths.get("arquivo\\file.txt");
		try {
			if(Files.notExists(arquivo)) {
				Files.createFile(arquivo);
				System.out.println("Arquivo criado!");
			}else {
				throw new FileAlreadyExistsException("File Already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Conflitos na criação de arquivos e parta >>>>>");
		Path arquivo2 = Paths.get("pasta\\sobrepasta\\sobrepasta\\file2.txt");
		try {
			if(Files.notExists(arquivo2.getParent()))
				Files.createDirectories(path2);
				Files.createFile(arquivo2);
				System.out.println("Arquivos e pastas criados!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("<<<< Copiando um arquivo usando a classe Path >>>> ");
		Path source = Paths.get("arquivo\\file.txt");
		Path target = Paths.get(path2.toString() + "\\file_renomeado.txt" );
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Arquivos e pastas criados!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("<<<< Deletando um arquivo usando a classe Path >>>> ");
		Path source1 = Paths.get("arquivo\\file.txt");
		Path target1 = Paths.get(path2.toString() + "\\fileteste_deletado.txt" );
		try {
			Files.copy(source1, target1, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Arquivos e pastas criados!");
			System.out.println("Deletando arquivo!");
			Files.deleteIfExists(target1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
