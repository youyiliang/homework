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
		System.out.print("�����"+getArea()+"�ܳ���"+getPer()+"��ɫ��"+color+"����"+Width+"����"+Height);
		
	}
	
	
}
