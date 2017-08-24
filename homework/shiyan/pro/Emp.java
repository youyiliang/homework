package pro;

public class Emp {
	private proinfo proinfo;
	
	 private person info;
	 
	 private double salary;
	 private String depart;
	 
	private double salary_mod;
	 
	 private Emp superior;
	 private Emp[] lower;
	 
//	 private  pro;
	 
	 public void sayinfo() {
			
//			System.out.print();
			
		}

	 public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public double getSalary_mod() {
		
		salary_mod=salary_mod*0.18 + salary;
		
		return salary_mod;
	}
	public void setSalary_mod(double salary_mod) {
		this.salary_mod = salary_mod;
	}
	 
	public person getInfo() {
		return info;
	}
	public void setInfo(person info) {
		this.info = info;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp getSuperior() {
		return superior;
	}
	public void setSuperior(Emp superior) {
		this.superior = superior;
	}
	public Emp[] getLower() {
		return lower;
	}
	public void setLower(Emp[] lower) {
		this.lower = lower;
	}
	 
	 
	
		
}
