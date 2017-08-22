package bank_0_1;

import java.util.List;
import java.util.Scanner;

public class TakeMoney {
		Scanner in = new Scanner(System.in);
		int out;
		
		public void take(Account acc , List<Account> accs) {
			
			System.out.println("请选择下列功能");
			
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.转款");
			System.out.println("4.查看账户信息");
			System.out.println("5.修改信息");
			System.out.println("6.返回主界面");
			int choice = in.nextInt();
			
			switch (choice) {
			case 1:
				double savemoney;
				System.out.println("请输入存款额：");
				savemoney = in.nextDouble();
				acc.getMoney().setDeposit(savemoney);
				System.out.println(acc.toString());
				System.out.println("已经向，电话"+acc.getPerson().getPhone()+"发送凭条");
				out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
			case 2:
				double outmoney;
				System.out.println("请输入取款额：");
				outmoney = in.nextDouble();
				if (acc.getMoney().getDeposit() >= outmoney) {
				acc.getMoney().setDeposit(acc.getMoney().getDeposit() - outmoney);
				System.out.println("已经向，电话"+acc.getPerson().getPhone()+"发送凭条");}
				else System.out.println("钱都不够，取什么取");
				System.out.println(acc.toString());

				
				out= in.nextInt();	
				if(out==1)
						take(acc,accs);
				
				break;	
			case 3:
				
				double turnmoney;
				String turnID;
				
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
				
				out= in.nextInt();	
				if(out==1)
				take(acc,accs);
				break;
			case 4:
				System.out.println(acc.toString());
				out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;

			case 5:
				System.out.println("请输入要修改的信息");
				System.out.println("1.修改姓名");
				System.out.println("2.修电话");
				System.out.println("3.修改密码");
				int change = in . nextInt();
				switch(change) {
				case 1 :
					System.out.println("请输入修改后的姓名");
					String name = in.next();
					acc.getPerson().setName(name);
					out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
				case 2:
					System.out.println("请输入修改后的电话");
					String phone = in.next();
					acc.getPerson().setPhone( phone);
					out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
				case 3:
					System.out.println("请输入修改后的密码");
					String password = in.next();
					acc.setPassword(password);
					out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
				}
				break;

			case 6:
				Indexs wc = new Indexs();
				wc.welcome(accs);
				break;
			}
			
		}

}
