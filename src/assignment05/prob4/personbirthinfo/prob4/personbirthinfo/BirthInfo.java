package assignment05.prob4.personbirthinfo.prob4.personbirthinfo;

import java.time.LocalDate;

public class BirthInfo {
	private LocalDate dateOfBirth;
	
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	@Override
	public String toString() {
		return "BirthInfo [dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
}
