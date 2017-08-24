package hmwk0813;

public class Rectangle extends Shape {
	private double Width;
	private double Height;
	
	public Rectangle() {
		
	}
	public Rectangle(double width, double height ,String color) {
		super(color);
		Width = width;
		Height = height;
		
	}
	
	@Override
	public double getArea() {
		area =Width *Height;
		return area;
	}

	@Override
	public double getPer() {
		per = 2*(Width+Height);
				return per;
	}

	@Override
	public void shoeAll() {
		System.out.print("面积是"+getArea()+"周长是"+getPer()+"颜色是"+color+"长是"+Width+"宽是"+Height);
		
	}
	
	
}
