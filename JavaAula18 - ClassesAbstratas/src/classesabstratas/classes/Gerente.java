package classesabstratas.classes;

public class Gerente extends Funcionario{
	
	
	public Gerente() {
		super();
		
	}

	//CONSTRUTOS DA SUPERCLASSE 
	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);
		
	}
	
	
	//SOBRECARGA 
	
	public void calcularSalario() {
		this.salario = salario + (salario * 20/ 100);
	}
	
	
	
	

}
