package interfaces.classe;

public class Carro implements Tributavel, Transportavel {
	private String nome;
	private String marca;
	
	
	//MÉTODOS 	

	@Override
	public void calcularFrete() {
		
	}

	@Override
	public void calcularTributo() {
		
	}
	
	
	// MÉTODO GETTERS 

	public String getNome() {
		return nome;
	}

	

	public String getMarca() {
		return marca;
	}

	
	
	
	

}
