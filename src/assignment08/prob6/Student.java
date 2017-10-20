package assignment08.prob6;

public class Student {
	
	private String name;
	private int rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	protected Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) return false;
		if(!(obj instanceof Student)) return false;
		Student s = (Student) obj;
		return s.name.equals(name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}
