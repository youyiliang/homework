package hmwk0813;

public class car extends vehicle {
	private  int loader;
	
	public car() {
		
	}
	public car(String brand,String color, int loader) {
		super(brand,color);
		this.loader = loader;
	}
	public int getLoader() {
		return loader;
	}
	public void run() {
		System.out.println("颜色是"+getColor()+"的"+getBrand()+"速度为"+getSpeed());
		
	}

	
}
