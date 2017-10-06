package assignment04.probC;

import java.time.LocalDate;
import java.util.List;


public class Commissioned extends Employee {
	
	private float commission;
	private float baseSalary;
	private List<Order> order;

	public Commissioned(Integer empId, float commission, float baseSalary,
			List<Order> order) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.order = order;
	}

	@Override
	public float calcGrossPay(int month, int year) {
		LocalDate ld = LocalDate.of(year, month, 1);
		float sum = 0;
		int currentMonth, currentYear, prevMonth, prevYear;
		
		for(Order od: order) {
			currentMonth = ld.getMonthValue();
			currentYear = ld.getYear();
			prevMonth = od.getOrderDate().getMonthValue();
			prevYear = od.getOrderDate().getYear();
			
			if((currentMonth - prevMonth == 1 && currentYear==prevYear ) 
					|| (currentMonth== 1 && prevMonth == 12 && currentYear - prevYear == 1)) {
				sum += od.getOrderAmount();
			}
		}
		
		return baseSalary + sum*commission;
		
	}
	
}
