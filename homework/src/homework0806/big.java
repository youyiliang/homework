package homework0806;
import java.util.*;
public class big {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();	
		int c=in.nextInt();
		int t;
		if(a<b) {
			t=a; a=b;b=t;
		}if(a<c)
		{
			t=a; a=c; c=t;
		}
		if(b<c)
		{
			t=b; b=c;c=t;
		}
		System.out.print(c+","+b+","+a);
	}
}
