package classeIOatualizado.file;

import java.io.File;
import java.io.IOException;

public class ClasseIOFile {
	public static void main(String[] args) {
		titulo();
		criarArquivo();
		
		
	}
	
	public static void criarArquivo() {
		File file = new File("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula28 "
				+ "- IOEntradaESaida\\src\\classeIOatualizado\\file\\Teste.txt");
		try {
			boolean isExist = file.exists();
			System.out.println("Caminho do arquivo criado: " + file.getPath());
			System.out.println("O arquivo é um diretorio? " + file.isDirectory());
			System.out.println("è um arquivo ? " + file.isFile());
			if (isExist) {
				System.out.println("O arquivo já existe e será deletado!");
				file.delete();
			} else {
				boolean isCreated = file.createNewFile();
				System.out.println("Arquivo foi criado ? " + isCreated);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("       Classe Utilites - IOFIle          ");
		System.out.println("-----------------------------------------");
	}

}
