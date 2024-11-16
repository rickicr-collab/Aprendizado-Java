package classeIOatualizado.bufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassIOBufferedReader {
	public static void main(String[] args) {
		titulo();
		File file = new File("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula28 - IOEntradaESaida\\src\\classeIOatualizado\\bufferedReader\\testeBufferedReader.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			BufferedReader br = new BufferedReader(new FileReader(file))){
			bw.write("Teste de primeira linha do BufferedReader encadeado");
			bw.newLine();
			bw.write("Teste de segunda linha do BuffererReader encandeado");
			bw.newLine();
			bw.flush();
			System.out.println("Arquivo Criado e escrito com sucesso !!!!");
			String linha;
			while((linha = br.readLine()) != null){
				System.out.println("Leitura: " + linha);
			}		
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("    Classe Utilites - IO BufferedReader  ");
		System.out.println("-----------------------------------------");
	}
}
