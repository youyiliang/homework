package hmwk0809;

public class point_test {
	public static void main(String[] args) {
		
		point p1= new point (23,37);
		System.out.println("��ĺ�������"+ p1.getX()+"�����������"+p1.getY());
		
		p1.move(13, 13);
		System.out.print("��ĺ�������"+ p1.getX()+"�����������"+p1.getY());
				
	}
}
