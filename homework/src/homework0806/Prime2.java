package homework0806;

public class Prime2 {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=200;i<300;i++){
              for(int k=2;k<=i;k++){
                  if(i%k==0)
                  count++;}
              if(count==1)
       System.out.println(i);
                count=0;
         
        }

	}

}
