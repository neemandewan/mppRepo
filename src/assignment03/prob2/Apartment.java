package assignment03.prob2;

public class Apartment {
	private double rent;

	protected Apartment(double rent) {
		this.rent = rent;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Apartment [rent=" + rent + "]";
	}
	
	
}
