package associacao.classes;

public class Escola {
	private String nome;
	private Professor[] professores;
	
	static{
		System.out.println("--------------------------------------------------");
		System.out.println("       Associação -  Muitos para um               ");
		System.out.println("--------------------------------------------------");
	}
	
	public Escola(String nome) {
		this.nome = nome;
	}
	
	public Escola(String nome, Professor[] professores) {
		this(nome);
		this.professores = professores;
	}
	
	public void imprime() {
		System.out.println("Nome da Escola: " + this.nome);
		if(professores == null) {
			return;
		}
		for(Professor prof: professores) {
			System.out.println("Professores: " + prof.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
