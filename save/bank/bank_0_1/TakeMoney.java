package bank_0_1;

import java.util.List;
import java.util.Scanner;

public class TakeMoney {
		Scanner in = new Scanner(System.in);
		int out;
		
		public void take(Account acc , List<Account> accs) {
			
			System.out.println("��ѡ�����й���");
			
			System.out.println("1.���");
			System.out.println("2.ȡ��");
			System.out.println("3.ת��");
			System.out.println("4.�鿴�˻���Ϣ");
			System.out.println("5.�޸���Ϣ");
			System.out.println("6.����������");
			int choice = in.nextInt();
			
			switch (choice) {
			case 1:
				double savemoney;
				System.out.println("��������");
				savemoney = in.nextDouble();
				acc.getMoney().setDeposit(savemoney);
				System.out.println(acc.toString());
				System.out.println("�Ѿ��򣬵绰"+acc.getPerson().getPhone()+"����ƾ��");
				out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
			case 2:
				double outmoney;
				System.out.println("������ȡ��");
				outmoney = in.nextDouble();
				if (acc.getMoney().getDeposit() >= outmoney) {
				acc.getMoney().setDeposit(acc.getMoney().getDeposit() - outmoney);
				System.out.println("�Ѿ��򣬵绰"+acc.getPerson().getPhone()+"����ƾ��");}
				else System.out.println("Ǯ��������ȡʲôȡ");
				System.out.println(acc.toString());

				
				out= in.nextInt();	
				if(out==1)
						take(acc,accs);
				
				break;	
			case 3:
				
				double turnmoney;
				String turnID;
				
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
				System.out.println("������Ҫ�޸ĵ���Ϣ");
				System.out.println("1.�޸�����");
				System.out.println("2.�޵绰");
				System.out.println("3.�޸�����");
				int change = in . nextInt();
				switch(change) {
				case 1 :
					System.out.println("�������޸ĺ������");
					String name = in.next();
					acc.getPerson().setName(name);
					out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
				case 2:
					System.out.println("�������޸ĺ�ĵ绰");
					String phone = in.next();
					acc.getPerson().setPhone( phone);
					out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
				case 3:
					System.out.println("�������޸ĺ������");
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
