package indexs;

import java.util.List;
import java.util.Scanner;

import bank.Account;
import bank.Person;

public class Register {
		Scanner in = new Scanner(System.in);
	public void register(List<Account> p) {
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
	}
}
