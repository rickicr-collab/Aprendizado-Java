package modificadorestatico.domain;

public class CarroLimitador {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;

	public CarroLimitador() {
	}

	public CarroLimitador(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;

	}

	public void imprime() {
		System.out.println("<<<< Dados do carro na tela >>>> ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite: " + CarroLimitador.velocidadeLimite);
		System.out.println("-------------------------------------------");
	}

	public String getNome() {
		return nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		CarroLimitador.velocidadeLimite = velocidadeLimite;
	}

}
