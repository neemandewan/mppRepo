package assignment03.prob2;

import java.util.List;

public class Building {
	private List<Apartment> apts;
	private double maintenance;
	
	protected Building(List<Apartment> apts, double maintenance) {
		this.apts = apts;
		this.maintenance = maintenance;
	}

	public double getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(double maintenance) {
		this.maintenance = maintenance;
	}

	public double getProfit() {
		double sum = 0;
		for(Apartment ap: apts) {
			sum += ap.getRent();
		}
		
		return sum - maintenance;
	}

	@Override
	public String toString() {
		return "Building [apts=" + apts + ", maintenance=" + maintenance + "]";
	}

}
