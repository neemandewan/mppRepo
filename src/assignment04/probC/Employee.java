package assignment04.probC;

import java.time.LocalDate;

public abstract class Employee {
	private Integer empId;
	
	public Employee(Integer empId) {
		this.empId = empId;
	}

	public void print() {
		LocalDate ld = LocalDate.now();
		calcCompensation(ld.getMonthValue(), ld.getYear()).print();
	}
	
	public Paycheck calcCompensation(int month, int year) {
		return new Paycheck(calcGrossPay(month, year));
	}
	
	public abstract float calcGrossPay(int month, int year);
	
	
}
