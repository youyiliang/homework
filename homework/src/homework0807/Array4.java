package homework0807;

public class Array4 {

	public static void main(String[] args) {
		int[] a = new  int[] {18, 25 ,7 ,36 ,13 ,2,89 ,63};
		int max=a[0];int i;int x=0;
		for( i=0; i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
				
				x=i;
			}
				
		}
		System.out.println(max);
		System.out.print(x);
	}

}
