package associacao.exercicio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminario;
	
	
	
	//CONSTRUTOR E SOBRECARGA
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor() {
	}
	
	
	public void imprimir() {
		System.out.println("------ Relatório do Professor ----------" );
		System.out.println("Nome do Professor: " + this.nome);
		System.out.println("Especialização: " + this.especialidade);
		if(seminario != null && seminario.length != 0) {
			System.out.print("Seminários Cadastrados: ");
			for(Seminario sem: seminario) {
				System.out.println(sem.getTitulo() + " ");
			}
			return;
		}
		System.out.println("Professor não vinculado a nemhum seminário");
	}
	
	
	
	//MÉTODOS GETTERS AND SETTERS 
	public String getNome() {
		return nome;
	}
	public Seminario[] getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario[] seminario) {
		this.seminario = seminario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}	
	
	
	
	

}
