package serializaçãoatualizado;

public class Turma {
	
	private String nome;

	public Turma(String nome) {
		super();
		this.nome = nome;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Turma [nome = ");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
