package assignment10.prob5.soln1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		List<Employee> value =Arrays.asList(
				  new Employee("John", "Sims", 110000),
		          new Employee("Joe", "Stevens", 200000),
                  new Employee("Andrew", "Reardon", 80000),
                  new Employee("Joe", "Cummings", 760000));
		
		String result = (new Main()).asString(value);
		assertEquals("Joe Stevens", result);
		
	}

}
