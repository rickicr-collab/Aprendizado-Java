package serializaçãoatualizado.teste;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import serializaçãoatualizado.Aluno;
import serializaçãoatualizado.Turma;





public class SerializacaoTeste {
	public static void main(String[] args) {
		titulo();
		Aluno aluno = new Aluno(1L, "Ricardo Cunha ", "1804");
		Turma turma = new Turma("TI - Java Serialização");
		aluno.setTurma(turma);
		serializar(aluno);
		deSerializar();
		
	}

	
	private static void serializar(Aluno aluno) {
		pastaDestinoSerializar();
		Path path = Paths.get("C:\\\\Users\\\\Ricardo\\\\Desktop\\\\Backup Eclipse workSpace\\\\Aprendizado-Java-main\\\\JavaAula30 - Serializacao\\\\src\\\\serializaçãoatualizado\\\\teste\\\\'Pasta-Serializar\\aluno.ser");
		try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
			oos.writeObject(aluno);
			System.out.println("Realizada a serialização");
		}catch(IOException ioe) {
			System.out.println("Exception gerada: [" + ioe + "]");
		}
	}
	
	public static void pastaDestinoSerializar() {
		Path pastaSerializar = Paths.get("C:\\Users\\Ricardo\\Desktop\\Backup Eclipse workSpace\\Aprendizado-Java-main\\JavaAula30 - Serializacao\\src\\serializaçãoatualizado\\teste\\'Pasta-Serializar");
		if(Files.notExists(pastaSerializar)) {
			try {
				Files.createDirectory(pastaSerializar);
				System.out.println("Pasta criada com sucesso!");
			} catch (IOException e) {
				System.out.println("Exception gerada: [" + e + "]");
			}
		}else {
			System.out.println("Pasta já existente !");
		}
		
	}
	
	private static void deSerializar() {
		Path path = Paths.get("C:\\\\Users\\\\Ricardo\\\\Desktop\\\\Backup Eclipse workSpace\\\\Aprendizado-Java-main\\\\JavaAula30 - Serializacao\\\\src\\\\serializaçãoatualizado\\\\teste\\\\'Pasta-Serializar\\aluno.ser");
		try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
			Aluno aluno = (Aluno)ois.readObject();
			System.out.println("Arquivo Deserializado: " + aluno);
		}catch(IOException | ClassNotFoundException e) {
			System.out.println("Exception gerada: [" + e + "]");
		} 
	}
	
	
	
	public static void titulo() {
		System.out.println("-----------------------------");
		System.out.println("         Serialização        ");
		System.out.println("-----------------------------");
	}

}
