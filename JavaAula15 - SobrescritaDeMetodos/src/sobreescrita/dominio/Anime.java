package sobreescrita.dominio;

public class Anime {
	private String nome;

	static {
		System.out.println("--------------------------------------------");
		System.out.println("        Sobreescrita de Métodos            ");
		System.out.println("--------------------------------------------");
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Anime [Nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
