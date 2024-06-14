package modificadorfinal.classes;



public class Comprador {
	

	private String nome;
	private String marca;
	
	
	//METODO TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comprador [nome=");
		builder.append(nome);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}


	
	//METODO GETTER AND SETTER
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	

	
	
	
	
	

}
