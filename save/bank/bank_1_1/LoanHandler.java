package bank_1_1;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class LoanHandler {
	Scanner in = new Scanner(System.in);
	double loan;
	static double rate;   //年利率
	static BigDecimal rateM;   //月利率
	static BigDecimal remoneyM;  // 月还款
	static double loanmoney;  //贷款总额
	static BigDecimal remoney;  //年还款额
	static int loanyear;      //贷款年限
	
	public LoanHandler() {
		System.out.println("请选择您需要的操作");
		System.out.println("1.查询贷款额度");
		System.out.println("2.申请贷款");
		System.out.println("3.每季还款");
	}

	
}
