package bank_0_1;

import java.awt.List;


public class Account{
	
	private String BID ;
	private String password;
	
	private Person person;
	
	private  Money money;
	
	
	public Account() {
		
	}
	public Account(Person person ,String BID , String password ) {
		this.person=person;
		this . BID = BID;
		this .password = password;
		this.money = new Money(0,0);
		
	}
	
	
	
	public String getBID() {
		return BID;
	}
	public String getPassword() {
		return password;
	}
	public Person getPerson() {
		return person;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public Money getMoney() {
		return money;
	}
	@Override
	public String toString() {
		return "-------凭条-------"+"\n"+"账户号:" + BID + "\n"+ "个人信息:" + person +"\n"+ "账目信息:" + money ;
	}
	
	
	
 
	

}
