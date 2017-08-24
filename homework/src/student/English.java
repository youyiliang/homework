package student;

public class English extends Student{
	 
	private double  speekScore;
	public English() {
		
	}
	public English(String name,String id ,String sex, int age,double lastScore,double minScore,double speekScore) {
		super(name, id ,sex ,age ,lastScore,minScore);
		
		this.speekScore = speekScore;
		
		
	}
	@Override
	public double getScore() {
		double score;
		score =  speekScore* 0.5 + getLastScore() * 0.25 +getMinScore() *.25;
		return  score;
	}
	
}
