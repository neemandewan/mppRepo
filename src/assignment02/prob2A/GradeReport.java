package assignment02.prob2A;

public class GradeReport {
	private Student student;
	
	public GradeReport(Student student) {
		this.student = new Student(student.getName(), this);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
