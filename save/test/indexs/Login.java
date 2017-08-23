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
		System.out.print("请输入账号");
		String Bid = in.next();
		System.out.print("请输入密码");
		String Bpass = in.next();
		System.out.print("请输入验证码");
		
		int rand = random.random();
		System.out.print(rand);
		
		if(rand == in.nextInt())
		logincheck.check(p, Bid, Bpass);
		else {
			System.out.print("验证码错误，请重新输入");
			welcome.welcome( p);
		}
	}

}
