package colecoes.colecoesatualizado.hashcode;

public class SmartPhone {
	
	private String serialNumber;
	private String nome;
	
	
	
	public SmartPhone(String serialNumber, String nome) {
		super();
		this.serialNumber = serialNumber;
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass())return false;
		SmartPhone smartphone = (SmartPhone) obj;
		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
	}

	@Override
	public int hashCode() {
		return serialNumber != null ? this.serialNumber.hashCode():0;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
