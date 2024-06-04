package sobrecargametodos.classes;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	
	
	
	public void init(String nome, String tipo, int epsodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = epsodios;
	}
	
	public void init(String nome, String tipo, int episodios, String genero) {
		this.init(nome, tipo, episodios);
		this.genero = genero;
	}
	
	public void imprime() {
		System.out.println("Nome do Anime: " + this.nome);
		System.out.println("Tipo do Anime: " + this.tipo);
		System.out.println("Episodios Anime: " + this.episodios);
		System.out.println("Genero do Anime: " + this.genero);
		
	}
	
	
	
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setEpsodios(int epsodios) {
		this.episodios = epsodios;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getEpsodios() {
		return this.episodios;
	}
	
	public String getNome() {
		return this.nome;
	}

}
