package homework0807;
import java.util.*;
public class answer {
	
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   int a[] = new int[5];
		System.out.println("��������������������-1��ʾ��������");
		   int i=0,j;
		   do{
		      a[i]=s.nextInt();
		      i++;
		   }while (a[i-1]!=-1);
		   System.out.println("�����������Ϊ��");
		   for( j=0; j<i-1; j++) {
		    System.out.print(a[j]+"   ");
		}
		   System.out.println("\n�����������Ϊ��");
		   for( j=i-2; j>=0; j=j-1) {
		    System.out.print(a[j]+"   ");
		}
		    }


	
}
