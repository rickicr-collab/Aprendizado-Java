package ioentradasaidadados.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class Fileteste {

	public static void main(String[] args){
		File arquivo = new File("Arquivo.txt");
		try {
			System.out.println("Arquivo criado: " + arquivo.createNewFile());
			System.out.println("Arquivo existe: " + arquivo.exists());
			System.out.println("Tem permissao de leitura: " + arquivo.canRead());
			System.out.println("Qual o caminho do arquivo?: " + arquivo.getPath());
			System.out.println("Caminho absoluto? : " + arquivo.getAbsolutePath());
			System.out.println("Isso é um diretorio?: " + arquivo.isDirectory());
			System.out.println("O arquivo é oculto?: " + arquivo.isHidden());
			System.out.println("Quando o arquivo foi modificado?: " + new Date(arquivo.lastModified()));
			if(arquivo.exists()) {
				System.out.println("Deletado? : " + arquivo.delete());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
