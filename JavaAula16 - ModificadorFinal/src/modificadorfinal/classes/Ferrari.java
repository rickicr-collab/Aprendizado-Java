package modificadorfinal.classes;

public class Ferrari extends Carro {
	private String modelo;
	private String cor;
	private String opcionais;
	
	public void impressaoAtributosAdicionais() {
		super.imprimeAtributosCarros();
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor Aplicada: " + this.cor);
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ferrari [ Nome = ");
		builder.append(getNome());
		builder.append(", Marca = ");
		builder.append(getMarca());
		builder.append(", Modelo = ");
		builder.append(modelo);
		builder.append(", Cor = ");
		builder.append(cor);
		builder.append(", Opcionais = ");
		builder.append(opcionais);
		builder.append("]");
		return builder.toString();
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getOpcionais() {
		return opcionais;
	}



	public void setOpcionais(String opcionais) {
		this.opcionais = opcionais;
	}
	
	
	
	
	

}
