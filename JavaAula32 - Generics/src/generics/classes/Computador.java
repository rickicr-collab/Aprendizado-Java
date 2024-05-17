package generics.classes;

public class Computador {
	private String nome;
	
	


	public Computador(String nome) {
		this.nome = nome;
	}
	

	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [Nome = ");
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
