package homework0806;
import java.util.*;
public class post {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ ");
		int  x= in.nextInt();
		if(x>=5000) {
			System.out.println("�ʼķ�Ϊ50");
		}
		if(x<5000 && x>=100) {
			System.out.println("�ʼķ�Ϊ"+ x*0.01);
		}
		if(x<100) {
			System.out.println("�ʼķ�Ϊ1");
		}
	}

}
