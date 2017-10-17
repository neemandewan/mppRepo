package assignment05.prob4.personbirthinfo.prob4.personbirthinfo;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		PersonBirthImpl birthImpl = PersonBirthFactory.createPersonDetail("krishna", LocalDate.now());
		System.out.println(birthImpl);
	}
	
	
	
}
