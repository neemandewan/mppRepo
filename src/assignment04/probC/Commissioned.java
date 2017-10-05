package assignment04.probC;

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

	public float getCommission() {
		return commission;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public List<Order> getOrder() {
		return order;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
