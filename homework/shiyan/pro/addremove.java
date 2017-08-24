package pro;

import java.util.*;

public class addremove {
	private Emp[] emp;
	
	
	
	public void addEmp(Emp emp,person per) {
		Scanner in= new Scanner(System.in);
		System.out.println("«Î ‰»Î ˝æ›");
		per.setName(in.nextLine());
		per.setAge(in.nextInt());
		emp.setInfo(per);
		
		
		 
		
	}
	
	public void removeEmp() {
		
		
		
	}

}
