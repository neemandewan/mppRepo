package assignment08.prob2.A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.name == e2.name) {
			return Integer.compare(e1.salary, e2.salary);
		}
		
		return e1.name.compareTo(e2.name);
	}
}
