package hmwk0809;

public class point {
	
	private int x;
	private int y;
	
	public point () {
		
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move (int x0,int y0) {
		
		this.x=this.x + x0;
		this.y=this.y + y0;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
