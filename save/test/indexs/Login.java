package indexs;

import java.util.List;
import java.util.Scanner;

import bank.Account;
import constant.randomnumber;


public class Login {
	Scanner in = new Scanner(System.in);
	LoginCheck logincheck = new LoginCheck();
	Indexs welcome  =  new Indexs();
	randomnumber random = new randomnumber();

	public void login(List<Account> p) {
		System.out.print("�������˺�");
		String Bid = in.next();
		System.out.print("����������");
		String Bpass = in.next();
		System.out.print("��������֤��");
		
		int rand = random.random();
		System.out.print(rand);
		
		if(rand == in.nextInt())
		logincheck.check(p, Bid, Bpass);
		else {
			System.out.print("��֤���������������");
			welcome.welcome( p);
		}
	}

}
