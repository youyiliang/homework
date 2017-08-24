package homework0806;

public class grade {

	public static void main(String[] args) {
		int a=100;
		a=a/10;
		switch(a) {
			case 0 :
			case 1 :
			case 2 :	
			case 3 :
			case 4 :
			case 5 :
				System.out.print("你成绩是：E");
				break;
			case 6 :
				System.out.print("你成绩是：D");
				break;
			case 7 :
				System.out.print("你成绩是：C");
				break;
			case 8 :
				System.out.print("你成绩是：B");
				break;
			case 9 :
			case 10 :
				System.out.print("你成绩是：A");
				break;
		}

	}

}
