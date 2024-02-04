package associacao.exercicio;

public class Local {
	private String rua;
	private String bairro;
	
	
	// CONSTRUTORES E SOBRECARGAS
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	
	public Local() {
		
	}
	
	//MÉTODOS
	public void imprimir() {
		System.out.println("------ Relatório do Local ----------" );
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	}
	
	
	//MÉTODOS GETTERS AND SETTERS
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
