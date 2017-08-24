package _0813_pro;

public class SalesEmployee extends ColaEmployee {

	private int sales;
	private double rate;
		
	public SalesEmployee(String name, int birth,int sales,double rate) {
		super(name, birth);
		this.sales = sales;
		this.rate =rate;
	}

	public int getSales() {
		return sales;
	}

	public double getRate() {
		return rate;
	}
	
	
}
