package assignment05.prob4.personbirthinfo;

final public class Person {
	
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
	void setPerson(String n) {
		this.name = n;
	}

	public void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}
	
	
}
