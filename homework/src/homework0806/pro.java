package homework0806;

public class pro {

	public static void main(String[] args) {
		double money = 19;
		double wage = 0 ;
			if(money <=10) {
				wage = money * 0.1;
			}if(money > 10 && money <=20 ) {
				wage=10 * 0.1 + (money -10)*0.075;
			}if(money > 20 && money <=40 ) {
				wage=10 * 0.1 + 10*0.075 + (money -20)*0.05;
			}if(money > 40 && money <=60 ) {
				wage=10 * 0.1 + 10*0.075 + 20*0.05 + (money -40)*0.03;
			}if(money > 60 && money <=100 ) {
				wage=10 * 0.1 + 10*0.075 +20*0.05 +20 *0.03 + (money -60)*0.015;
			}if(money >100 ) {
				wage=10 * 0.1 + 10*0.075 +20*0.05 +20 *0.03+ 40 *0.015 + (money -100)*0.01;
			}
			System.out.print(wage);
		}

	}


