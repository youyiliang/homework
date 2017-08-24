package _0813_pro;

public class ColaEmployee {
	 private String name;
	 private int   birth;
	 
	 public ColaEmployee(String name, int birth) {
		 this.name = name;
		 this.birth = birth;
	 }
	 public int getSalary(int month) {
		 if(month==birth)return 100;
		 else  return 0;
	 }
	public String getName() {
		return name;
	}
	public int getBirth() {
		return birth;
	}
	 
}
