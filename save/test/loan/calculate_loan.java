package loan;

public class calculate_loan {
	
	public static void main(String[] args) {
		calculate(10,10000 , 0.043/12);
	}
	
		public static void calculate(int year, double loan ,double rate  ) {
			double loanmoney;//��ĩǷ���
			double Mloan;//�»����
			double	Mu = loan*rate * Math.pow(1+rate, year*12);
			double  Md = Math.pow(1+rate, year*12) - 1 ;
			Mloan = Mu / Md;
				for(int i = 1 ; i<= 12*year ;i++) {
					double lmu = Mloan * (Math.pow(1+rate, i)-1);
					double lmbh= loan  *Math.pow(1+rate, i);
					loanmoney =lmbh -(lmu/rate);
				
				System.out.println("��"+i+"�� �� ����"+Mloan+"��Ƿ����"+loanmoney);
					
				}
				System.out.println("����Ƿ��"+Mloan*120);
		}
}
