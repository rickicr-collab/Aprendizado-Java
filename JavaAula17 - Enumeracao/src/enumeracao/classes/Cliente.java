package enumeracao.classes;

public class Cliente {

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	// CONSTRUTOR

	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente)  {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [Nome = ");
		builder.append(nome);
		builder.append(",\n TipoCliente = ");
		builder.append(tipoCliente);
		builder.append(",\n tipoPagamento = ");
		builder.append(tipoPagamento);
		builder.append("]");
		return builder.toString();
	}

	// METDO GETTER AND SETTERS
	public String getNome() {
		return nome;
	}

	public TipoCliente getTipo() {
		return tipoCliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
