package homework0806;
import java.util.*;
public class prt_num {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("«Î ‰»Î ");
		int  x= in.nextInt();
		int a,b,c,d;
		if( x<9999 && x >= 1000 ) {
			a=x/1000;
			b=x/100%10;
			c=x/10%10;
			d=x%10;
			System.out.print(a+","+b+","+c+","+d);
		}
		if(x < 999 && x>=100) {
			b=x/100;
			c=x/10%10;
			d=x%10;
			System.out.print(b+","+c+","+d);
		}
		if(x < 99 && x >= 10) {
			c=x/10%10;
			d=x%10;
			System.out.print(c+","+d);
		}	
		if(x < 9 && x >= 1) {
			d=x%10;
			System.out.print(d);
		}
					
	}

}
