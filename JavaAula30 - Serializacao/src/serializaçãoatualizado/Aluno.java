package serializaçãoatualizado;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {


	private static final long serialVersionUID = 2430446695552696156L;
	private long id;
	private String nome;
	private transient String password;
	private static final String NOME_ESCOLA = "DevDojo - virado no Jiraya";
	private transient Turma turma;

	public Aluno(long id, String nome, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.password = password;
	}

	@Serial
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
		} catch (IOException ioe) {
			System.out.println("Exception gerada: [" + ioe + "]");
		}
	}

	@Serial
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String nomeTurma = ois.readUTF().toString();
			turma = new Turma(nomeTurma);
		} catch (IOException | ClassNotFoundException ioe) {
			System.out.println("Exception gerada: [" + ioe + "]");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [Id = ");
		builder.append(id);
		builder.append(", Nome = ");
		builder.append(nome);
		builder.append(", Password = ");
		builder.append(password);
		builder.append(", NOME_ESCOLA = ");
		builder.append(NOME_ESCOLA);
		builder.append(", Turma = ");
		builder.append(turma != null ? turma.getNome(): "Nenhuma");
		builder.append("]");
		return builder.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
		
	}

}
