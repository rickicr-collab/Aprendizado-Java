package enumeracao.classes;

public enum TipoPagamento {
	DEBITO {

		@Override
		public double calcularDesconto(double valor, String nome) {
			double resultado;
			resultado = valor - (valor * 0.1);
			System.out.println("Nome do produto: " + nome);
			System.out.println("Valor do desconto a 10%: [" + resultado + " R$]");
			return resultado;
		}

	},
	CREDITO {

		@Override
		public double calcularDesconto(double valor, String nome) {
			double resultado;
			resultado = valor - (valor * 0.05);
			System.out.println("Nome do Produto: " + nome);
			System.out.println("Valor do desconto a 5%: [" + resultado + " R$]");
			return resultado;
		}

	};

	public abstract double calcularDesconto(double valor, String nome);

}
