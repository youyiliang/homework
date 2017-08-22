package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Loan {
	Scanner in = new Scanner(System.in);
	double loan;
	static double rate;
	static double loanmoney;
	static double remoney;
	static int loanyear;

	public Loan() {
		System.out.println("请选择您需要的操作");
		System.out.println("1.查询贷款额度");
		System.out.println("2.申请贷款");
		System.out.println("3.每季还款");
		
		
		

	}
	
	public void loaninfo(Account acc , List<Account> accs) {
		String year = acc.getPerson().getID().substring(6, 10);
		int age = 2017-  Integer.parseInt(year);
		loan = age*1000 + acc.getMoney().getDeposit()*.8;
		acc.getMoney().setLoanamount(loan);
		
		int reyear = (80-age)/2;
		
		System.out.print("您的贷款额度为"+loan+"\n"+"您的贷款最高年限为"+reyear);
	}
	
	public void takeloan(Account acc , List<Account> accs) {
		System.out.print("请输入贷款金额");
		 loanmoney = in.nextDouble();
		if(loanmoney >acc.getMoney().getLoanamount())
			System.out.print("贷款额度不足");
		else {
			System.out.print("请输入贷款年限");
		
		 loanyear = in.nextInt();
				 
		if(loanyear >5) rate=0.049;
		else rate =0.0435;
		
		remoney = (loanmoney*loanyear*rate+loanmoney)/loanyear;
		acc.getMoney().setLoan(loanmoney);
		System.out.print("您贷款了"+loanmoney+"持续"+loanyear+"年"+"\n"
						+ "共需还款"+(loanmoney*loanyear*rate+loanmoney)+"\n"
						+ "每年还款"+ remoney );
		}
		
	}
	
	public void remoney(Account acc , List<Account> accs) {
		
		if(acc.getMoney().getDeposit() < remoney) {
			System.out.println("余额不足还款失败");
		}
		else {
			acc.getMoney().setDeposit(acc.getMoney().getDeposit() -remoney);
			acc.getMoney().setLoan(acc.getMoney().getLoan() -remoney+ loanmoney*rate );
			System.out.println("您还贷金额："+remoney+",增长了"+ loanmoney*rate+"的利息");
			System.out.println(acc.toString() );
		}
	}
	
}
