package hmwk0809;

public class Person {
	 
	private  String name;
	private  int    age;
	private  double    height;
	
	public void sayHello() {
		System.out.println(" hello my  name is "+ name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
