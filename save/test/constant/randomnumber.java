package constant;

public class randomnumber {
	
	public int random() {
		int min = 0; // from
		int max = 9999; // to
		int result = min + (int) (Math.random() * ((max) + 1));
//		System.out.print(result);
		return result;
	}
}
