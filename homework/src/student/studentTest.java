package student;

public class studentTest {
	public static void main(String[] args) {
		
		String sex;
		Student[] a = new Student[5];
		for(int i=0;i<a.length;i++){
			sex ="ÄĞ";
			if(Math.random()<0.5){
				sex = "Å®";
			}
			if(Math.random()*3 >2){
				
				a[i] = new English((int)(Math.random()*1000)+"",(int)(Math.random()*1000000)+"",sex,(int)((Math.random()+0.1)*100),(Math.random()+1)*100,(Math.random()+1)*100,(Math.random()+1)*100);
			
			}else if(Math.random()*3 >1){
				a[i] = new Computer((int)(Math.random()*1000)+"",(int)(Math.random()*1000000)+"",sex,(int)((Math.random()+0.1)*100),(Math.random()+1)*100,(Math.random()+1)*100,(Math.random()+1)*100,(Math.random()+1)*100);
					
			}else{
				
				a[i] = new Liter((int)(Math.random()*1000)+"",(int)(Math.random()*1000000)+"",sex,(int)((Math.random()+0.1)*100),(Math.random()+1)*100,(Math.random()+1)*100,(Math.random()+1)*100,(Math.random()+1)*100);
			}
		}
		for(Student s:a){
			System.out.println(s.toString());
		}

		
	}
}
