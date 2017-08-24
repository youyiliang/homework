package hmwk0809;
import  java.util.*;

public class student_test {
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("请输入姓名");
		student s1 = new student(in.next(),in.nextInt(),in.nextInt());
		System.out.println("请输入姓名");
		student s2 = new student(in.next(),in.nextInt(),in.nextInt());
		System.out.println("请输入姓名");
		student s3 = new student(in.next(),in.nextInt(),in.nextInt());
		
		
		student[] st=new student[] {s1,s2,s3};
		
		s1.scort(st);
	}
		
		
		
}
