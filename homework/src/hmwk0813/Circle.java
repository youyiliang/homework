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
		System.out.print("�����"+getArea()+"�ܳ���"+getPer()+"y��ɫ��"+color+"�뾶��"+radius);
		
	}

}
