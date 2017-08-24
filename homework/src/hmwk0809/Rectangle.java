package hmwk0809;

public class Rectangle {
	private double length;
	private double width;
	
	public void getArea() {
		double result ;
		result=length*width;
		System.out.println(result);
	}
	public void getPer() {
		double result ;
		result=(length+width)*2;
		System.out.println(result);
	}
	public void showAll() {
		double result ;
		result=(length+width)*2;
		System.out.print(length);
		System.out.print(width);
		System.out.print(result);
	}
	
	public void rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	

}
