package indexs;

import java.util.List;
import java.util.Scanner;

import bank.Account;
import bank.Person;

public class Register {
		Scanner in = new Scanner(System.in);
	public void register(List<Account> p) {
		System.out.print("����������");
		String newName = in.next();
		System.out.print("���������֤��");
		String newID = in.next();
		System.out.print("������绰");
		String newPhone = in.next();
		System.out.print("�������Ա�");
		int  newSex = in.nextInt();
		Person  px = new Person(newName , newID, newPhone , newSex);
		
		System.out.print("�������˺�");
		String newBid = in.next();
		System.out.print("����������");
		String newBpass = in.next();
		Account acc = new Account(px, newBid, newBpass);
		
		p.add(acc);
	}
}
