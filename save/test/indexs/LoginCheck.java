package indexs;

import java.util.ArrayList;
import java.util.List;

import bank.Account;
import console.TakeMoney;

public class LoginCheck {
	
	static int  errn=1;
	private TakeMoney take = new TakeMoney(); 

	public void check(List<Account> accs , String BID , String password ) {
		int i=0;
		for (Account acc : accs) {
			
			if(acc.getBID().equals(BID) &&  acc.getPassword().equals(password)) {
				System.out.println("����������˻���ȷ����ӭ");
				i=1;
				take.take(acc,accs);
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
