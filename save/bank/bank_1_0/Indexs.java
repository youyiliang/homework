package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Indexs {

	Scanner in = new Scanner(System.in);
	LoginCheck logincheck = new LoginCheck();
	randomnumber random = new randomnumber();
	public int welcome(List<Account> p) {
		System.out.println("��ӭ�����й�����"+'\n'+"��ѡ��������ķ���");
		System.out.println("1. ��¼");
		System.out.println("2. ע��");
		int  choice = in.nextInt();
		switch (choice) {
		
		case 1:
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
				welcome( p);
			}
			
			break;
			
		case 2:
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
			
			int out= in.nextInt();	
			if(out==1)
				welcome(p);
			
			break;
		
		}
		return 0 ;
	}
	

}
