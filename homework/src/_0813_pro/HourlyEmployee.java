package _0813_pro;

public class HourlyEmployee extends ColaEmployee {

	private int hour;
	private int hourly;
	
	public HourlyEmployee(String name, int birth,int hour,int hourly) {
		super(name, birth);
		this.hourly = hourly;
		this.hour = hour;
	}

	public int getHour() {
		return hour;
	}

	public int getHourly() {
		return hourly;
	}
	
	
}
