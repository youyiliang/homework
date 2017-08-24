package homework0807;

public class Array3 {

	public static void main(String[] args) {
		int[] a = new  int[] {1,6,2,3,9,4,5,7,8};
		for(int i=0; i<a.length;i++) {
					System.out.println(a[i]);
		}

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
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
			}
	}

}
