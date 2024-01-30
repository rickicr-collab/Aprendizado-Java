package classes;

public class Carro {
	public String placa;
	public String modelo;
	public float velocidadeMaxima;
	
	public float MedidorVelocidade(int potencia) {
		float velocidade = potencia / 2;
		return velocidade;
		
	}

}
