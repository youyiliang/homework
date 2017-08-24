package homework0806;

import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fac = 1 ;
		System.out.print("输入任意数字");
		int   x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			fac = fac * i;
		}
		System.out.print(fac);
	}

}
