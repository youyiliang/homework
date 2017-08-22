package bank_1_1;
	
import java.util.List;
import java.util.Scanner;
	
	public class TurnMoney {
		Scanner in = new Scanner(System.in);
		private double turnmoney;
		private String turnID;
		
		public void turn(Account acc , List<Account> accs) {
			System.out.println("请输入转账账户：");
			turnID = in.next();
			int i=0;
			for (Account turnacc : accs) {
				if(turnacc.getBID().equals(turnID)) {
					
					System.out.print("请输入转账金额：");
					turnmoney = in.nextDouble();
					if (acc.getMoney().getDeposit() >= turnmoney) {
						acc.getMoney().setDeposit(acc.getMoney().getDeposit()- turnmoney);
						turnacc.getMoney().setDeposit(turnacc.getMoney().getDeposit() + turnmoney);
						System.out.println(acc.toString());
						System.out.println("已经向，电话"+acc.getPerson().getPhone()+"发送凭条");
					}
					else System.out.println("钱都不够，转什么转");
					i=1;
					break;
				}
			}
			if(i==0)
					System.out.println("您输入的账户不存在");	
		}
					
		
	}
