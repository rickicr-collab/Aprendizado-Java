package innerclassupdated.classes;

public class Barco {
	
	private String name;

	public Barco(String name) {
		super();
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Barco [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	

}
