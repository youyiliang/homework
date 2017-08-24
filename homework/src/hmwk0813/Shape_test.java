package hmwk0813;

public class Shape_test {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(20,13, "red");
		Circle  c1 = new Circle(10, "blue");
		
		r1.shoeAll();
		System.out.println("-----------------");
		c1.shoeAll();
		
	}
}
