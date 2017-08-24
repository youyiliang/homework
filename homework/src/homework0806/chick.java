package homework0806;

public class chick {

	public static void main(String[] args) {
		int Cock,Hen,Chick; 
		for (Cock=1;Cock<=20;Cock++)
			for(Hen=1; Hen<=33;Hen++)
				for(Chick=3;Chick<=99;Chick++) {
					if(5*Cock+3*Hen+ Chick/3==100 && Cock + Hen + Chick ==100 && Chick%3==0)
						System.out.println("¹«¼¦£¬Ä¸¼¦£¬Ð¡¼¦¸÷"+Cock+","+Hen+","+Chick);
				}
	}

}
