package homework0806;

public class bank {

	public static void main(String[] args) {
		double money=10000;
		for (int i = 0; i < 6; i++) {
			money=money*(1+0.03);
			
		}
		System.out.print(money);
	}

}
