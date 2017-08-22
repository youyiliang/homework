package bank_0_1;

public class Person {
	
	private String name;
	private String  ID;
	private String  phone;
	
	private int sex;
	
	public Person() {
		
	}
	public Person (String name , String id ,String phone , int sex) {
		this.name =name;
		this.ID = id;
		this.phone = phone;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public String getPhone() {
		return phone;
	}
	public int getSex() {
		return sex;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [姓名=" + name + ", 身份证号：" + ID + ", 电话：" + phone + ", 性别：" + sex + "]";
	}
	
	
	

}
