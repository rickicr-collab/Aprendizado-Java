package classeabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;
    

    public Funcionario(String nome, double salario) {
	this.nome = nome;
	this.salario = salario;
	calcularBonus();
    }

    public abstract double calcularBonus();
    
    public void imprime() {
	System.out.println("Nome Funcionario: " + this.nome);
	System.out.println("Salário do Funcionario: " + this.salario);
    }

}
