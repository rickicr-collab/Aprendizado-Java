package classeIOatualizado.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassIOFileReader {
	public static void main(String[] args) {
		titulo();
		File file = new File("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula28 - IOEntradaESaida\\src\\classeIOatualizado\\fileReader\\textereader.txt");
		try(FileWriter fw = new FileWriter(file)) {
			fw.write("Esse é o teste de leitura FileWriter junto com FileReader\n");
			fw.write("Segunda linha testando a escrita no file Reader\n");
			fw.flush();
			System.out.println("Arquivo criado e escrito!!!!");
			FileReader fr = new FileReader(file);
			System.out.print("Arquivo lido: ");
			char[] arrayChar = new char[(int)file.length()];
			System.out.print("[Quantidade de Caracteres "+ fr.read(arrayChar) + "] - ");
			for(char c: arrayChar) {
				System.out.print(c);
			}
			fr.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("     Classe Utilites - IO FIleReader     ");
		System.out.println("-----------------------------------------");
	}

}
