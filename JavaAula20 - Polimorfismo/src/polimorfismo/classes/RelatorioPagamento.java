package polimorfismo.classes;

public class RelatorioPagamento {
	
	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relátorio de pagamento para Funcionários!");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario do Mês: " + funcionario.getSalario());
		System.out.println("Cargo : " + funcionario.getCargo());
		System.out.println("Matricula : " + funcionario.getMatricula());
		if(funcionario instanceof Gerente) {			
			System.out.println("Participação nos lucros : " + ((Gerente) funcionario).getPnl());
		}
		if(funcionario instanceof Vendedor) {
			System.out.println("Total de Vendas : " + ((Vendedor) funcionario).getTotalVendas());
		}
		System.out.println("<<<<<<Fim do Relatório>>>>>>");
	}
	
	

}
