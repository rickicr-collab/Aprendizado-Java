package colecoes.classe;

import java.util.Objects;

public class Produto implements Comparable <Produto> {
	private String serialNumber;
	private String nome;
	private double preco;
	private int quantidade;
	
	
	

	public Produto(String serialNumber, String nome, double preco, int quantidade) {
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}






	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [serialNumber = ");
		builder.append(serialNumber);
		builder.append(", Nome = ");
		builder.append(nome);
		builder.append(", Preço = ");
		builder.append(preco);
		builder.append(", Quantidade = ");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(serialNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(serialNumber, other.serialNumber);
	}
	
	@Override
	public int compareTo(Produto outroObjeto) {
		Double d = this.preco;
		return d.compareTo(outroObjeto.preco);
	}
	

	//Methods Getters and Setters
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	

	
	
	
	
	
	

}
