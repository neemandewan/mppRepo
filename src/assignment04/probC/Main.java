package assignment04.probC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee hourly = new Hourly(21, 5, 40);
		hourly.print();
		
		Employee salaried = new Salaried(22, 4000);
		salaried.print();
		
		LocalDate date = LocalDate.now();
		LocalDate d1 = LocalDate.of(date.getYear(), date.getMonthValue()-1, 1);
		LocalDate d2 = LocalDate.of(date.getYear(), date.getMonthValue()-2, 2);
		LocalDate d3 = LocalDate.of(date.getYear(), date.getMonthValue()-3, 23);
		LocalDate d4 = LocalDate.of(date.getYear(), date.getMonthValue()-4, 14);
		LocalDate d5 = LocalDate.of(date.getYear(), date.getMonthValue()-1, 15);
		
		List<Order> list = new ArrayList<>();
		list.add(new Order(1, d1, 200));
		list.add(new Order(1, d2, 300));
		list.add(new Order(1, d3, 400));
		list.add(new Order(1, d4, 500));
		list.add(new Order(1, d5, 100));
		
		Employee commissioned = new Commissioned(23, 10, 2000, list);
		commissioned.print();
	}

}

/**
	Paycheck [getGrossPay()=800.0, getNetPay()=484.0]
	Paycheck [getGrossPay()=4000.0, getNetPay()=2420.0]
	Paycheck [getGrossPay()=5000.0, getNetPay()=3025.0]
*/
