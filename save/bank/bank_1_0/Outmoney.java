package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Outmoney {
	
	Scanner in = new Scanner(System.in);
	private	double outmoney;
	
	public void out(Account acc , List<Account> accs) {
		System.out.println("请输入取款额：");
		outmoney = in.nextDouble();
		if (acc.getMoney().getDeposit() >= outmoney) {
		acc.getMoney().setDeposit(acc.getMoney().getDeposit() - outmoney);
		System.out.println("已经向，电话"+acc.getPerson().getPhone()+"发送凭条");}
		else System.out.println("钱都不够，取什么取");
		System.out.println(acc.toString());
	}
	
}
