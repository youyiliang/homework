package loan;

import java.util.List;

import bank.Account;

public class Remoney extends LoanHandler{
	
	public void remoney(Account acc , List<Account> accs) {
		
		if(acc.getMoney().getDeposit() < remoney.doubleValue()) {
			System.out.println("余额不足还款失败");
		}
		else {
			acc.getMoney().setDeposit(acc.getMoney().getDeposit() -remoney.doubleValue());
			acc.getMoney().setLoan(acc.getMoney().getLoan() -remoney.doubleValue()+ loanmoney*rate );
			System.out.println("您还贷金额："+remoney+",增长了"+ loanmoney*rate+"的利息");
			System.out.println(acc.toString() );
		}
	}
}
