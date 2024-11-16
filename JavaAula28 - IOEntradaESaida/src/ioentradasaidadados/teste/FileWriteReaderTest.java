package ioentradasaidadados.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileWriteReaderTest {

	public static void main(String[] args) {
		File arquivo = new File("Arquivo.txt");
		System.out.println("<<<< Trabalhando com FileWriter / FileReader >>>>");
		System.out.println("Exemplo 01");
		try(FileWriter fw = new FileWriter(arquivo);
			FileReader fr = new FileReader(arquivo)){
			fw.write("Escrevendo no arquivo como exemplo\nE pulando uma linha 2\n");
			fw.flush();
			char[] in = new char[50];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for(char c: in) {
				System.out.print(c);
			}
			System.out.println(" ");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("<<<< Trabalhando com FileWriter / FileReader >>>>");
		System.out.println("exemplo 02");
		try {
			FileWriter fw = new FileWriter(arquivo);
			arquivo.createNewFile();
			fw.write("Escrevendo no arquivo como exemplo\nE pulando uma linha 2\n");
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(arquivo);
			char[] in = new char[50];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for(char c: in) {
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
