package homework0806;
import java.util.*;
public class flip {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int a,b,c,d,z;
			a=x/1000;
			b=x/100%10;
			c=x/10%10;
			d=x%10;
			z=d*1000+c*100+b*10+a;
			System.out.print(z);

					

	}

}
