package assignment05.prob4.personbirthinfo.prob4.personbirthinfo;

import java.time.LocalDate;

public class PersonBirthImpl {
	private BirthInfo birthInfo;
	private Person person;

	protected PersonBirthImpl(BirthInfo birthInfo, Person person) {
		super();
		this.birthInfo = birthInfo;
		this.person = person;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

	public void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PersonBirthImpl [birthInfo=" + birthInfo + ", person=" + person + "]";
	}
	
	

}
