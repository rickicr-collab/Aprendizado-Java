package polimorfismo.dominio;

public class Computador extends Produto {
    
    private final static double IMPOSTO_COMPUTADOR = 0.21;

    public Computador(String nome, double valor) {
	super(nome, valor);
	
    }

    @Override
    public double calcularImposto() {
	double resultado;
	resultado = this.valor  * IMPOSTO_COMPUTADOR;
	return resultado;
    }
    
   
    
    
    

}
