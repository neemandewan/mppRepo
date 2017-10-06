package assignment04.probC;

public class Hourly extends Employee {
	private float hourlyWage;
	private float hoursPerWeek;
	private final int WEEKS_IN_A_MONTH = 4;

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
	public float calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return hourlyWage*hoursPerWeek*WEEKS_IN_A_MONTH;
	}
	
	

}
