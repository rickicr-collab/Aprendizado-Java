package classeIOatualizado.fileDiretorios;

import java.io.File;
import java.io.IOException;

public class ClassIOFileDirectory {
	public static void main(String[] args) {
		titulo();
		File fileDiretorio = new File("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula28 - IOEntradaESaida\\src\\classeIOatualizado\\fileDiretorios\\Pasta");
		boolean isDirectorioCreated = fileDiretorio.mkdir();
		System.out.println("Diretorio criado ? " + isDirectorioCreated);
		
		File fileArquivo = new File("C:\\\\Users\\\\Ricardo\\\\Desktop\\\\Backup Eclipse workSpace\\\\Aprendizado-Java-main\\\\JavaAula28 - IOEntradaESaida\\\\src\\\\classeIOatualizado\\\\fileDiretorios\\\\Pasta\\ClassTeste.java");
		try {
			if(fileArquivo.exists()) {
				System.out.println("Arquivo já existente será deletado!");
				fileArquivo.delete();
			}else {
				boolean isCreated = fileArquivo.createNewFile();
				System.out.println("Arquivo criado ? " + isCreated);
				System.out.println("Arquivo criado com sucesso !");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fileRename = new File(fileDiretorio, "classeJavaRenomeada.java");
		boolean isRenamed = fileArquivo.renameTo(fileRename);
		System.out.println("O arquivo foi renomeado ? " + isRenamed);
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("    Classe Utilites - IO File Directory  ");
		System.out.println("-----------------------------------------");
	}
}
