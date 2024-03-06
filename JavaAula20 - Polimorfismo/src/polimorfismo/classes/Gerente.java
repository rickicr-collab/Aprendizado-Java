package polimorfismo.classes;

public class Gerente extends Funcionario {
	private double pnl;
	
	
	public Gerente(String nome, double salario, String cargo, String matricula, double pnl) {
		super(nome, salario, cargo, matricula);
		this.pnl = pnl;
	}

	
	//MÉTODOS E SOBRECARGAS 
	

	@Override
	public void calcularPagamento() {
		this.salario = this.salario + pnl;
		
	}


	//GETTERS AND SETTERS 
	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}
	
	
	
	
	

}
