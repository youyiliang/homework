package homework0806;
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("��������ʼ���");
			int year = in.nextInt();
			System.out.print("��������ֹ���");
			int year2 = in.nextInt();
				for(int i = year ; i<=year2;i++) {
					if(i % 400 == 0) {
						System.out.println(i);
						continue;
					}if(i % 100==0) {
						continue;
					}if(i % 4 ==0){
						System.out.println(i);
						continue;
					}
				}
			
		
	}

}
