package domain;

public class Car {
	
	private String name = "Audi";
	private String color;
	private int year;
	
	
	public Car(String color, int year) {
		super();
		this.color = color;
		this.year = year;
	}
	
	


	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public String getColor() {
		return color;
	}








	public void setColor(String color) {
		this.color = color;
	}








	public int getYear() {
		return year;
	}








	public void setYear(int year) {
		this.year = year;
	}








	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [name=");
		builder.append(name);
		builder.append(", color=");
		builder.append(color);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}



	
	
	
	
	

}
