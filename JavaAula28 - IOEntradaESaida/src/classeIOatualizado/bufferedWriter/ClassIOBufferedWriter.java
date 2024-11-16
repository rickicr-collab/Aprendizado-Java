package classeIOatualizado.bufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClassIOBufferedWriter {
	public static void main(String[] args) {
		titulo();
		File file = new File("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula28 - IOEntradaESaida\\src\\classeIOatualizado\\bufferedWriter\\testeBuferredWrite.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("Testando a classe Buffered Writer encadeada com a classe FileWriter");
			bw.newLine();
			bw.write("Segunda Linha de teste");
			bw.flush();
			System.out.println("Arquivo escrito com Sucesso !!!");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("   Classe Utilites - IO BufferedWriter   ");
		System.out.println("-----------------------------------------");
	}

}
