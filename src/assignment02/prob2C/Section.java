package assignment02.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Section {
	public Integer sectionNum;
	private List<StudentSection> studentSections = new ArrayList<StudentSection>();
	
	protected Section(Integer sectionNum) {
		super();
		this.sectionNum = sectionNum;
	}

	public List<StudentSection> getStudentSections() {
		return studentSections;
	}
	
	public void addStudent(String name) {
		studentSections.add(new StudentSection(this,new Student(name)));
	}

	@Override
	public String toString() {
		return "Section [sectionNum=" + sectionNum + "]";
	}
	
	
}
