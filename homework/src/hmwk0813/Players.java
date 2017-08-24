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
			System.out.println("创建了一个对象");
		}
		System.out.println("对不起，已经创建了11个对象。");
		
		return p ;
	}
}
