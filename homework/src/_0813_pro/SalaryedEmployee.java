package _0813_pro;

public class SalaryedEmployee extends ColaEmployee {

	private int monthly;
		
	public SalaryedEmployee(String name, int birth,int monthly) {
		super(name, birth);
		this.monthly = monthly;
	}

	public int getMonthly() {
		return monthly;
	}
	
	
}
