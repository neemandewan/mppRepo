package assignment02.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	private List<StudentSection> studentSections = new ArrayList<StudentSection>();
	
	protected Student(String name) {
		super();
		this.name = name;
	}

	public List<StudentSection> getStudentSections() {
		return studentSections;
	}
	
	public void addSection(Integer secNum) {
		studentSections.add(new StudentSection(this,new Section(secNum)));
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
