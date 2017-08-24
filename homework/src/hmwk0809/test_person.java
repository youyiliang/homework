package hmwk0809;

public class test_person {

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setName("zhangsan");
		p1.setage(33);
		p1.setHeight(1.73);
		Person p2=new Person();
		p2.setName("lisi");
		p2.setage(44);
		p2.setHeight(1.74);
		
		p1.sayHello();
		p2.sayHello();

	}

}
