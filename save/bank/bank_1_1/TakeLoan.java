package bank_1_1;

import java.math.BigDecimal;
import java.util.List;

public class TakeLoan extends LoanHandler {
	
	public void takeloan(Account acc , List<Account> accs) {
		System.out.print("请输入贷款金额");
		 loanmoney = in.nextDouble();
		if(loanmoney >acc.getMoney().getLoanamount())
			System.out.print("贷款额度不足");
		else {
			System.out.print("请输入贷款年限");
		
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
		System.out.print("您贷款了 "+loanmoney+"\n"
						+"持续 "+loanyear+" 年"+"共计 "+loanyear*12 +" 期"+"\n"
						+"贷款利率：年利率为 "+rate+" 月利率为 " +rateM +"\n"
						+ "共需还款 "+(loanmoney*loanyear*rate+loanmoney)+"\n"
						+ "每年还款 "+ remoney+"每期还款"+ remoneyM );
		}
		
	}
}
