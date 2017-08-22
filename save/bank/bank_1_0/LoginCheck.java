package bank_1_0;

import java.util.ArrayList;
import java.util.List;

public class LoginCheck {
	
	
	private TakeMoney take = new TakeMoney(); 
	Account account = new Account();
	List<Account> accs = new ArrayList<>();
	
	public void check(List<Account> p , String BID , String password ) {
		int i=0;
		accs = p;
		for (Account acc : p) {
			
			if(acc.getBID().equals(BID) &&  acc.getPassword().equals(password)) {
				System.out.println("您所输入的账户正确，欢迎");
				i=1;
				account = acc;
				take.take(account,accs);
				break;
			}
		}
		if(i!=1) {
			Indexs wc = new Indexs();
			System.out.println("error");
//			check(p, BID, password);
			wc.welcome(accs);
		}
		
		
	}

	

	
	
	
	
}
