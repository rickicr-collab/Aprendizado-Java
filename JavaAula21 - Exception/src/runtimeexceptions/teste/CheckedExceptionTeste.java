package runtimeexceptions.teste;

import java.io.File;
import java.io.IOException;



public class CheckedExceptionTeste {

	public static void main(String[] args) {
		abrirArquivo();
		
	}
	
	public static void criarArquivo() throws IOException {
		File file = new File("ArquivoTeste.txt");
			System.out.println("Situação da Criação do Arquivo: " + file.createNewFile());
			System.out.println("Arquivo Criado!");
	}
	
	public static String abrirArquivo(){
		try {
			System.out.println("Abrindo um Arquivo....");
			System.out.println("Executando a Leitura do Arquivo");
			System.out.println("Escrevendo no Arquivo");
			//throw new Exception("Gerando uma exceção");
			return "Qualquer Valor";
		}catch(Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();
		}finally {
			System.out.println("Fechar o Arquivo.");
		}
		return null;
		
	}

}
