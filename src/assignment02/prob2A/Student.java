package assignment02.prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	protected Student() {
		super();
	}

	protected Student(String name, GradeReport gradeReport) {
		super();
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
