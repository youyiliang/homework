package _0813_pro;

public class Company {
		private double salary;
		
		public void showSalary(HourlyEmployee h1,int month ) {
			if(h1.getHour() > 160)
			salary = (h1.getHour() - 160)*h1.getHourly()*1.5+160*h1.getHourly()+h1.getSalary(month);
			else  salary = h1.getHour()*h1.getHourly()+h1.getSalary(month);
			
			System.out.println(h1.getName()+"第"+ month+"月的工资是"+salary);
		}
		
		public void showSalary(SalaryedEmployee h1,int month ) {
			salary = h1.getMonthly()+h1.getSalary(month);			
			System.out.println(h1.getName()+"第"+ month+"月的工资是"+salary);
		}
		public void showSalary(SalesEmployee h1,int month ) {
			salary = h1.getSales()*h1.getRate()+h1.getSalary(month);			
			System.out.println(h1.getName()+"第"+ month+"月的工资是"+salary);
		}
}
