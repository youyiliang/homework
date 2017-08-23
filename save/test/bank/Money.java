package bank;

public class Money {
	
	private double deposit;
	private double loan;
	private double loanamount;

	
	public Money(double deposit,double loan) {
		this.deposit=deposit;
		this.loan = loan;
	}
	
	public void setLoan(double loan) {
		this.loan = loan;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getDeposit() {
		return deposit;
	}
	public double getLoan() {
		return loan;
	}
	

	public double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}

	@Override
	public String toString() {
		return "[´æ¿î:" + deposit + "´û¿î£º" + loan + "]";
	}
	
	
	
}
