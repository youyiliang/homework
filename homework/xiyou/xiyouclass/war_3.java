package xiyouclass;

public class war_3 {

	public static void main(String[] args) {
		
		Hero samaer = new Hero();
		samaer.name = "Èø¶û";
		samaer.weapon ="È¨ÕÈ";
		samaer.zdl = 8;
		samaer.blood  = 500;
		
		Hero jianna = new Hero();
		jianna.name = "¼ª°²ÄÈ";
		jianna.weapon ="·¨ÕÈ";
		jianna.zdl = 7;
		jianna.blood  = 400;
		

		samaer.target();
		jianna.target();
		
		samaer.fight("°¢¶ûÈøË¹","ËªÖ®°§ÉË");
		samaer.fight(jianna.name, jianna.weapon);
		
	}
}
