package hmwk0809;

public class student {
	private String name;
	private int id;
	private int  grades;
	
	public student()
	{}
	public student(String name,int id ,int grades) {
		this.name = name;
		this.id=id;
		this.grades=grades;
	}
	public String getName() {
		return name;
	}
	public void set(String name,int id ,int grades) {
		this.name = name;
		this.id=id;
		this.grades=grades;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrades() {
		return grades;
	}
	public void setGrades(int grades) {
		this.grades = grades;
	}
	
	public void scort(student[] students) {
		for (int i = 0; i<students.length;i++) {
			for (int j=0; j<students.length-1; j++) {
				if(students[j].grades < students[j+1].grades) {
					student d;
					d=students[j];
					students[j]=students[j+1];
					students[j+1]=d;					
				}
			}
		}
		System.out.println("按成绩排序");
		for(int i=0;i<students.length;i++) {
			System.out.println("学生姓名是"+students[i].name+"学生成绩是"+students[i].grades+
					"排名为"+(i+1));
		}
	}
	
}
