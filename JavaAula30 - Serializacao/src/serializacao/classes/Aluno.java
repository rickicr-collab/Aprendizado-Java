package serializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * COMENTARIOS SOBRE SERIALIZAÇÃO :
 * 
 * PARA SABERMOS SE A CLASSE OU INTERFACE É SERIALIZADA DEVEMOS IMPLEMENTAR A INTERFACE
 * CHAMADA SERIALIZABLE QUE DENTRO DE SEU CONTEUDO CONTENDO APENAS COMENTARIOS INFORMADOS SOBRE 
 * SUAS FUNCIONALIDADES NÃO POSSUI METODOS OU ATRIBUTOS NENHUM 
 * DEVIDO A ISSO ESSE TIPO DE INTERFACE É CHAMADA DE INTERFACE FLAG QUE INDICA QUE OS ATRIBUTOS 
 * DESSA CLASSE SERÃO SERIALIZADOS.
 * 
 * ATRIBUTOS TRANSIENTES SÃO ATRIBUTOS QUE NA SERIALIZAÇÃO O JAVA IGNORA 
 * 
 * QUANDO VOCE PRECISA SERIALIZAR UMA CLASSE MAISNNÃO TEM ACESSO A INTERFACE SERIALIZABLE 
 * 
 * EXISTE DOIS MÉTODOS POSSIVEIS PARA SE REALIZAR :
 * 
 * MÉTODO PRIVADO PARA ESCRITA DO OBJETO USANDO (OBJECTOUTPUTSTREAM)
 * MÉTOOD PRIVADO PARA LEITURA DO OBJETO USANDO (OBJECTINPUTSTREAM)
 * 
 * 
 */

import java.io.Serializable;

public class Aluno implements Serializable {
	
	private long id;
	private String nome;
	private transient String password;
	private static String nomeEscola = "DevDojo";
	private transient Turma turma;
	
	
	{
		System.out.println("<<<<< Trabalhando com Serialização >>>>>");
	}
	
	
	public Aluno(long id, String nome, String password) {
		this.id = id;
		this.nome = nome;
		this.password = password;
		
		
	}


	@Override
	public String toString() {
		return "Aluno "
				+ "[id: " + id + 
				"\nNome: " + nome + "\n"
				+"Password: " + password + 
				 "\nNome da Escola: " + nomeEscola + 
				 "\nTurma: " + turma + "] ";
	}
	
	//Methods
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			turma = new Turma(ois.readUTF());
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}
	public String getPassword() {
		return password;
	}
	public static String getNomeEscola() {
		return nomeEscola;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}
	
	
	
	

}
