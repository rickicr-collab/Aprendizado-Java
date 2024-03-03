package interfaces.classe;

/*
 * INTERFACES PARTE 01
 * 
 * OBS: INTERFACES SÃO UMA ESPECIE DE CONTRATO QUE DIZ O QUE 
 * A CLASSE DEVE FAZER MAIS NÃO COMO FAZER.
 * OBS2: UMA INTERFACE É UMA CLASSE TOTALMENTE ABSTRATA E NÃO SE PODE TER
 * MÉTODOS CONCRETOS DENTRO DE UMA INTERFACE.
 * OBS3: UTILIZAMOS INTERFACE COMO UMA ESPECIE DE COMUNICAÇÃO ENTRE CLASSES.
 * OBS4: SEMPRE QUE POSSIVEL EMBORA NÃO SEJA UMA REGRA CRIE NOME DE INTERFAÇES 
 * COM TERMINAÇÃO EM ADVERBIO CASO ISSO NÃO SEJA POSSIVEL UTILIZE UM I MAIUSCULO
 * INICIAL NO NOME.
 * OBS5: EM INTERFACES ELAS SÃO IMPLEMENTADAS E NÃO EXTENDIDAS COMO AS HERANÇAS.
 * OBS6: UMA INTERFACE PODE TER ATRIBUTOS MAIS ELES SÓ PODEM SER CONSTANTES.
 * 
 * INTERFACES PARTE 02
 * OBS7: AO REALIZAR SOBREESCRITA DE MÉTODOS CASO O MÉTODO SEJA IMPLEMENTADO DEFAULT
 * NA INTERFACE , AO SOBREESCREVELO NA CLASSE É NECESSARIO COLOCAR O MODIFICADOR PUBLICO 
 * CASO CONTRARIO IRÁ GERAR UM ERRO DE COMPILAÇÃO DEVIDO A SOBREESCRITA INCORRETA.
 * OBS8: INTERFACE NÃO SE PODE CRIAR UM OBJETO PARA REFERENCIAR E INSTANCIAR -POIS 
 * INTERFACES NÃO SÃO INSTANCIADAS.
 * 
 * 
 */

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
