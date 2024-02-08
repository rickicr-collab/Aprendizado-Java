package sobrescrita.classes;

/*
 * TRABALHANDO COM SOBRESCRITA DE MÉTODOS 
 * REALIZANDO UMA SOBREESCRITA NO MÉTODO TOsTRING PADRÃO DA CLASSE OBJECT
 * DO JAVA 
 * OBS: TODO OBJETO DE REFERENCIA A SER IMPRESSO EM TELA É MOSTRADO O ENDEREÇO DO PACOTE
 * MAIS O ENDEREÇO DE MÉMORIA QUE O OBJETO FOI ALOCADO 
 * PARA MELHORARMOS ISSO PODEMOS SOBRE-ESCREVER O MÉTODO TO STRING MODIFICAMDO A FORMA 
 * DE EXECUÇÃO DO MÉDICO COLOCANDO NOSSAS PROPRIAS MODIFICAÇÕES SEM MODIFICAR A ESTRUTURA 
 * BASE DO MÉTODO FAZENDO APENAS ALTERAÇÕES POSSIVEIS NO MÉTODO 
 */

public class Pessoa {
	
	
	private String nome;
	private int idade;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=").append(nome).append(", idade=").append(idade).append("]");
		return builder.toString();
	}
	
	//MÉTODOS GETTERS AND SETTERS 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
