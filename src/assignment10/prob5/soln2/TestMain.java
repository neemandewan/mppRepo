package assignment10.prob5.soln2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void testSalaryGreaterThan1000() {
		Employee e1 = new Employee("Joe", "Davis", 120000);
		Employee e2 = new Employee("John", "Sims", 110000);
		Main m = new Main();
		assertTrue(m.salaryGreaterThan1000(e1));
		assertTrue(m.salaryGreaterThan1000(e2));
	}
	
	@Test
	public void testFullName() {
		Employee e1 = new Employee("Krishna", "kc", 110000); //should not be included
		Main m = new Main();
		assertEquals("Krishna kc", m.fullName(e1));
	}

}
