package bank_1_0;

import java.util.List;
import java.util.Scanner;

public class Loan {
	Scanner in = new Scanner(System.in);
	double loan;
	static double rate;
	static double loanmoney;
	static double remoney;
	static int loanyear;

	public Loan() {
		System.out.println("��ѡ������Ҫ�Ĳ���");
		System.out.println("1.��ѯ������");
		System.out.println("2.�������");
		System.out.println("3.ÿ������");
		
		
		

	}
	
	public void loaninfo(Account acc , List<Account> accs) {
		String year = acc.getPerson().getID().substring(6, 10);
		int age = 2017-  Integer.parseInt(year);
		loan = age*1000 + acc.getMoney().getDeposit()*.8;
		acc.getMoney().setLoanamount(loan);
		
		int reyear = (80-age)/2;
		
		System.out.print("���Ĵ�����Ϊ"+loan+"\n"+"���Ĵ����������Ϊ"+reyear);
	}
	
	public void takeloan(Account acc , List<Account> accs) {
		System.out.print("�����������");
		 loanmoney = in.nextDouble();
		if(loanmoney >acc.getMoney().getLoanamount())
			System.out.print("�����Ȳ���");
		else {
			System.out.print("�������������");
		
		 loanyear = in.nextInt();
				 
		if(loanyear >5) rate=0.049;
		else rate =0.0435;
		
		remoney = (loanmoney*loanyear*rate+loanmoney)/loanyear;
		acc.getMoney().setLoan(loanmoney);
		System.out.print("��������"+loanmoney+"����"+loanyear+"��"+"\n"
						+ "���軹��"+(loanmoney*loanyear*rate+loanmoney)+"\n"
						+ "ÿ�껹��"+ remoney );
		}
		
	}
	
	public void remoney(Account acc , List<Account> accs) {
		
		if(acc.getMoney().getDeposit() < remoney) {
			System.out.println("���㻹��ʧ��");
		}
		else {
			acc.getMoney().setDeposit(acc.getMoney().getDeposit() -remoney);
			acc.getMoney().setLoan(acc.getMoney().getLoan() -remoney+ loanmoney*rate );
			System.out.println("��������"+remoney+",������"+ loanmoney*rate+"����Ϣ");
			System.out.println(acc.toString() );
		}
	}
	
}
