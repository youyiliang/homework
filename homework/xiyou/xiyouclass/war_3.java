package xiyouclass;

public class war_3 {

	public static void main(String[] args) {
		
		Hero samaer = new Hero();
		samaer.name = "����";
		samaer.weapon ="Ȩ��";
		samaer.zdl = 8;
		samaer.blood  = 500;
		
		Hero jianna = new Hero();
		jianna.name = "������";
		jianna.weapon ="����";
		jianna.zdl = 7;
		jianna.blood  = 400;
		

		samaer.target();
		jianna.target();
		
		samaer.fight("������˹","˪֮����");
		samaer.fight(jianna.name, jianna.weapon);
		
	}
}
