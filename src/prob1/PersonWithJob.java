package prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return person.getName();
	}
	
	PersonWithJob(String n, double s) {
		this.person = new Person(n);
		this.salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob) aPerson;
			boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
			return isEqual;
		}else if(aPerson instanceof Person) {
			Person p = (Person) aPerson;
			boolean isEqual = this.getName().equals(p.getName());
			return isEqual;
		} else return false;
	}
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
