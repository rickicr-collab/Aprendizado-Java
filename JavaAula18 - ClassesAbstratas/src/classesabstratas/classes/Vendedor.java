package classesabstratas.classes;

public class Vendedor extends Funcionario{
	
	
	private double totalVendas;
	
	

	
	// CONSTRUTOR 
	public Vendedor() {
		
	}

	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
		
		
	}
	
	
	
	//SOBRECARGA
	public void calcularSalario() {
		this.salario = salario + (totalVendas * 0.05);
	}
	
	//GETTERS AND SETTERS 
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	

}
