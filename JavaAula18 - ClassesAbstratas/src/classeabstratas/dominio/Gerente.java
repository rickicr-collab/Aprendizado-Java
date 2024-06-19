package classeabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
	super(nome, salario);

    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Gerente [nome=");
	builder.append(nome);
	builder.append(", salario=");
	builder.append(salario);
	builder.append("]");
	return builder.toString();
    }
    
    public double calcularBonus() {
	double bonus = 0.05;
	this.salario = this.salario + (this.salario * bonus);
	System.out.println("Calculo do Bonus para Gerente: " + this.salario);
	return salario;
	
	
    }
    
   
  
}
