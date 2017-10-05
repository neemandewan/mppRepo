package prob2;

import java.util.List;

public class LandLord {
	private List<Building> bldgs;
	
	protected LandLord(List<Building> bldgs) {
		this.bldgs = bldgs;
	}

	public double getTotalProfit( ) {
		double sum = 0;
		
		for(Building bldg: bldgs) {
			sum += bldg.getProfit();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "LandLord [getTotalProfit()=" + getTotalProfit() + "]";
	}
}
