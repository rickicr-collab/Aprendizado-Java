package enumeracao.classes;

public enum TipoCliente {
	// CONSTANT ESPECIFIC CLASS BODY
	PESSOA_FISICA(1, " Pessoa Fisica"), PESSOA_JURIDICA(2, " Pessoa Jurídica") {
		public String getID() {
			return "B";
		}
	};

	private int tipo;
	private String nomeRelatorio;

	// CONSTRUTOR
	TipoCliente(int tipo, String nomeRelatorio) {
		this.tipo = tipo;
		this.nomeRelatorio = nomeRelatorio;
	}

	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		for (TipoCliente tipoCliente : values()) {
			if (tipoCliente.getNomeRelatorio().equalsIgnoreCase(nomeRelatorio)) {
				System.out.println("Nome do relatoiro: " + tipoCliente);
				return tipoCliente;
			}
		}
		return null;

	}

	public String getID() {
		return "A";
	}

	// MÉTODO GET
	public int getTipo() {
		return this.tipo;
	}

	public String getNome() {
		return this.nomeRelatorio;

	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setNomeRelatorio(String nomeRelatorio) {
		this.nomeRelatorio = nomeRelatorio;
	}

}