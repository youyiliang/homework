package homework0806;

public class wage {

	public static void main(String[] args) {
		double money=30000;
		double wage = 0;
		for (int i = 0; i < 10; i++) {
			money=money*(1+0.06);
			wage = wage + money;
		}
		System.out.println(money);
		System.out.print(wage);
	}

}
