package student;

public class Liter extends Student {
	double speekScore;
	double composition;

	public Liter(){
		
	}
	
	public Liter(String name,String id,String sex,int age,double lastScore,double minScore,double speekScore,double composition){
		super(name, id, sex, age, lastScore, minScore);
		this.composition =composition;
		this.speekScore = speekScore;
	}

	
	@Override
	public double getScore() {
		double score =speekScore*0.35+composition*0.35 +getLastScore()*0.15+getMinScore()*0.15;
		return score;
	}

}
