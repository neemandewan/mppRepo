package assignment04.probC;

public class Hourly extends Employee {
	private float hourlyWage;
	private float hoursPerWeek;

	public Hourly(Integer empId, float hourlyWage, float hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public float getHourlyWage() {
		return hourlyWage;
	}

	public float getHoursPerWeek() {
		return hoursPerWeek;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
