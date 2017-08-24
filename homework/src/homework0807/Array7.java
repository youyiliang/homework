package homework0807;

public class Array7 {

	public static void main(String[] args) {
		int[] a = new  int[] {-10 , 2, 3, 246 ,-100 , 0 ,5};
		int max=a[0];
		int x=0,y=0;
		int sum=0 ;
		int min=a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
				x=i;
			}	
		}
		System.out.println("最大数为"+max+"下标为"+x);
		for(int i=0; i<a.length;i++) {
			if(a[i]<min)
			{
				min=a[i];
				y=i;
			}	
		}
		System.out.println("最小数为"+min+"下标为"+y);
		for(int i=0; i<a.length;i++) {
			sum= sum +a[i];
		}
		System.out.println("平均值为"+(double) sum/a.length);
	}

}
