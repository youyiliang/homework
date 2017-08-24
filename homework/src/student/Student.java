package student;

public abstract class Student {
	private String name;
	private String id;
	private String sex;
	private int   age;
	private double lastScore;
	private double minScore;
	
	public Student() {
		
	}
	
	public Student (String name,String id ,String sex, int age,double lastScore,double minScore ) {
		this.name = name;
		this.id  = id;
		this.sex = sex;
		this.age = age;
		this.lastScore = lastScore;
		this.minScore = minScore;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public double getLastScore() {
		return lastScore;
	}

	public double getMinScore() {
		return minScore;
	}
	
	public abstract double getScore();
	
	@Override
	public String toString() {
		return "学生 [姓名=" + name + ", id=" + id + ", 性别=" + sex + ", 年龄=" + age + ", 期末考试成绩=" + lastScore
				+ ", 期中考试成绩=" + minScore +",综合成绩"+getScore()+"]";
	}
	
	
	
}
