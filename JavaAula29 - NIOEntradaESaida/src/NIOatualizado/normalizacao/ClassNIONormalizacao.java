package NIOatualizado.normalizacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassNIONormalizacao {

	public static void main(String[] args) throws IOException {
		titulo();
		Path subPath = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\normalizacao\\'home\\'dev");	
		if(Files.notExists(subPath)) {
			Files.createDirectories(subPath);
			System.out.println("Pasta criada com sucesso !");
		}else {
			System.out.println("pasta já existe!!");
		}
		
		String diretorioProjeto = "/JavaAula29 - NIOEntradaESaida/src/NIOatualizado/normalizacao/'home/'dev";
		String arquivoTXT = "../../arquivo.txt";
		Path path1 = Paths.get(diretorioProjeto, arquivoTXT);
		System.out.println("Path Original: " + path1);
		System.out.println("Path Normalizado: " + path1.normalize());
		System.out.println("--------------------------------------");
		Path path2 = Paths.get("/JavaAula29 - NIOEntradaESaida/src/NIOatualizado/normalizacao/'home/./'dev");
		System.out.println("Path2 Original: " + path2);
		System.out.println("Path2 Nomralizado: " + path2.normalize());
		
		
		

	}
	
	public static void titulo() {
		System.out.println("--------------------------------------");
		System.out.println("  Class Utilities - NIO Normalizacão  ");
		System.out.println("--------------------------------------");
	}

}
