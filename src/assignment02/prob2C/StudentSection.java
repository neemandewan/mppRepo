package assignment02.prob2C;

public class StudentSection {
	public Student student;
	public Section section;
	
	protected StudentSection(Student student, Section section) {
		super();
		this.student = student;
		this.section = section;
	}
	
	protected StudentSection(Section section, Student student) {
		super();
		this.student = student;
		this.section = section;
	}
	
	public Student getStudent() {
        return student;
    }
	
    public Section getSection() {
        return section;
    }
    
    
}
