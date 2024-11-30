package serializacao.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serializacao.classes.Aluno;
import serializacao.classes.Turma;

/*
 * COMENTÁRIOS SOBRE SERIALIZÁÇÃO:
 * SERIALIZAÇÃO NADA MAIS É QUE VOCE USAR UM OBJETO ATRAVESZ DE FLUXO OU CANAL 
 * DE DADOD COMO UM STREAMER
 * 
 * PARA SABERMOS SE A CLASSE OU INTERFACE É SERIALIZADA DEVEMOS IMPLEMENTAR A INTERFACE
 * CHAMADA SERIALIZABLE QUE DENTRO DE SEU CONTEUDO CONTENDO APENAS COMENTARIOS INFORMADOS SOBRE 
 * SUAS FUNCIONALIDADES NÃO POSSUI METODOS OU ATRIBUTOS NENHUM 
 * DEVIDO A ISSO ESSE TIPO DE INTERFACE É CHAMADA DE INTERFACE FLAG QUE INDICA QUE OS ATRIBUTOS 
 * DESSA CLASSE SERÃO SERIALIZADOS.
 * 
 */

public class SerializacaoTeste {

	public static void main(String[] args) {
		gravadorObjeto();
		leitorObjeto();

	}
	
	private static void gravadorObjeto() {
		Turma t = new Turma("Maratona Java , so para os campeões !!!");
		Aluno aluno  = new Aluno(1L, "Ricardo Rosendo", "Senha");
		aluno.setTurma(t);
		try(FileOutputStream fos = new FileOutputStream("Aluno.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(aluno);
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leitorObjeto() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Aluno.ser"))){
			Aluno aluno = (Aluno) ois.readObject();
			System.out.println(aluno);
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
