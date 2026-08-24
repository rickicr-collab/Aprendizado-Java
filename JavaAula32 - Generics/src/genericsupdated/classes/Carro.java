package genericsupdated.classes;

public class Carro {
	private String nome;

	public Carro(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
