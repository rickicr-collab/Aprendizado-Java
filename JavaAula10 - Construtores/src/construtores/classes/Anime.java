package construtores.classes;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;

	

	public Anime() {
		
	}

	public Anime(String nome, String tipo, int episodios, String genero) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
		
		
	}
	
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		this(nome, tipo, episodios, genero);
		this.estudio = estudio;
	}

	public void imprime() {
		System.out.println(" ------- Dados do Anime em Tela --------- ");
		System.out.println("Nome do Anime: " + this.nome);
		System.out.println("Tipo do Anime: " + this.tipo);
		System.out.println("Quantidade de Episodios: " + this.episodios);
		System.out.println("Gênero do Anime: " + this.genero);
		System.out.println("Estudio do Anime: " + this.estudio);

	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getEpisodios() {
		return episodios;
	}

	public String getGenero() {
		return genero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	

}
