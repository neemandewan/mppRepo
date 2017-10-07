package assignment05.prob4.personbirthinfo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		IPersonBirthInfo person =  PersonBirthInfoFactory.createPersonDetail("Krishna", LocalDate.of(1990, 12, 25));
		System.out.println(person.getPerson().getName());
		System.out.println(person.getBirthInfo().getDateOfBirth());;
	}

}
