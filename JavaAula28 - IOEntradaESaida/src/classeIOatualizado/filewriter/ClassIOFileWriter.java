package classeIOatualizado.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClassIOFileWriter {
	public static void main(String[] args) {
		titulo();
		File file = new File(
				"C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula28 - IOEntradaESaida\\src\\classeIOatualizado\\filewriter\\testfile.txt");
		try(FileWriter fw = new FileWriter(file)){
			fw.write("O caminho para aprendizagem é gostar e focar no que gosta!\n");
			fw.write("Continuando na segunda linha\n");
			fw.write("Meu nome é ricardo!!!\n");
			fw.flush();	
			System.out.println("Arquivo criado e escrito!!!!");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("     Classe Utilites - IO FIleWriter     ");
		System.out.println("-----------------------------------------");
	}

}
