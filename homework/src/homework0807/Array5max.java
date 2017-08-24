package homework0807;

public class Array5max {

	public static void main(String[] args) {
		int[] a = new  int[] {18, 25 ,7 ,36 ,13 ,2, 89 ,63};
		for(int i=1;i<a.length;i++)
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) 
				{
					int t;
					t=a[j];
					a[j]=a[j+1];
					a[j+1] = t;
				}
			}
		System.out.print(a[a.length-1]);
		
	}

}
