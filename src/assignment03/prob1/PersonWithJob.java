package assignment03.prob1;

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
		
		/*
		 * p1 is the child class which has all the information of parent class along with its unique attribute. 
		 * p2 is an instance of parent class with only one attribute i.e. name. 
		 * 
		 * System.out.println("p1.equals(p2)? " + p1.equals(p2));
		 * 
		 * In this code, we are comparing the child class with parent class and hence generates “false” 
		 * because parent class misses one attribute and equals looks for two parameter to compare.
		 * 
		 * System.out.println("p2.equals(p1)? " + p2.equals(p1));
		 * 
		 * In this code, we are comparing parent class with child class and hence generates true because child 
		 * class has all the attributes parent class has. 
		 * 
		 * */
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
