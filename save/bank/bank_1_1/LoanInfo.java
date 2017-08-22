package bank_1_1;

import java.util.List;

public class LoanInfo  extends LoanHandler{
	
	public void loaninfo(Account acc , List<Account> accs) {
		String year = acc.getPerson().getID().substring(6, 10);
		int age = 2017-  Integer.parseInt(year);
		loan = age*1000 + acc.getMoney().getDeposit()*.8;
		acc.getMoney().setLoanamount(loan);
		
		int reyear = (80-age)/2;
		
		System.out.print("您的贷款额度为"+loan+"\n"+"您的贷款最高年限为"+reyear);
	}
	
}
