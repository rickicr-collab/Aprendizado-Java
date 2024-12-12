package colecoes.colecoesatualizado.iterator;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
	
	private Long id;
	private String nome;
	private Double preco;
	private int quantidade;
	
	
	public Manga(Long id, String nome, Double preco) {
		super();
		Objects.requireNonNull(id, "Não pode ser Nulo");
		Objects.requireNonNull(nome,"não pode ser Nulo");
		this.id = id;
		this.nome = nome;
		this.preco = preco;

	}
	
	
	
	public Manga(Long id, String nome, Double preco, int quantidade) {
		this(id, nome, preco);
		this.quantidade = quantidade;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manga other = (Manga) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
	@Override
	public int compareTo(Manga outroManga) {
		return this.nome.compareTo(outroManga.getNome());
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manga [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}
