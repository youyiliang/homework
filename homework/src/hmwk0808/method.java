package hmwk0808;

public class method {
	
	public static void main(String[] args) {
		
		int x= factorial(5);
		System.out.println(x);
		
		String y= leap_year(1300);
		System.out.println(y);
	}
	//输出数组
	public static int factorial(int a) {
		int fac=1;
		for(int i=1; i<=a;i++) {
			fac=fac*i;
		}
		return fac;
	}
	//输出闰年
	public static String leap_year(int a) {
		String b;
		if(a%400==0 && a%4==0 || a%100!=0 ){
			b="true";
		}else {
			b="false";
		}
		return b;
	}
	//输出质数
	public static int prime(int a) {
		int num=0;
		int i;
		for(i=a;i<300;i++) {
			for(int j=1;j<Math.sqrt(i);j++) {
				if(i%j==0)
					num++;
			}
			
			if(num==1) {
				break;
			}else {
				num=0;
			}
		
		}
			return i;
	}
	
	

}
