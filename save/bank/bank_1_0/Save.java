package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Save {
	Scanner in = new Scanner(System.in);
	private double savemoney;
	
	public void save(Account acc , List<Account> accs) {
		System.out.println("请输入存款额：");
		savemoney = in.nextDouble();
		acc.getMoney().setDeposit(savemoney);
		System.out.println(acc.toString());
		System.out.println("已经向，电话"+acc.getPerson().getPhone()+"发送凭条");
	}
	

}
