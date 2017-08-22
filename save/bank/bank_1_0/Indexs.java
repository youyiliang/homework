package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Indexs {

	Scanner in = new Scanner(System.in);
	LoginCheck logincheck = new LoginCheck();
	randomnumber random = new randomnumber();
	public int welcome(List<Account> p) {
		System.out.println("欢迎光临中国银行"+'\n'+"请选择您所需的服务");
		System.out.println("1. 登录");
		System.out.println("2. 注册");
		int  choice = in.nextInt();
		switch (choice) {
		
		case 1:
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
				welcome( p);
			}
			
			break;
			
		case 2:
			System.out.print("请输入姓名");
			String newName = in.next();
			System.out.print("请输入身份证号");
			String newID = in.next();
			System.out.print("请输入电话");
			String newPhone = in.next();
			System.out.print("请输入性别");
			int  newSex = in.nextInt();
			Person  px = new Person(newName , newID, newPhone , newSex);
			
			System.out.print("请输入账号");
			String newBid = in.next();
			System.out.print("请输入密码");
			String newBpass = in.next();
			Account acc = new Account(px, newBid, newBpass);
			
			p.add(acc);
			
			int out= in.nextInt();	
			if(out==1)
				welcome(p);
			
			break;
		
		}
		return 0 ;
	}
	

}
