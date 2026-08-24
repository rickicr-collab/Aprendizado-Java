package genericsupdated.classes;

public class Barco {
	private String nome;

	public Barco(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Barco [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
