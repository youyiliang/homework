package bank_1_1;

import java.util.List;

public class Remoney extends LoanHandler{
	
	public void remoney(Account acc , List<Account> accs) {
		
		if(acc.getMoney().getDeposit() < remoney.doubleValue()) {
			System.out.println("���㻹��ʧ��");
		}
		else {
			acc.getMoney().setDeposit(acc.getMoney().getDeposit() -remoney.doubleValue());
			acc.getMoney().setLoan(acc.getMoney().getLoan() -remoney.doubleValue()+ loanmoney*rate );
			System.out.println("��������"+remoney+",������"+ loanmoney*rate+"����Ϣ");
			System.out.println(acc.toString() );
		}
	}
}
