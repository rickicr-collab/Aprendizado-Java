package classeabstratas.dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
	super(nome, salario);
	
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Desenvolvedor [nome=");
	builder.append(nome);
	builder.append(", salario=");
	builder.append(salario);
	builder.append("]");
	return builder.toString();
    }
    
    public double calcularBonus() {
	double bonus = 0.1;
	this.salario = this.salario + (this.salario * bonus);
	System.out.println("Calculo do Bonus para Desenvolvedor: " + this.salario);
	return salario;
    }
    
    
    
    
    

}
