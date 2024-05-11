package colecoes.classe;

import java.util.Comparator;

class CelularNomeComparator implements Comparator<Celular>{

	@Override
	public int compare(Celular o1, Celular o2) {
		return o1.getIMEI().compareTo(o2.getIMEI());
	}
	
}
		
	

public class Celular {
	private String nome;
	private String IMEI;
	
	
	// COnstructor
	public Celular(String nome, String iMEI) {
		this.nome = nome;
		IMEI = iMEI;
	}
	
	@Override
	public int hashCode() {
		return IMEI != null ? IMEI.hashCode(): 1;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(this.getClass() != obj.getClass())
			return false;
		Celular outroCelular = (Celular) obj;
		return IMEI != null && IMEI.equals(outroCelular.getIMEI());
	}
	
	



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Celular [Nome=");
		builder.append(nome);
		builder.append(", IMEI=");
		builder.append(IMEI);
		builder.append("]");
		return builder.toString();
	}

	//Getter and Setter
	public String getNome() {
		return nome;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}


	

}
