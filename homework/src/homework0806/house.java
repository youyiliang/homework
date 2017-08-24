package homework0806;

public class house {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for( int j=1;j<=10;j++) {
				if(i == 1 || i==10 ||j ==1|| j ==10) {
						System.out.print("*");
					}else {
						System.out.print("@");
					}
			
				}
			System.out.println();
			for (int k = 0; k < i ; k++) {
				System.out.print("#");
			}
		}System.out.println();
			for (int x=1; x<=6;x++) {
				for(int y=1; y<=20;y++) {
					if(x == 1 || x==6 ||y ==1|| y ==20) {
						System.out.print("$");
					}else {
						System.out.print("%");
					}
					
				}
				System.out.println();
			}
	}

}
