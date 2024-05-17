package generics.classes;

public class Carro {
	private String nome;
	
	
	
	public Carro(String nome) {
		this.nome = nome;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [Nome = ");
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
