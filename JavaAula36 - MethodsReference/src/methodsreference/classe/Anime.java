package methodsreference.classe;

public class Anime {
	
	private String titlle;
	private int epsodies;
	
	
	
	public Anime(String titlle, int episodies) {
		super();
		this.titlle = titlle;
		this.epsodies = episodies;
	}



	public String getTitlle() {
		return titlle;
	}



	public int getEpsodies() {
		return epsodies;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Anime [titlle=");
		builder.append(titlle);
		builder.append(", quantity=");
		builder.append(epsodies);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
