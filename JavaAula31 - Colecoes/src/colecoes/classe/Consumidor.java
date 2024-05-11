package colecoes.classe;

import java.util.Objects;

public class Consumidor implements Comparable{
	private String nome;
	private String cpf;
	
	
	
	
	public Consumidor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consumidor [Nome = ");
		builder.append(nome);
		builder.append(", Cpf = ");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}


	// Getters And Setters
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public int compareTo(Object o) {
		return 0;
	}
	

}
