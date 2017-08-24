package hmwk0813;


public class vehicle_test {

	public static void main(String[] args) {
		vehicle c1 = new vehicle("benz","black");
		c1.run();
		c1.setSpeed(200);
		c1.run();
		
		car c2 = new car ("Honda","red",2);
		c2.run();
		c2.setSpeed(300);
		c2.run();

	}

}
