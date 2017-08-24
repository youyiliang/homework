package hmwk0813;

public abstract class Shape {
	
	protected double area;
	protected double per;
	protected String color;
	
	public Shape() {
		
	}
	public Shape(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	public abstract double getPer();
	public abstract void shoeAll();
	
	public String getColor() {
		return color;
	}
	
	
	
}
