package bank_1_1;

import java.util.ArrayList;
import java.util.List;

public class LoginCheck {
	
	static int  errn=1;
	private TakeMoney take = new TakeMoney(); 
	Account account = new Account();
	List<Account> accs = new ArrayList<>();
	
	public void check(List<Account> p , String BID , String password ) {
		int i=0;
		accs = p;
		for (Account acc : p) {
			
			if(acc.getBID().equals(BID) &&  acc.getPassword().equals(password)) {
				System.out.println("����������˻���ȷ����ӭ");
				i=1;
				account = acc;
				take.take(account,accs);
				break;
			}
		}
		if(errn==3) {
			System.out.println("��������������Σ�ϵͳ���˳�");
			return ;
		}
		
		if(i!=1) {
			Indexs wc = new Indexs();
			System.out.println("error");
//			check(p, BID, password);
			errn ++;
			wc.welcome(accs);
			
		}
		
		
	}

	

	
	
	
	
}
