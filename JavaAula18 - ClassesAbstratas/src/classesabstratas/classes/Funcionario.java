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
 * PARTE 02
 * OBS7: CLASSES ABSTRATAS PODEM EXTENDER OUTRAS CLASSES ABSTRATAS.
 * OBS8: QUANDO A MAIS DE UMA CLASSE ABSTRATA CRIADA E UMA DELAS É UMA SUPER 
 * CLASSE DA OUTRA TODOS MÉTODOS ABSTRATOS QUE NÃO FOREM PRE- IMPLEMENTADO.
 * 
 * 
 */

public abstract class Funcionario extends Pessoa {
	protected String clt;
	protected double salario;
	
	
	// CONSTRUTORES 
		
	public Funcionario() {
		
	}
	
	public Funcionario(String nome,String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	
	//MÉTODOS 
	public abstract void calcularSalario();
	public void imprime() {
		System.out.println("Dentro do Imprime do Funcionário!");
	}
	
	// MÉTODO TO STRING 
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}

	// GETTERS E SETTERS 
	
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
