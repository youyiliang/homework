package hmwk0813;

public class Players {
	private static int sum;
	
	
	private  Players() {
		
	}
	public  static  Players create() {
		sum = 1;
		Players p =null;
		while(sum <= 11) {
			p = new Players();
			sum++;
			System.out.println("������һ������");
		}
		System.out.println("�Բ����Ѿ�������11������");
		
		return p ;
	}
}
