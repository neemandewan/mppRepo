package assignment03.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob) aPerson;
			boolean isEqual = this.getName().equals(p.getName());
			return isEqual;
		}else if(aPerson instanceof Person) {
			Person p = (Person) aPerson;
			boolean isEqual = this.getName().equals(p.getName());
			return isEqual;
		} else return false;
	}
	
	public static void main(String[] args) {
		
	}

}
