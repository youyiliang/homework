package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Outmoney {
	
	Scanner in = new Scanner(System.in);
	private	double outmoney;
	
	public void out(Account acc , List<Account> accs) {
		System.out.println("������ȡ��");
		outmoney = in.nextDouble();
		if (acc.getMoney().getDeposit() >= outmoney) {
		acc.getMoney().setDeposit(acc.getMoney().getDeposit() - outmoney);
		System.out.println("�Ѿ��򣬵绰"+acc.getPerson().getPhone()+"����ƾ��");}
		else System.out.println("Ǯ��������ȡʲôȡ");
		System.out.println(acc.toString());
	}
	
}
