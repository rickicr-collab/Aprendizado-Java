package modificadorfinal.classes;

/*
 * AO DECLARA UMA VARIAVEL OU ATRIBUTO DE OUTRA CLASSE COM MODIFICADOR FINAL 
 * ALGUMAS COISAS DEVEM SER OBSERVADAS:
 * OBS1: COMO A VARIAVEL É REFERENCE A OUTRA CLASSE TIPOS REFERENCE 
 * É NECESSARIO CRIAR UM NOVO OBJETO DO MESMO TIPO.
 * 
 */

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
