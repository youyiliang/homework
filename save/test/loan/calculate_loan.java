package loan;

public class calculate_loan {
	
	public static void main(String[] args) {
		calculate(10,10000 , 0.043/12);
	}
	
		public static void calculate(int year, double loan ,double rate  ) {
			double loanmoney;//期末欠款额
			double Mloan;//月还款额
			double	Mu = loan*rate * Math.pow(1+rate, year*12);
			double  Md = Math.pow(1+rate, year*12) - 1 ;
			Mloan = Mu / Md;
				for(int i = 1 ; i<= 12*year ;i++) {
					double lmu = Mloan * (Math.pow(1+rate, i)-1);
					double lmbh= loan  *Math.pow(1+rate, i);
					loanmoney =lmbh -(lmu/rate);
				
				System.out.println("第"+i+"月 ， 还款"+Mloan+"仍欠贷款"+loanmoney);
					
				}
				System.out.println("共换欠款"+Mloan*120);
		}
}
