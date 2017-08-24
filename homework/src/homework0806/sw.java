package homework0806;
import java.util.*;
public class sw {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("«Î ‰»Î ");
		int  x= in.nextInt();
		switch(x) {
			case 1 :
				System.out.print("1");
				break;
			case 5 :
				System.out.print("5");
				break;
			case 10 :
				System.out.print("10");
				break;
			default :
				System.out.print("x=none");
				break;
		}

	}
}
