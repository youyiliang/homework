package bank;

import java.util.ArrayList;
import java.util.List;

import indexs.Indexs;

public class test {

	public static void main(String[] args) {
		Person p1 = new Person("tom","146202199603250089", "15034339898" , 1);
		Person p2 = new Person("tomwe","146202199603250089", "15034339898" , 0);
		
		Account acc1 = new Account( p1, "6217858100011550444","037582");
		Account acc2 = new Account( p2, "6217858100011550666","037587");
		Account acc3 = new Account( p2, "666","123");

		List<Account> accs = new ArrayList<Account>();
		accs.add(acc1);
		accs.add(acc2);
		accs.add(acc3);
		
		Indexs log = new Indexs();
		log.welcome(accs);
		
	}

}
