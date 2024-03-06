package polimorfismo.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;
	
	
	
	// CONSTRUTOR
	public Vendedor(String nome, double salario, String cargo, String matricula, double totalVendas) {
		super(nome, salario, cargo, matricula);
		this.totalVendas = totalVendas;
	}
	
	
	@Override
	public void calcularPagamento() {
		this.salario = this.salario + (totalVendas * 0.05);
	}



	// GETTERS AND SETTERS 
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	
	

}
