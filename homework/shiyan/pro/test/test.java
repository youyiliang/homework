package pro.test;

import pro.Emp;
import pro.person;
import pro.proinfo;
import pro.addremove;
public class test {
	public static void main(String[] args) {
		
		proinfo proinfo = new proinfo();
		proinfo.set(20170809, "八组科技", "西八道", "东软人 ");
		
		person emp_1=new person();
		emp_1.setAge(50);
		emp_1.setEmail("boss@neusoft.com");
		emp_1.setName("bosisi");
		emp_1.setAdd("老中街12号");
		emp_1.setPhone("13303892938");
		
		Emp emp1=new Emp();
		emp1.setInfo(emp_1);
		emp1.setSalary(10000);
		emp1.setDepart("销售部");
		emp1.setSalary_mod(10000);
		
		System.out.print(emp_1.getName()+"的工资为"+emp1.getSalary_mod());
		
		
	}
	

}
