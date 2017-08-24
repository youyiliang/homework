package homework0807;

public class morearr {
	
	public static void main(String[] args) {
		int[] a = new  int[] {10 ,20, 30 ,40,50 ,20};
		int[] b = new  int[] {80 ,27, 30 ,45,40,35};
//		int[] arr = new int[a.length + 1];
//		 arr=morarr(a,60);
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int i=0; i<a.length+b.length-1;i++) {
//			System.out.print(addarr(a,b)[i]+" ");
//		}
		int x = findarr(a, 20 );
		System.out.println(x);
//		int [] result =removeElement(a,3);
//		int [] result =removeElementINdex(a, 1);
		
//		int [] result = cutPastArray(a, 2, b, 3, 2);
//		System.arraycopy(a, 2, b, 3, 2);
//		printArray(result);
		bubble_sort_desc(b);
		
//		printArray(x);
	
		
	}
	//数组降序
	static void bubble_sort_desc(int [] a) {
		for (int i=1; i<a.length;i++)
			for(int j=0;j<a.length-1;j++ ) {
				if(a[j]<a[j+1]) {
					int t;
					t= a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
	}
	//数组排序升序
	static void bubble_sort_asc(int [] a) {
		for (int i=1; i<a.length;i++)
			for(int j=0;j<a.length-1;j++ ) {
				if(a[j]>a[j+1]) {
					int t;
					t= a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
	}
	//数组输出
	static void printArray(int [] arr) {
		for (int i : arr) {
			System.out.print(i+"  ");
		}
	}
	//查找数字 ，输出下标
	static int findarr(int[] a, int b) {
		int x = -1;
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] == b) {
				x=i;
			}
		}
		return x;
	}
	//两数组相加
	static int[] addarr(int[] a,int[] b) {
		int [] x= new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			x[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			x[a.length-1+i]=b[i];
		}
		return x;
	}
	//在末尾，添加数字
	static int[] morarr(int[] b, int x) {
		int[] arr = new int[b.length + 1];
		int i;
		for( i=0 ; i<b.length ; i++) {
			arr[i]=b[i];
		}
		arr[i]=x;

		return arr;
		
	}
	//按个数删除元素之后的数据
	static int [] removeElement(int [] arr , int a) {
		
		int [] result= new int[a];
		for(int i=0; i<a ;i++) {
			result[i]=arr[i];
		}
		
		return result;
	}
	//数组剪贴
	static int [] cutPastArray(int [] a,int b ,int[] c,int d,int e ) {
		for(int i=d ,j=0; i<=e;j++,i++) {
			c[i]=a[b+j];
		}
		
		return c;
	}
	//按下标删除元素
	static int [] removeElementINdex(int [] arr , int a) {
		int [] result= new int[arr.length-1];
		
		for(int i=0; i<a ;i++) {
			result[i]=arr[i];
		}
		for(int i=a ; i<arr.length-1;i++) {
			result[i]=arr[i+1];
		}
		
		return result;
	}
}