package bank_1_1;

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
			System.out.println("6.查看贷款信息");
			System.out.println("7.返回主界面");
			int choice = in.nextInt();
			
			switch (choice) {
			case 1:
				
				Save save = new Save();
				save.save(acc, accs);
				
				out= in.nextInt();
					if(out==1)
						take(acc,accs);
				break;
			case 2:
				Outmoney out1 = new Outmoney();
				out1.out(acc, accs);
				
				out= in.nextInt();	
				if(out==1)
					take(acc,accs);break;
			case 3:
				TurnMoney turn = new TurnMoney();
				turn.turn(acc, accs);
				
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
				Change change = new Change();
				change.change(acc, accs);
	 			
				break;

			case 7:
				Indexs wc = new Indexs();
				wc.welcome(accs);
				break;
				
			case 6:
				LoanHandler loan = new LoanHandler();
				int loanch = in .nextInt();
				switch (loanch) {
			case 1:
				LoanInfo loaninfo = new LoanInfo();
				loaninfo.loaninfo(acc, accs);
				break;
			case 2:
				TakeLoan takeloan = new TakeLoan();
				takeloan.takeloan(acc, accs);
				break;
			case 3:
				Remoney re = new  Remoney();
				re.remoney(acc,accs);
				break;
				}
				out= in.nextInt();
				if(out==1)
					take(acc,accs);
			}
			
				
			
		}

}
