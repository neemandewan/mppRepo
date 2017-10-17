package assignment05.prob4.personbirthinfo.prob4.personbirthinfo;

import java.time.LocalDate;

import assignment05.prob4.personbirthinfo.PersonBirthInfoFactory;

public class PersonBirthFactory {
	PersonBirthFactory() {
		
	}
	
	public static PersonBirthImpl createPersonDetail(String name, LocalDate dob) {
		return new PersonBirthImpl(new BirthInfo(dob), new Person(name));
	}
}
