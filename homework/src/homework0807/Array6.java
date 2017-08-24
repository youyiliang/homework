package homework0807;

public class Array6 {

	public static void main(String[] args) {
		int[] a = new  int[] {2,4,6,7,8};
		int[] b = new int [a.length];
		
		for(int i=0; i<a.length;i++) {
			b[i]=a[i];
		}
		for (int i=0; i<a.length; i++) {
			a[i]=b[a.length-i-1];
			System.out.println(a[i]);
		}
	}

}
