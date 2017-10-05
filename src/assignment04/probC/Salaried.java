package assignment04.probC;

public class Salaried extends Employee {
	private float salary;

	
	
	public Salaried(Integer empId, float salary) {
		super(empId);
		this.salary = salary;
	}



	public float getSalary() {
		return salary;
	}



	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
	}
}
