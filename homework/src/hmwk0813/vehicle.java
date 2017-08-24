package hmwk0813;

public class vehicle {
	private String brand;
	private String color;
	private double speed;
	
	public vehicle() {
		
	}
	public vehicle(String brand,String color) {
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}
	
	public void run( ) {
		
		System.out.println(getBrand()+"ËÙ¶ÈÎª"+getSpeed());
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
}
