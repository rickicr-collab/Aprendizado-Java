package modificadorfinal.classes;

public class Carro {
	
	
	public static final double VELOCIDADE_FINAL = 250;
	public final Comprador COMPRADOR = new Comprador();
	private String nome;
	private String marca;
	
	
	

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [COMPRADOR=");
		builder.append(COMPRADOR);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
	
	
	public final void imprimeAtributosCarros() {
		System.out.println(" ------ Imprimindo um Carro ----- ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Marca: " + this.marca);
		System.out.println("Velocidade Final: [" + Carro.VELOCIDADE_FINAL + " KM/h]");
	}
	
	
	
	public static double getVelocidadeFinal() {
		return VELOCIDADE_FINAL;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Comprador getComprador() {
		return COMPRADOR; 
	}
	
	

	
	
	
	

}
