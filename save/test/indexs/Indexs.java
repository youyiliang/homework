package indexs;

import java.util.List;
import java.util.Scanner;

import bank.Account;
import bank.Person;

public class Indexs {

	Scanner in = new Scanner(System.in);
	public int welcome(List<Account> p) {
		System.out.println("��ӭ�����й�����"+'\n'+"��ѡ��������ķ���");
		System.out.println("1. ��¼");
		System.out.println("2. ע��");
		int  choice = in.nextInt();
		switch (choice) {
		
		case 1:
			Login login = new Login();
			login.login(p);
			break;
			
		case 2:
			Register register = new Register();
			register.register(p);
			int out= in.nextInt();	
			if(out==1)
				welcome(p);
			break;
		
		}
		return 0 ;
	}
	

}
