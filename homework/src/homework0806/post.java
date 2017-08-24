package homework0806;
import java.util.*;
public class post {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入 ");
		int  x= in.nextInt();
		if(x>=5000) {
			System.out.println("邮寄费为50");
		}
		if(x<5000 && x>=100) {
			System.out.println("邮寄费为"+ x*0.01);
		}
		if(x<100) {
			System.out.println("邮寄费为1");
		}
	}

}
