package serializacao.classes;



public class Turma {
	
	private String nomeTurma;
	
	
	
	// Constructor
	public Turma(String nomeTurma) {
		super();
		this.nomeTurma = nomeTurma;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Turma [nome da Turma: " + nomeTurma + "]";
	}


	// Getter and Setter
	public String getNome() {
		return nomeTurma;
	}

	public void setNome(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	
	

}
