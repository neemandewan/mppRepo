package assignment05.prob4.personbirthinfo.prob4.personbirthinfo;

public class Person {
	private String name;
	private BirthInfo birthInfo;
	
	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthInfo=" + birthInfo + "]";
	}
}
