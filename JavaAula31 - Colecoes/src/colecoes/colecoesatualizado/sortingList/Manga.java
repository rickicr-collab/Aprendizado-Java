package colecoes.colecoesatualizado.sortingList;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
	private Long id;
	private String nome;
	private Double preco;

	public Manga(Long id, String nome, double preco) {
		Objects.requireNonNull(id, "Não pode ser Nulo");
		Objects.requireNonNull(nome, "Não pode ser nulo ");
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public int compareTo(Manga outroManga) {
		return this.nome.compareTo(outroManga.getNome());

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manga [id = ");
		builder.append(id);
		builder.append(", Nome = ");
		builder.append(nome);
		builder.append(", Preco = ");
		builder.append(preco);
		builder.append(" R$]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
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
		return id == other.id && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
