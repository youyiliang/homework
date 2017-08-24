package homework0806;

public class sum {

	public static void main(String[] args) {
		
		int sum=0 ;
		
		for (int i = 1; i < 101 ; i++) {
			if(i % 10 !=3) {
			sum = i + sum;
			}
		}
		System.out.print(sum);
	}

}
