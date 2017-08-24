package homework0807;

public class Array2 {

	public static void main(String[] args) {
		int[] a = new  int[] {10 ,20, 30 ,40,50};
		int[] b = new int [a.length];
		
		for(int i=0; i<a.length;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}

}
