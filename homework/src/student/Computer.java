package student;

public class Computer extends Student {
	private  double makeScore;	
	private  double engScore;	
	 
	public Computer() {
		
	}
	public Computer(String name,String id ,String sex, int age,double lastScore,double minScore,double makeScore,double engScore) {
		super(name, id ,sex ,age ,lastScore,minScore);
		
		this.engScore = engScore;
		this.makeScore = makeScore;
		
	}
	@Override
	public double getScore() {
		double score =  makeScore * .4 +engScore * .2+ getLastScore()*.2 + getLastScore()*.2;
		return score;
	}

}
