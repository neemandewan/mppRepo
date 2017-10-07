package assignment05.prob4.personbirthinfo;

import java.time.LocalDate;

public final class PersonBirthInfoFactory {

	private PersonBirthInfoFactory() {
		
	}
	
	public static IPersonBirthInfo createPersonDetail(String name, LocalDate dob) {
		BirthInfo bInfo = new BirthInfo(dob);
		Person p = new Person(name);
		
		return new PersonBirthInfoImpl(p, bInfo);
	}
}
