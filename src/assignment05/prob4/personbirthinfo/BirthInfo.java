package assignment05.prob4.personbirthinfo;

import java.time.LocalDate;

public class BirthInfo {
	
	private LocalDate dateOfBirth;
	private Person person;
	
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
