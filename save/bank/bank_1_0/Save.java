package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Save {
	Scanner in = new Scanner(System.in);
	private double savemoney;
	
	public void save(Account acc , List<Account> accs) {
		System.out.println("��������");
		savemoney = in.nextDouble();
		acc.getMoney().setDeposit(savemoney);
		System.out.println(acc.toString());
		System.out.println("�Ѿ��򣬵绰"+acc.getPerson().getPhone()+"����ƾ��");
	}
	

}
