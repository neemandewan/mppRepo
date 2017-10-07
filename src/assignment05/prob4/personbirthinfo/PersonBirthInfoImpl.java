package assignment05.prob4.personbirthinfo;

public final class PersonBirthInfoImpl implements IPersonBirthInfo{
	private Person person;
	private BirthInfo birthInfo;
	
	
	
	public PersonBirthInfoImpl(Person person, BirthInfo birthInfo) {
		super();
		this.person = person;
		this.birthInfo = birthInfo;
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		// TODO Auto-generated method stub
		return birthInfo;
	}

}
