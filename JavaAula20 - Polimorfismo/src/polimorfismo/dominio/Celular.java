package polimorfismo.dominio;

public class Celular extends Produto {
    
    private final static double IMPOSTO_CELULAR = 0.11;
    private String dataFabricacao;

    public Celular(String nome, double valor) {
	super(nome, valor);
	
    }

    @Override
    public double calcularImposto() {
	double resultado;
	resultado = valor  * IMPOSTO_CELULAR;
	return resultado;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    
    
    
    
    

}
