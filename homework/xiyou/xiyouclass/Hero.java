package xiyouclass;

public class Hero {
	
	public String name;
	public String weapon;
	public int zdl;
	public int blood;
	
	public void target() {
		System.out.println("赶走燃烧军团。。。。。。");
	}
	public void fight(String monsterName , String monsterWeapon ) {
		System.out.println("本场战役中"+name +"战胜了"+monsterName+"掉落了"+monsterWeapon);
	}
//	public void fight(Hero name , Hero weapon ) {
//		System.out.println("本场战役中"+name +"战胜了"+name+"掉落了"+weapon);
//	}
	
}
