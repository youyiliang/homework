	package bank_1_1;
	
	import java.util.List;
	import java.util.Scanner;
	
	public class Change {
		Scanner in = new Scanner(System.in);
		int out;
		TakeMoney take = new TakeMoney();
		public void change(Account acc , List<Account> accs) {
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
					take.take(acc,accs);
			break;
			case 2:
				System.out.println("�������޸ĺ�ĵ绰");
				String phone = in.next();
				acc.getPerson().setPhone( phone);
				out= in.nextInt();
				if(out==1)
					take.take(acc,accs);
			break;
			case 3:
				System.out.println("�������޸ĺ������");
				String password = in.next();
				acc.setPassword(password);
				out= in.nextInt();
				if(out==1)
					take.take(acc,accs);
			break;
			}
		
	
		}
	}
