package xiyouclass;

public class Hero {
	
	public String name;
	public String weapon;
	public int zdl;
	public int blood;
	
	public void target() {
		System.out.println("����ȼ�վ��š�����������");
	}
	public void fight(String monsterName , String monsterWeapon ) {
		System.out.println("����ս����"+name +"սʤ��"+monsterName+"������"+monsterWeapon);
	}
//	public void fight(Hero name , Hero weapon ) {
//		System.out.println("����ս����"+name +"սʤ��"+name+"������"+weapon);
//	}
	
}
