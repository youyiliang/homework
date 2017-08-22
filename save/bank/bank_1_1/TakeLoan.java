package bank_1_1;

import java.math.BigDecimal;
import java.util.List;

public class TakeLoan extends LoanHandler {
	
	public void takeloan(Account acc , List<Account> accs) {
		System.out.print("�����������");
		 loanmoney = in.nextDouble();
		if(loanmoney >acc.getMoney().getLoanamount())
			System.out.print("�����Ȳ���");
		else {
			System.out.print("�������������");
		
		 loanyear = in.nextInt();
				 
		if(loanyear >5) rate = RateConstant.rate_5year;
		if(loanyear <5 && loanyear > 1) rate = RateConstant.rate_1_5year;
		if(loanyear <1) rate = RateConstant.rate_1year;
		
		BigDecimal ratem =new BigDecimal(rate/12);
		rateM = ratem.setScale(12, BigDecimal.ROUND_HALF_UP);
		
		double remoney1 = (loanmoney*loanyear*rate+loanmoney)/loanyear;
		BigDecimal re =new BigDecimal(remoney1); 
		remoney = re.setScale(2, BigDecimal.ROUND_HALF_UP);
		
		BigDecimal reloan = new BigDecimal(remoney1/12);
		remoneyM = reloan.setScale(2, BigDecimal.ROUND_HALF_UP);
		
		acc.getMoney().setLoan(acc.getMoney().getLoan()+loanmoney);
		System.out.print("�������� "+loanmoney+"\n"
						+"���� "+loanyear+" ��"+"���� "+loanyear*12 +" ��"+"\n"
						+"�������ʣ�������Ϊ "+rate+" ������Ϊ " +rateM +"\n"
						+ "���軹�� "+(loanmoney*loanyear*rate+loanmoney)+"\n"
						+ "ÿ�껹�� "+ remoney+"ÿ�ڻ���"+ remoneyM );
		}
		
	}
}
