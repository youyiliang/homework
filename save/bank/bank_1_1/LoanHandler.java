package bank_1_1;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class LoanHandler {
	Scanner in = new Scanner(System.in);
	double loan;
	static double rate;   //������
	static BigDecimal rateM;   //������
	static BigDecimal remoneyM;  // �»���
	static double loanmoney;  //�����ܶ�
	static BigDecimal remoney;  //�껹���
	static int loanyear;      //��������
	
	public LoanHandler() {
		System.out.println("��ѡ������Ҫ�Ĳ���");
		System.out.println("1.��ѯ������");
		System.out.println("2.�������");
		System.out.println("3.ÿ������");
	}

	
}
