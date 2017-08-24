package _0813_fruit;

import java.util.Scanner;

public class Gardener {
	public Fruit creat(String name) {
		Fruit f =null;
	
		if(name.equals("apple")) {
			f = new Apple();
		}
		else if(name.equals("banana")) {
			f = new Banana();
		}
		else if(name.equals("grapes")) {
			f = new Grapes();
		}else System.out.print("≤ªª·÷–");
		return f;
	}
}
