package polimorfismo.dominio;

public class Televisao extends Produto {
    
    private final static double IMPOSTO_TELEVISÂO = 0.15;
    

    public Televisao(String nome, double valor) {
	super(nome, valor);
	
    }

    @Override
    public double calcularImposto() {
	double resultado;
	resultado = this.valor  * IMPOSTO_TELEVISÂO;
	return resultado;
	
    }

    public static double getImpostoTelevisâo() {
        return IMPOSTO_TELEVISÂO;
    }
    
    
    
    
    
    

}
