package homework0807;

public class Array5 {

	public static void main(String[] args) {
		int[] a = new  int[] {10 ,20, 10,30,30 ,40,50,20,};
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] ) {
					a[j]=0;
				}
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
