package classesabstratas.classes;

public class Gerente extends Funcionario{
	
	
	
	
	//CONSTRUTOR
	public Gerente() {
	}

	public Gerente(String nome, String clt, double salario) {
		super(nome,clt, salario);
	}
	
	
	//SOBRECARGA 
	public void calcularSalario() {
		this.salario = salario + (salario * 20/ 100);
	}

	
	
	//MÉTODOS 
	
	@Override
	public void imprime() {
		System.out.println("Dentro do Método imprime!!");
	}
	

}
