package assignment04.probC;

public abstract class Employee {
	private Integer empId;
	
	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}

	public void print() {
		
	}
	
	public Paycheck calcCompensation(int month) {
		return new Paycheck();
	}
	
	public abstract double calcGrossPay();
}
