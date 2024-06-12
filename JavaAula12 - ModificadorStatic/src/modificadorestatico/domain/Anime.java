package modificadorestatico.domain;

public class Anime {
	private String nome;
	private static int[] episodios;
	
	static{   
		
		episodios = new int[100];
		for(int i = 0; i < episodios.length; i++) {
			episodios[i] = i+1; 
		}
		System.out.print("Episodios: ");
		for(int ep: episodios) {
			System.out.print(ep + " ");
		}
		System.out.println();
	}
	
	static {
		System.out.println("Segundo bloco de inicialização");
	}
	
	
	
	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static int[] getEpisodios() {
		return episodios;
	}
	
	
	
	
	
	
	
	
	

}
