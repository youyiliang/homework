package hmwk0813;

public class Circle extends Shape {
	final double PI =3.1415;
	private double  radius;
	
	public Circle() {
		
	}
	public Circle( double  radius,String color) {
		super(color);
		this.radius= radius;
	}
	
	@Override
	public double getArea() {
		area = PI*radius*radius;
		return area;
		
	}

	@Override
	public double getPer() {
		per = 2*PI*radius;
		return per;
		
	}

	@Override
	public void shoeAll() {
		System.out.print("面积是"+getArea()+"周长是"+getPer()+"y颜色是"+color+"半径是"+radius);
		
	}

}
