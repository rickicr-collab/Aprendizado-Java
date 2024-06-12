package associacao.classes;

public class Jogador {
	private String nome;
	private Time time;
	
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void imprime() {
		System.out.println("Nome do Jogador: " + this.nome);
		if(time != null) {
			System.out.println("Nome do Time: " + this.time.getNome());
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
	

}
