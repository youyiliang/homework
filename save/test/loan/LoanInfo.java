package loan;

import java.util.List;

import bank.Account;

public class LoanInfo  extends LoanHandler{
	
	public void loaninfo(Account acc , List<Account> accs) {
		String year = acc.getPerson().getID().substring(6, 10);
		int age = 2017-  Integer.parseInt(year);
		loan = age*1000 + acc.getMoney().getDeposit()*.8;
		acc.getMoney().setLoanamount(loan);
		
		int reyear = (80-age)/2;
		
		System.out.print("���Ĵ�����Ϊ"+loan+"\n"+"���Ĵ����������Ϊ"+reyear);
	}
	
}
