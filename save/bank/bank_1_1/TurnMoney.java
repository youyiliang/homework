package bank_1_1;
	
import java.util.List;
import java.util.Scanner;
	
	public class TurnMoney {
		Scanner in = new Scanner(System.in);
		private double turnmoney;
		private String turnID;
		
		public void turn(Account acc , List<Account> accs) {
			System.out.println("������ת���˻���");
			turnID = in.next();
			int i=0;
			for (Account turnacc : accs) {
				if(turnacc.getBID().equals(turnID)) {
					
					System.out.print("������ת�˽�");
					turnmoney = in.nextDouble();
					if (acc.getMoney().getDeposit() >= turnmoney) {
						acc.getMoney().setDeposit(acc.getMoney().getDeposit()- turnmoney);
						turnacc.getMoney().setDeposit(turnacc.getMoney().getDeposit() + turnmoney);
						System.out.println(acc.toString());
						System.out.println("�Ѿ��򣬵绰"+acc.getPerson().getPhone()+"����ƾ��");
					}
					else System.out.println("Ǯ��������תʲôת");
					i=1;
					break;
				}
			}
			if(i==0)
					System.out.println("��������˻�������");	
		}
					
		
	}
