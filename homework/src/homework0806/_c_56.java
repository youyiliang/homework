package homework0806;
import java.util.*;
public class _c_56 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a%5==0&&a%6==0) {
			System.out.print("该数字能被5，6，整除");
		}if(a%5==0&&a%6!=0) {
			System.out.print("该数字能被5整除");
		}if(a%5!=0&&a%6==0) {
			System.out.print("该数字能被6整除");
		}else {
			System.out.print("该数字不能被5、6整除");
		}
				
		
	}
		

}
