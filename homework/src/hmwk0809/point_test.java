package hmwk0809;

public class point_test {
	public static void main(String[] args) {
		
		point p1= new point (23,37);
		System.out.println("点的横坐标是"+ p1.getX()+"点的纵坐标是"+p1.getY());
		
		p1.move(13, 13);
		System.out.print("点的横坐标是"+ p1.getX()+"点的纵坐标是"+p1.getY());
				
	}
}
