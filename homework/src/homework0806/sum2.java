package homework0806;

public class sum2 {

	public static void main(String[] args) {
		int sum1 = 0 ;
		int sum2 = 0 ;
		int i = 1 ;
		while ( i <= 100 ) {
			if (i % 2 == 0) {
				sum1= sum1 + i ;
			}else {
				sum2 =sum2 + i ;
			}
			i++;
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
