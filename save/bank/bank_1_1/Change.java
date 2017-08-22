	package bank_1_1;
	
	import java.util.List;
	import java.util.Scanner;
	
	public class Change {
		Scanner in = new Scanner(System.in);
		int out;
		TakeMoney take = new TakeMoney();
		public void change(Account acc , List<Account> accs) {
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
					take.take(acc,accs);
			break;
			case 2:
				System.out.println("请输入修改后的电话");
				String phone = in.next();
				acc.getPerson().setPhone( phone);
				out= in.nextInt();
				if(out==1)
					take.take(acc,accs);
			break;
			case 3:
				System.out.println("请输入修改后的密码");
				String password = in.next();
				acc.setPassword(password);
				out= in.nextInt();
				if(out==1)
					take.take(acc,accs);
			break;
			}
		
	
		}
	}
