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
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		Smartphone smartphone = (Smartphone) obj;
		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
	}
	
	




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Smartphone [serialNumber=");
		builder.append(serialNumber);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
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
