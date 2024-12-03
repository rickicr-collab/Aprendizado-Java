package colecoes.colecoesatualizado.equals;

public class Smartphone {
	private String serialNumber;
	private String marca;
	
	
	public Smartphone(String serialNumber, String marca) {
		super();
		this.serialNumber = serialNumber;
		this.marca = marca;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	

}
