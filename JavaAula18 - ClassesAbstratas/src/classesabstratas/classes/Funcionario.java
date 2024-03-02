package classesabstratas.classes;


/*
 * CLASSES ABSTRATA 
 * PARTE 01
 * 
 * OBS: NUNCA SE PODE INSTACIAR UMA CLASSE ABSTRATA.
 * OBS2: PARA CRIAR UMA CLASSE ABSTRATA É NECESSÁRIO 
 * APENAS ATRIBUIR A PALAVRA RESERVADA ABSTRACT APOS A PALAVRA
 * PUBLIC DA CLASSE.
 * OBS3: NÃO SE PODE COLOCAR A PALAVRA RESERVADA FINAL DENTRO DA CLASSE
 * DEVIDO CLASSES ABSTRATAS SEREM CRIADA PARA O PROPOSITO DE SER HERDADE.
 * OBS4: METODOS ABSTRATOS SÃO CRIADOS PARA SER SOBRECARREGADOR
 * EM SUBCLASSES POR ISSO NÃO POSSUEM CODIGOS EM SEU BLOCO.
 * OBS5: MESMO QUE UMA CLASSE SEJA ABSTRATA NÃO É PRECISO TER ALGUM 
 * MÉTODO ASTRATO , NO ENTANTO  SE TIVER UM MÉTODO ABSTRATO É OBRIGATORIO QUE 
 * A CLASSE SEJA ABRTRATA.
 * OBS6: QUANDO SUA CLASSE PRINCIPAL SE TORNA ABSTRATA E POSSUEM MÉTODOS 
 * ABSTRATOS  A SUAS CLASSES FILHAS OU CHAMADAS SUBCLASSES SÃO OBRIGADAS
 * A REALIZAR A SOBRECARGA DOS MÉTODOS ABSTRATOS.
 * 
 */

public abstract class Funcionario {
	protected String nome;
	protected String clt;
	protected double salario;
	
	
	// CONSTRUTORES 
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	
	//MÉTODOS 
	public abstract void calcularSalario();
	
	// MÉTODO TO STRING 
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}

	// GETTERS E SETTERS 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
