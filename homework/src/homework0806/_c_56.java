package homework0806;
import java.util.*;
public class _c_56 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a%5==0&&a%6==0) {
			System.out.print("�������ܱ�5��6������");
		}if(a%5==0&&a%6!=0) {
			System.out.print("�������ܱ�5����");
		}if(a%5!=0&&a%6==0) {
			System.out.print("�������ܱ�6����");
		}else {
			System.out.print("�����ֲ��ܱ�5��6����");
		}
				
		
	}
		

}
