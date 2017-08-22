package bank_0_1;

public class Money {
	
	private double deposit;
	private double loan;
	

	
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

	@Override
	public String toString() {
		return "money [´æ¿î:" + deposit + "´û¿î£º" + loan + "]";
	}
	
	
	
}
