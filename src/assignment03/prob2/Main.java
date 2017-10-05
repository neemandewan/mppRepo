package assignment03.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apartment> apts = new ArrayList<>();
		apts.add(new Apartment(500));
		apts.add(new Apartment(300));
		apts.add(new Apartment(250));
		apts.add(new Apartment(800));
		apts.add(new Apartment(1100));
		
		List<Apartment> apts1 = new ArrayList<>();
		apts1.add(new Apartment(4000));
		apts1.add(new Apartment(6000));
		apts1.add(new Apartment(5500));
		apts1.add(new Apartment(9000));
		apts1.add(new Apartment(7100));
		
		List<Building> bldgs = new ArrayList<>();
		bldgs.add(new Building(apts, 200));
		bldgs.add(new Building(apts1, 1200));
		
		LandLord ld = new LandLord(bldgs);
		System.out.println(ld);
	}

}
