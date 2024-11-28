package NIOatualizado.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassNIOPath {
	public static void main(String[] args) {
		titulo();
		Path p1 = Paths.get(
				"C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\path\\NIOPath.txt");
		Path p2 = Paths.get(
				"C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\path",
				"NIOPath.txt");
		Path p3 = Paths.get("C:",
				"Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula29 - NIOEntradaESaida\\src\\NIOatualizado\\path\\",
				"NIOPath.txt");
		Path p4 = Paths.get("C:", "Users", "Ricardo", "Desktop", "Backup Eclipse workSpace", "Aprendizado-Java-main",
				"JavaAula29 - NIOEntradaESaida", "src", "NIOatualizado", "path", "NIOPath.txt");
		System.out.println("##Buscando o nome dos Arquivos pelo Paths##");
		System.out.println("Nome do Arquivo: [" + p1.getFileName() + "]");
		System.out.println("Nome do arquivo: [" + p2.getFileName() + "]");
		System.out.println("Nome do Arquivo: [" + p3.getFileName() + "]");
		System.out.println("Nome do arquivo: [" + p4.getFileName() + "]");
		
		
		

	}

	public static void titulo() {
		System.out.println("--------------------------------------");
		System.out.println("      Class Utilities - NIO Path      ");
		System.out.println("--------------------------------------");
	}

}
