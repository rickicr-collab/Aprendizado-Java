package generics.classes;

public class Barco {
	
	private String nome;
	
	
	
	public Barco(String nome) {
		this.nome = nome;
	}



	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Barco [Nome = ");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	


	// Getter and Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
