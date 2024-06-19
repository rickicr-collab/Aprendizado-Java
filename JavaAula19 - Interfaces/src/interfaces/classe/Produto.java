package interfaces.classe;


public class Produto implements Tributavel, Transportavel{
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double freteFinal;

	
	// CONSTRUTOR
	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	// MÉTODOS ABSTRATOS  
	@Override
	public void calcularTributo() {
		precoFinal = this.preco + (this.preco * IMPOSTO_PRODUTO);
		
	}

	@Override
	public void calcularFrete() {
		freteFinal = this.preco / this.peso * FRETE_PRODUTO;
		
	}

	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", peso=" + peso + ", preco=" + preco + ", precoFinal com Imposto=" + precoFinal
				+ ", freteFinal=" + freteFinal + "]";
	}

	// MÉTODOS GETTERS AND SETTERS 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}


	public double getFreteFinal() {
		return freteFinal;
	}

	
	
	
	
	
	
	
	

}
