package buycart;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Java�����ŵ���ͨ", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		
		RecInfo rec1 = new RecInfo(1, "�ǻ۹�Ԣ", "����-jack", true);
		RecInfo rec2 = new RecInfo(1, "neusoft����", "�����ӳ�-boss", false);
		RecInfo[] infos = { rec1 , rec2 };
		
		c1.setRecInfos(infos);
		
		Item item01 = new Item(p1 , 2 );
		Item item02 = new Item(p2 , 6 );
		Item item03 = new Item(p2 , 1);
		
		Item[] items = { item01 , item02 , item03};
		
		BuyCart cart = new BuyCart();
		
		cart.setItems(items);
		
		//������  , ����������������������������
		cart.handler();
		
		//////////////////////
		//�鿴���ﳵ
		cart.showBuyCart();
		
		////////////////////
		//���ɶ���   �������.....
		System.out.println("�µ�............");
		
		System.out.println("");
		
		long time = System.currentTimeMillis(); //��ȡ��ǰʱ��� long ֵ , ע : [ ʱ���ǿ����� long �������� ]
		Date now = new Date(); // ��ȡ��ǰϵͳʱ��

		//String.valueOf(time)   ����  ����������������� ת��Ϊ �ַ��� , �˴��� �� long ת��Ϊ String 
		Orders order = new Orders( String.valueOf(time) , now , rec1 , cart  );  
		System.out.println(order);
		
		
	}
	

}
