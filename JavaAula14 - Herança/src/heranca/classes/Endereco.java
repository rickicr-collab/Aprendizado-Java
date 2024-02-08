package heranca.classes;

public class Endereco {
	private String rua;
	private String bairro;
	
	
	
	
	//MÉTODO
	public void imprimir() {
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
		
	}
	

	
	
	//METODOS GETTERS AND SETTERS
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	

}
