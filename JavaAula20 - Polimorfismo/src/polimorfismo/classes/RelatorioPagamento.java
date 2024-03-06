package polimorfismo.classes;

public class RelatorioPagamento {
	public void relatorioPagamentoGerente(Gerente Gerente) {
		System.out.println("Gerando relátorio de pagamento para Gerência!");
		Gerente.calcularPagamento();
		System.out.println("Nome: " + Gerente.getNome());
		System.out.println("Salario do Mês: " + Gerente.getSalario());
		System.out.println("Cargo: " + Gerente.getCargo());
		System.out.println("Matricula : " + Gerente.getMatricula());
		System.out.println("<<<<<<Fim do Relatório>>>>>>");
	}
	
	public void relatorioPagamentoVendedor(Vendedor Vendedor) {
		System.out.println("Gerando relátorio de pagamento para Vendedores!");
		Vendedor.calcularPagamento();
		System.out.println("Nome: " + Vendedor.getNome());
		System.out.println("Salario do Mês: " + Vendedor.getSalario());
		System.out.println("Cargo : " + Vendedor.getCargo());
		System.out.println("Matricula : " + Vendedor.getMatricula());
		System.out.println("<<<<<<Fim do Relatório>>>>>>");
	}
	
	public void relatorioPagamentoGenerico(Funcionario Funcionario) {
		System.out.println("Gerando relátorio de pagamento para Funcionários!");
		Funcionario.calcularPagamento();
		System.out.println("Nome: " + Funcionario.getNome());
		System.out.println("Salario do Mês: " + Funcionario.getSalario());
		System.out.println("Cargo : " + Funcionario.getCargo());
		System.out.println("Matricula : " + Funcionario.getMatricula());
		System.out.println("<<<<<<Fim do Relatório>>>>>>");
	}
	
	

}
