package homework0806;

public class Prime {

	public static void main(String[] args) {
		int count=0,co=0;
		int i=200;
		while (co==1) {
			for(int k=2;k<=i;k++){
                  if(i%k==0)
                  count++;
                  i++;
                  }
			if(count==1)
				co=1;
		}
       System.out.println(i);
         
        }

	}

