package homework0806;

public class horse {

	public static void main(String[] args) {
		int	lh, mh,sh; 
		for (lh=1;lh<=33;lh++)
			for(mh=1; mh<=50;mh++)
				for(sh=2;sh<=99;sh++) {
					if( 3*lh + 2*mh + sh/2 == 100 && lh + mh + sh == 100 && sh%2==0)
						System.out.println("大马，中马，小马"+lh+","+mh+","+sh);
				}

	}

}
